import java.util.Scanner;

public class NumerosImpares1067 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int entrada = sc.nextInt();
		
		for (int i = 1; i <= entrada; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
