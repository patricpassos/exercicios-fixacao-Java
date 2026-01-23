import java.util.Locale;
import java.util.Scanner;

public class NumerosPositivos1060 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		
		for (int i = 0; i < 6; i++) {
			double n = sc.nextDouble();
			if (n > 0) {
				cont += 1;
			}
		}
		System.out.println(cont + " valores positivos");
		
		sc.close();

	}

}
