import java.util.Locale;
import java.util.Scanner;

public class ProblemaMaiorPosicao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		double[] vet = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}

		double maior = 0;
		int maiorPosicao = 0;  // varial para guardar a posição do vetor
		for (int i = 0; i < n; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				maiorPosicao = i; // Para acessar a posição da varial utilizamos o start inicio e o incremento
			}
		}

		System.out.printf("MAIOR VALOR = %.1f\n", maior);
		System.out.printf("POSIÇÃO DO MAIOR VALOR = %d\n", maiorPosicao);

		sc.close();

	}

}
