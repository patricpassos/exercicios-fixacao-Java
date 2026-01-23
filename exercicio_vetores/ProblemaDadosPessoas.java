import java.util.Locale;
import java.util.Scanner;

public class ProblemaDadosPessoas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		double[] altura = new double[n];
		char[] sexo = new char[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %d° pessoa: ", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %d° pessoas: ", i + 1);
			sexo[i] = sc.next().charAt(0);
		}

		double menorAltura = altura[0];
		double maiorAltura = altura[0];
		for (int i = 0; i < n; i++) {
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
		}

		double somaFeminino = 0.0;
		int contFeminino = 0;
		int contMasculino = 0;
		for (int i = 0; i < n; i++) {
			if (sexo[i] == 'F') {
				somaFeminino += altura[i];
				contFeminino++;
			} else {
				contMasculino++;
			}
		}

		double mediaFeminino = (double) somaFeminino / contFeminino;

		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior Altura = %.2f\n", maiorAltura);

		if (contFeminino == 0) {
			System.out.println("Não foram cadastrado pessoas do sexo feminino");
		} else {
			System.out.printf("Média das alturas das mulheres = %.2f\n", mediaFeminino);
		}

		if (contMasculino == 0) {
			System.out.println("Não foram cadastrado pessoas do sexo masculino");
		} else {
			System.out.println("Numero de homens = " + contMasculino);
		}

		sc.close();

	}

}
