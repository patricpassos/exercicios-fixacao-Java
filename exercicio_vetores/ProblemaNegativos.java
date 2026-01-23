import java.util.Scanner;

public class ProblemaNegativos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();

		int[] vet = new int[n]; // criação do vetor com as posições indicadas pelo usuario

		// Entrada de dados dentro do vetor
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}

		System.out.println("NUMEROS NEGATIVOS:");

		// Leitura de dados que estão armazenados dentro do vetor
		for (int i = 0; i < n; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}

		sc.close();

	}

}
