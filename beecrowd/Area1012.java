import java.util.Locale;
import java.util.Scanner;

public class Area1012 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		//Area do triângulo retângulo: b * h / 2
		double areaTriangulo = A * C / 2.0;
		
		//Área do círculo: pi * r^2
		double areaCirculo = 3.14159 * Math.pow(C, 2.0);
		
		//Área do trapézio: (B + b) * h / 2
		double areaTrapezio = (A + B) * C / 2.0;
		
		//Área do quadrado: L^2
		double areaQuadrado = Math.pow(B, 2.0);
		
		//Área do retangulo: b * h
		double areaRetangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		sc.close();

	}

}
