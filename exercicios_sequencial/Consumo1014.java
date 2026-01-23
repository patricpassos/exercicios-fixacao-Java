import java.util.Locale;
import java.util.Scanner;

public class Consumo1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distanciaTotal = sc.nextInt();
		double combustivelGasto = sc.nextDouble();
		
		//Uso do casting, pois e a divisão int por double
		double consumo = (double) distanciaTotal / combustivelGasto;
		
		System.out.printf("%.3f km/l%n", consumo);
		
		sc.close();

	}

}
