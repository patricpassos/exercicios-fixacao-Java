import java.util.Locale;
import java.util.Scanner;

public class ProblemaCirculo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio do circulo: ");
		double raio = sc.nextDouble();
		
		double areaDoCirculo = Math.PI * Math.pow(raio, 2);
		System.out.printf("AREA = %.3f\n", areaDoCirculo);
		
		sc.close();

	}

}
