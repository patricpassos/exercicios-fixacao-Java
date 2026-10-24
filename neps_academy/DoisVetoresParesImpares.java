import java.util.Arrays;
import java.util.Scanner;

class Vetor {

	public int[] vet = new int[10];

	public int quantidadePares() {
		int qtdPares = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				qtdPares++;
			}
		}
		return qtdPares;
	}

	public int quantidadeImpares() {
		int qtdImpares = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 != 0) {
				qtdImpares++;
			}
		}
		return qtdImpares;
	}

	public int[] vetorPares(int qtdPares) {
		int[] vetPares = new int[qtdPares];

		int posicao = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				vetPares[posicao] = vet[i];
				posicao++;
			}
		}
		return vetPares;
	}

	public int[] vetorImpares(int qtdImpares) {
		int[] vetImpares = new int[qtdImpares];

		int posicao = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 != 0) {
				vetImpares[posicao] = vet[i];
				posicao++;
			}
		}
		return vetImpares;
	}
	
	//--------------------------------------------------------------------------------------
	public int[] vetorParesStreams() {
		return Arrays.stream(vet).filter(x -> x % 2 == 0).toArray();
	}
	
	public int[] vetorImparesStreams() {
		return Arrays.stream(vet).filter(x -> x % 2 != 0).toArray();
	}

}

public class DoisVetoresParesImpares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Vetor vetor = new Vetor();

		for (int i = 0; i < vetor.vet.length; i++) {
			vetor.vet[i] = sc.nextInt();
		}

		int qtdPares = vetor.quantidadePares();
		int qtdImpares = vetor.quantidadeImpares();

		int[] vetorPares = vetor.vetorPares(qtdPares);
		int[] vetorImpares = vetor.vetorImpares(qtdImpares);

		for (int p : vetorPares) {
			System.out.print(p + " ");
		}

		System.out.println();
		for (int i : vetorImpares) {
			System.out.print(i + " ");
		}
		
		//-----------------------------------------------------------------------------------------
		int[] vetorParesStreams = vetor.vetorParesStreams();
		int[] vetorImparesStreams = vetor.vetorImparesStreams();
		
		Arrays.stream(vetorParesStreams).forEach(p -> System.out.println(p + " "));
		System.out.println();
		Arrays.stream(vetorImparesStreams).forEach(i -> System.out.println(i + " "));
 
		sc.close();	

	}

}
