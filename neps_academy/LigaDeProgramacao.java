import java.util.Scanner;

public class LigaDeProgramacao {

	static int tempo(int x) {

		int t = (x > 8) ? x - 8 - 1 : 23 - (8 - x);

		return t;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		System.out.println(tempo(x));

		sc.close();

	}

}
