import java.util.Locale;
import java.util.Scanner;

public class CasalXelinho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int xelim = sc.nextInt();

		int pence = xelim * 5;
		double libras = pence / 100.0;
		double real = libras * 6.18;

		int centavos = (int) Math.ceil(real * 100.0);

		int resto = centavos % 5;
		if (resto != 0) {
			centavos = centavos + (5 - resto);
		}

		double valorDeposito = centavos / 100.0;

		System.out.printf("R$ %.2f\n", valorDeposito);

		sc.close();

	}

}
