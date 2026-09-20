import java.util.Locale;
import java.util.Scanner;

public class Raizes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			double num = sc.nextDouble();
			double raiz = Math.sqrt(num);
			System.out.printf("%.4f\n", raiz);
		}
		
		
		sc.close();

	}

}
