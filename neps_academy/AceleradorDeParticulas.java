import java.util.Scanner;

public class AceleradorDeParticulas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int distancia = sc.nextInt();

		double t = distancia % 8.0;

		if (t == 0.0) {
			System.out.println(3);
		} else if (t == 7.0) {
			System.out.println(2);
		} else if (t == 6.0) {
			System.out.println(1);
		}

		sc.close();

	}

}
