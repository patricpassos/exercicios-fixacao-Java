import java.util.Locale;
import java.util.Scanner;

public class Triangulo1043 {

	public static void main(String[] args) {
		
		/**
		 * Condições para formação de um triangulo:
		 * a + b > c
		 * a + c > b
		 * b + c > a
		 */
		//System.out.println(studentGrade >= 60 ? "Passed" : "Failed");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a , b , c, perimetro, areaTrapezio;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if (a + b > c && a + c > b && b + c > a) {
			perimetro = a + b + c;
			System.out.printf("Perimetro = %.1f%n", perimetro);
		}
		else {
			areaTrapezio = (a + b) * c / 2;
			System.out.printf("Area = %.1f%n", areaTrapezio);
		}
		
		sc.close();
		
		
	}

}
