import java.util.Locale;
import java.util.Scanner;

public class ProblemaConsumo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Distancia percorrida: ");
		int distanciaPercorrida = sc.nextInt();
		
		System.out.print("Combustível gasto: ");
		double combustivelGasto = sc.nextDouble();
		
		double consumo = distanciaPercorrida / combustivelGasto;
		
		System.out.printf("Consumo medio = %.3f", consumo);
		
		sc.close();

	}

}
