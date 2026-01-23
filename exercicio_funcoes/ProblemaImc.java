import java.util.Locale;
import java.util.Scanner;

public class ProblemaImc {

	/**
	 * Parametros:
	 * @param p: peso do usuário
	 * @param a: altura da usuário
	 * @return: indice de massa corporal do usuario
	 */
	static double imc(double p, double a) {
		double imc = p / Math.pow(a, 2);
		return imc;
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o peso: ");
		double peso = sc.nextDouble();
		System.out.print("Digite a altura: ");
		double altura = sc.nextDouble();

		double resultadoIMC = imc(peso, altura);

		System.out.printf("IMC = %.2f\n", resultadoIMC);

		sc.close();

	}

}
