import java.util.Locale;
import java.util.Scanner;

public class PositivosMedia1064 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		double soma = 0;
		for (double i = 0; i < 6; i++) {
			double n = sc.nextDouble();
			
			if (n > 0.0) {
				cont += 1;
				soma +=  n;
			}
			
		}
		
		System.out.println(cont + " valores positivos");
		System.out.printf("%.1f%n", soma/cont);
		
		sc.close();

	}

}
