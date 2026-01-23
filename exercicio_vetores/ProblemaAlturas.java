import java.util.Locale;
import java.util.Scanner;

public class ProblemaAlturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %dª pessoa:\n", i + 1); // utilizado a varial i + 1
			System.out.print("Nome: ");
			nome[i] = sc.next();
	        System.out.print("Idade: ");
	        idade[i] = sc.nextInt();
	        System.out.print("Altura: ");
	        altura[i] = sc.nextDouble();
		}
		
		double somaAltura = 0.0;
		int contMenorIdade16 = 0;
		for (int i = 0; i < n; i++) {
			somaAltura += altura[i];
			if (idade[i] < 16) {
				contMenorIdade16++;
			}
		}
		
		double media = somaAltura / n;
		double percentualMenor16 = (double) contMenorIdade16 / n * 100;
		
		System.out.printf("Altura média = %.2f\n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenor16);
		
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.printf("%s\n", nome[i]);
			}
		}

		sc.close();

	}

}
