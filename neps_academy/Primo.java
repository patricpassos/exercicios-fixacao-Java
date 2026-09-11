import java.util.Scanner;

public class Primo {

	static boolean eh_primo(int x) {
		if (x <= 1) {
			return false;
		}

		if (x == 2) {
			return true;
		}

		if (x % 2 == 0) {
			return false;
		}

		for (int i = 3; i * i <= x; i += 2) {
			if (x % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		char t = eh_primo(x) ? 'S' : 'N';
		System.out.println(t);

		sc.close();

	}

}
