import java.util.Locale;
import java.util.Scanner;

public class MelhorAluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		String vencedor = " ";
		if( a == b) {
			vencedor = "Pedro";
		} else if (a > b) {
			vencedor = "Paulo";
		} else {
			vencedor = "Pedro";
		}
		
		System.out.println(vencedor);
		
		sc.close();

	}

}
