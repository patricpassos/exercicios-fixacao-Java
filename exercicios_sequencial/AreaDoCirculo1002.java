import java.util.Locale;
import java.util.Scanner;

public class AreaDoCirculo1002 {

	public static void main(String[] args) {
		// Área de uma circuferencia area = pi * raio^2
		
		Locale.setDefault(Locale.US);
		//Obejeto Scanner
		Scanner sc = new Scanner(System.in);
		
		double pi, raio, area;
		
		pi = 3.14159;
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();

	}

}
