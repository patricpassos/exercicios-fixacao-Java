import java.util.Locale;
import java.util.Scanner;

public class ProblemaBaskara {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta, raizA, raizB;
		
		//Leitura dos coeficientes da equação;
		
		System.out.print("Coeficiente a: ");
		a = sc.nextDouble();
		
		System.out.print("Coeficiente b: ");
		b = sc.nextDouble();
		
		System.out.print("Corficiente c: ");
		c = sc.nextDouble();
		
		//calculo do delta discriminante: b^2 - 4 * a * c
		
		delta = Math.pow(b, 2) - 4.0 * a * c;
		
		// calculo das raizes: -b +- raiz (delta) / 2 * a
		
		if (a == 0.0 || delta < 0.0) {
			System.out.println("Esta equação não possui raizes reais");
		}
		else {
			raizA = (-b + Math.sqrt(delta)) / (2 * a);
			raizB = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("X1 = %.4f\n", raizA);
			System.out.printf("X2 = %.4f\n", raizB);
		}
		
		sc.close();

	}

}
