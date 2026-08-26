import java.util.Locale;
import java.util.Scanner;

public class Media1005 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, pesoA, pesoB, media;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		pesoA = 3.5;
		pesoB = 7.5;
		
		media = ((A * pesoA) + (B * pesoB)) / (pesoA + pesoB);
		
		System.out.printf("MEDIA = %.5f%n", media);
		
		sc.close();

	}

}
