import java.util.Locale;
import java.util.Scanner;

public class ProblemaGlicose {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a medida da glicose: ");
		double glicose = sc.nextDouble();
		
		if (glicose <= 100.0) {
			System.out.print("Classificação: normal");
		}
		else if (glicose <= 140.0) {
			System.out.print("Classificação: elevado");
		}
		else {
			System.out.print("Classificação: diabetes");
		}
		
		sc.close();

	}

}
