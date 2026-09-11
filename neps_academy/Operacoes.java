import java.util.Locale;
import java.util.Scanner;

public class Operacoes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char operacao = sc.next().toUpperCase().charAt(0);
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		if (operacao == 'M') {
			double multiplicacao = a * b;
			System.out.printf("%.2f", multiplicacao);
		} else if (operacao == 'D') {
			if (b == 0.0) {
				System.out.println("ERRO Matemático");
			} else {
				double divisao = a / b;
				System.out.printf("%.2f", divisao);
			}
		}

		sc.close();

	}

}
