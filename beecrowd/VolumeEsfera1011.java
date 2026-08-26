import java.util.Locale;
import java.util.Scanner;

public class VolumeEsfera1011 {

	public static void main(String[] args) {
		// Formula do volume de uma esfera: 4/3 * pi * r^3
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		
		double volumeEsfera = (double) 4/3 * pi * Math.pow(raio, 3.0); 
		
		System.out.printf("VOLUME = %.3f%n", volumeEsfera);
		
		sc.close();

	}

}
