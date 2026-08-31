import java.util.Locale;
import java.util.Scanner;

public class PresentesDeNatal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextInt();
		
		double volume = 4.0 / 3.0 * 3.14 * Math.pow(raio, 3);
		
		System.out.printf("%.2f", volume);
		
		sc.close();

	}

}
