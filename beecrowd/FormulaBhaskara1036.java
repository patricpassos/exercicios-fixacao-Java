import java.util.Locale;
import java.util.Scanner;

public class FormulaBhaskara1036 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = b * b - 4.0 * a * c;
		
		/**
		 * Pra uma equação do segundo grau existir:
		 * coeficiente a não pode ser zero: a == 0
		 * delta não pode ser negativo: delta < 0.0
		 */
		
		if (a == 0 || delta < 0.0) {
			System.out.println("Impossivel calcular");
		}
		else {
			double r1 = (- b + Math.sqrt(delta)) / (2.0 * a);
			double r2 = (- b - Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		
		sc.close();

	}

}
