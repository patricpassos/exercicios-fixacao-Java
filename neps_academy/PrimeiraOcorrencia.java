import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeiraOcorrencia {

	public static int primeiraOcorrencia(int alvo, int[] vet) {
		for (int i = 0; i < vet.length; i++) {
			if (alvo == vet[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static int ocorrrenciaStreams(int alvo, int[] vet) {	
		return IntStream.range(0, vet.length).filter(i -> vet[i] == alvo).findFirst().orElse(-1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int[] vet = new int[n];

		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextInt();
		}

		int alvo = sc.nextInt();

		System.out.println(primeiraOcorrencia(alvo, vet));

		sc.close();

	}

}
