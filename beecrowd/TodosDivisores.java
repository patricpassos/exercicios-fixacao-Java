import java.util.Scanner;

public class TodosDivisores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int dividendo = sc.nextInt();

		int divisor = 0;
		while (dividendo != divisor) {
			divisor++;
			if (dividendo % divisor == 0) {
				System.out.print(divisor + " ");
			}
		}

		sc.close();

	}

}
