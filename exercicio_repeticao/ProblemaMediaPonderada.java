import java.util.Locale;
import java.util.Scanner;

public class ProblemaMediaPonderada {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos casos você vai digitar? ");
		double entrada = sc.nextDouble();
		
		for (int i = 1; i <= entrada; i++) {
			System.out.println("Digite tres numeros: ");
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			
			double media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
			System.out.printf("MEDIA = %.1f\n", media);
		}
		
		sc.close();

	}

}
