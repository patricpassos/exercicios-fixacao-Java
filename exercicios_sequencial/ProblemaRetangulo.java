import java.util.Locale;
import java.util.Scanner;

public class ProblemaRetangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Base do retangulo: ");
		double baseRetangulo = sc.nextDouble();
		
		System.out.print("Altura do retangulo: ");
		double alturaRetangulo = sc.nextDouble();
		
		double area = baseRetangulo * alturaRetangulo;
		System.out.printf("AREA = %.4f%n", area);
		
		double perimetro = 2 * (baseRetangulo + alturaRetangulo);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		
		double diagonal = Math.sqrt(Math.pow(alturaRetangulo, 2) + Math.pow(baseRetangulo, 2));
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		
		sc.close();

	}

}
