import java.util.Scanner;

public class BasqueteDeRobos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int distanciaLancamento = sc.nextInt();

		if (distanciaLancamento <= 800) {
			System.out.println(1);
		} else if (distanciaLancamento <= 1400) {
			System.out.println(2);
		} else if (distanciaLancamento <= 2000) {
			System.out.println(3);
		}

		sc.close();

	}

}
