import java.util.Locale;
import java.util.Scanner;

public class ProblemaAbaixoDaMedia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		double[] vet = new double[n];

		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
			
		}
		
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vet[i];
		}

		double media = (double) soma / n;
		System.out.println();
		System.out.printf("MÉDIA DO VETOR = %.3f\n", media);
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		for (double s : vet) {
			if (s < media) {
				System.out.println(s);
			}
		}

		sc.close();

	}

}
