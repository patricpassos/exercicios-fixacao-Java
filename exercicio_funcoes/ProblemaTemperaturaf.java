import java.util.Locale;
import java.util.Scanner;

public class ProblemaTemperaturaf {
	
	/**
	 * Parametros:
	 * @param f: temperatura em Fahrenheit
	 * @return : retorna a temperatura equivalente a Celsius
	 */
	static double  fahrenheitParaCelsius (double f) {
		double celsius = 5.0 / 9.0 * (f - 32);
		return celsius;
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		double tempFahrenheit = sc.nextDouble();
		
		double resultadoCelsius = fahrenheitParaCelsius(tempFahrenheit);
		
		System.out.printf("Temperatura em Celsius = %.2f", resultadoCelsius);
		
		sc.close();

	}

}
