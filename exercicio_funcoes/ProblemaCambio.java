import java.util.Locale;
import java.util.Scanner;

public class ProblemaCambio {
	
	/**
	 * Parametros:
	 * @param a: valor da cotação em dolar
	 * @param b: valor em reais
	 * @return: retornar o valor equivalente em dólares
	 */
	static double cotacao (double a, double b) {
		double c = b / a;
		return c;
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a cotação do dolar: ");
		double dolar = sc.nextDouble();
		System.out.print("Digite a quantidade em reais: ");
		double real = sc.nextDouble();
		
		System.out.printf("Você pode comprar %.2f dolares com esta quantia", cotacao(dolar, real));
		
		sc.close();

	}

}
