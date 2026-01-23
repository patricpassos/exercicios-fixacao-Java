import java.util.Locale;
import java.util.Scanner;

public class ProblemaRetanguloFuncoes {

	static double diagonalRetangulo(double b, double a) {
		double diagonal = Math.pow(b, 2) + Math.pow(a, 2);
		return Math.sqrt(diagonal);
	}

	static double areaRetangulo(double b, double a) {
		double area = b * a;
		return area;
	}
	
	static double perimetroRetangulo(double b, double a) {
		double perimetro = b + a;
		return perimetro * 2;
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor da base do retangulo: ");
		double base = sc.nextDouble();
		System.out.print("Digite o valor da alura do retangulo: ");
		double altura = sc.nextDouble();

		System.out.printf("Diagonal = %.2f\n", diagonalRetangulo(base, altura));
		System.out.printf("Área = %.2f\n", areaRetangulo(base, altura));
		System.out.printf("Perimetro = %.2f\n", perimetroRetangulo(base, altura));

		sc.close();

	}

}
