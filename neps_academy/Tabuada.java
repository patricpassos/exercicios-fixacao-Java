import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int entrada = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d\n", entrada, i, entrada * i);
		}
		
		sc.close();

	}

}
