import java.util.Locale;
import java.util.Scanner;

public class ParImpar1074 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int entrada = sc.nextInt();
		
		for (int i = 0; i < entrada; i++) {
			int x = sc.nextInt();
			
			if (x == 0) {
				System.out.println("NULL");
			}
			else if (x % 2 != 0 && x > 0) {
				System.out.println("ODD POSITIVE");
			}
			else if (x % 2 != 0 && x < 0) {
				System.out.println("ODD NEGATIVE");
			}
			else if (x % 2 == 0 && x > 0) {
				System.out.println("EVEN POSITIVE");
			}
			else {
				System.out.println("EVEN NEGATIVE");
			}
			
		}
		
		
		sc.close();

	}

}

