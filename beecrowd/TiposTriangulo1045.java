import java.util.Locale;
import java.util.Scanner;

public class TiposTriangulo1045 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, maiorA, maiorB=0, maiorC=0;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		maiorA = Math.max(a, Math.max(b, c));
		
		if (maiorA == a) {
			maiorB = Math.max(b, c);
			maiorC = Math.min(b, c);
		}
		
		if (maiorA == b) {
			maiorB = Math.max(a, c);
			maiorC = Math.min(a, c);
		}
		
		if (maiorA == c) {
			maiorB = Math.max(a, b);
			maiorC = Math.min(a, b);
		}
		
		if (maiorA >= maiorB + maiorC) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else {
			if (maiorA * maiorA == maiorB * maiorB + maiorC * maiorC) {
				System.out.println("TRIANGULO RETANGULO");
			}
			else if (maiorA * maiorA > maiorB * maiorB + maiorC * maiorC) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			else {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			
			if (maiorA == maiorB && maiorB == maiorC) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			else if (maiorA == maiorB || maiorA == maiorC || maiorB == maiorC) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		
		sc.close();

	}

}
