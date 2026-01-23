import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemploAreaTriangulo {

	static double areaTriangulo(double a, double b, double c) {
		double p = (a + b + c) / 2;
		return p = Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com as medidas do triângulo X:");
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double x3 = sc.nextDouble();

		System.out.println("\nEntre com as medidas do triângulo Y:");
		double y1 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double y3 = sc.nextDouble();

		double resultadoAreaX = areaTriangulo(x1, x2, x3);
		double resultadoAreaY = areaTriangulo(y1, y2, y3);

		System.out.printf("\nArea de X = %.4f\n", resultadoAreaX);
		System.out.printf("Area de Y = %.4f\n", resultadoAreaY);

		sc.close();

	}

}
