import java.util.Locale;
import java.util.Scanner;

public class Maior1013 {

	public static void main(String[] args) {
		
		/**
		 * (A, B) = MaiorAB
		 * (MaiorAB, C) = MaiorABC
		 * Formula: MaiorAB = (a + b + abs(a-b)) / 2
		 */
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		// (A, B) = MaiorAB
		int MaiorAB = (a + b + Math.abs(a - b)) / 2;
		
		//(MaiorAB, C) = MaiorABC
		int MaiorABC = (MaiorAB + c + Math.abs(MaiorAB - c)) / 2;
		
		System.out.println(MaiorABC + " eh o maior");
		
		sc.close();

	}

}
