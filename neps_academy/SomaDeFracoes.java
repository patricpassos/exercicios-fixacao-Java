import java.util.Scanner;

public class SomaDeFracoes {

	public static long calculoNumerador(long a, long d, long c, long b) {
		return a * d + c * b;
	}

	public static long calculoDenominador(long b, long d) {
		return b * d;
	}

	public static long calculoMdc(long numerador, long denominador) {
		return denominador == 0 ? numerador : calculoMdc(denominador, numerador % denominador);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a, b, c, d;

		a = sc.nextLong();
		b = sc.nextLong();

		c = sc.nextLong();
		d = sc.nextLong();

		long numeradorFinal = calculoNumerador(a, d, c, b);
		long denominadorFinal = calculoDenominador(b, d);
		long mdc = Math.abs(calculoMdc(numeradorFinal, denominadorFinal));

		long numeradorIrredutivel = numeradorFinal / mdc;
		long denominadorIrredutivel = denominadorFinal / mdc;

		System.out.print(numeradorIrredutivel + " " + denominadorIrredutivel);

		sc.close();

	}

}
