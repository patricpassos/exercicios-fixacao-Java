import java.util.Scanner;

public class Tabuada1078 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int entrada = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int produto = i * entrada;
			System.out.println(i + " x " + entrada + " = " + produto);
		}
		
		sc.close();

	}

}
