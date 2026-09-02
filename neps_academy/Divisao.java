import java.util.Locale;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		double divisao = (double) a / b;
		
		System.out.printf("%.2f", divisao);
		
		sc.close();

	}

}
