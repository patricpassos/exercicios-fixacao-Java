import java.util.Scanner;

public class PetiscosParaCaes {

	static int indiceFelicidade(int s, int m, int l) {
		return 1 * s + 2 * m + 3 * l;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();

		int i = indiceFelicidade(s, m, l);

		String status = switch (Integer.valueOf(i)) {
		case Integer c when c >= 10 -> "happy";
		default -> "sad";
		};

		System.out.println(status);

		sc.close();

	}

}
