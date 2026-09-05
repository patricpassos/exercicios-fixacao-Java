import java.util.Locale;
import java.util.Scanner;

public class AreaCircunferencia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int raio = sc.nextInt();
		
		double areaCircunferencia = 3.1416 * Math.pow(raio, 2.0);
		
		System.out.printf("%.2f", areaCircunferencia);
		
		sc.close();

	}

}
