import java.util.Arrays;
import java.util.Scanner;

public class SomaVetorMetodo {
	
	public static int somarVetor(int[] vet) {
		int soma = 0;
		for(int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		return soma;
	}
	
	public static int somarVetorStreams(int[] vet) {
		int soma = Arrays.stream(vet).sum();
		return soma;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] vet = new int[n];
		
		for(int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}
		
		int somarVetor = somarVetor(vet);
		
		System.out.println(somarVetor);
		
		System.out.println(somarVetorStreams(vet));
		
		sc.close();

	}

}
