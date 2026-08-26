import java.util.Scanner;

public class EscolhaDificil {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int ca = sc.nextInt();
		int ba = sc.nextInt();
		int pa = sc.nextInt();

		int cr = sc.nextInt();
		int br = sc.nextInt();
		int pr = sc.nextInt();

		int totalFaltanto = 0;

		if (cr > ca) {
			totalFaltanto += (cr - ca);
		}

		if (br > ba) {
			totalFaltanto += (br - ba);
		}

		if (pr > pa) {
			totalFaltanto += (pr - pa);
		}

		System.out.println(totalFaltanto);

		sc.close();

	}

}
