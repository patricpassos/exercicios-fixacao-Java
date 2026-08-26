import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada1079 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double entrada = sc.nextDouble();
		double mediaPonderada = 0;
		for (int i = 0; i < entrada; i++) {
			double x1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			mediaPonderada = (x1 * 2 + x2 * 3 + x3 * 5) / 10;
			System.out.printf("%.1f%n", mediaPonderada);
		}
		
		sc.close();

	}

}
