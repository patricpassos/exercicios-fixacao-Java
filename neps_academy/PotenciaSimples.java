import java.util.Locale;
import java.util.Scanner;

public class PotenciaSimples {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double base = sc.nextDouble();
		double expoente = sc.nextDouble();

		double potencia = Math.pow(base, expoente);

		System.out.printf("%.4f", potencia);

		sc.close();

	}

}
