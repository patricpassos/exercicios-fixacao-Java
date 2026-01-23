import java.util.Locale;
import java.util.Scanner;

public class MediaPondera1006 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Declaração das contantes peso
		double pesoA = 2.0;
		double pesoB = 3.0;
		double pesoC = 5.0;
		
		//Entrada de dados das notas
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		//Calculo da média
		double media = (A * pesoA + B * pesoB + C * pesoC) / (pesoA + pesoB + pesoC);
		
		System.out.printf("MEDIA = %.1f%n", media);
		
		sc.close();
		
	}

}
