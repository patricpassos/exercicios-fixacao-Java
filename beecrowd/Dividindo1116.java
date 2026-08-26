import java.util.Locale;
import java.util.Scanner;

public class Dividindo1116 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numCasos = sc.nextInt();
		int cont = 0;
		
		while (cont != numCasos) {
			double v1 = sc.nextDouble();
			double v2 = sc.nextDouble();
			cont += 1;
			
			if (v2 != 0) {
				double quociente = (double) v1 / v2;
				System.out.printf("%.1f%n", quociente);
			}
			else {
				System.out.println("divisao impossivel");
			}
			
			}
		
		sc.close();

	}

}
