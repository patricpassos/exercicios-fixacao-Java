import java.util.Locale;
import java.util.Scanner;

public class ProblemaDardo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, maior;

		System.out.println("Digite as tres distancias: ");

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		maior = a;
		if (a > b && a > c) {
			maior = a;
		} 
		else if (b > a && b > c) {
			maior = b;
		} 
		else {
			maior = c;
		}

		System.out.println("MAIOR DISTANCIA = " + maior);

		sc.close();

	}

}
