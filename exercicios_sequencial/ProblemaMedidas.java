import java.util.Locale;
import java.util.Scanner;

public class ProblemaMedidas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a medida A: ");
		double medidaA = sc.nextDouble();

		System.out.print("Digite a medida B: ");
		double medidaB = sc.nextDouble();

		System.out.print("Digite a medida C: ");
		double medidaC = sc.nextDouble();

		double areaQuadrado = medidaA * medidaA;
		double areaTriangulo = medidaA * medidaB / 2;
		double areaTrapezio = (medidaA + medidaB) * medidaC / 2;

		System.out.printf("AREA DO QUADRADO = %.4f%n", areaQuadrado);
		System.out.printf("AREA DO TRIANGULO = %.4f%n", areaTriangulo);
		System.out.printf("AREA DO TRAPEZIO = %.4f%n", areaTrapezio);

		sc.close();

	}

}
