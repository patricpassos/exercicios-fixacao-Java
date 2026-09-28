import java.util.Scanner;

public class NotasDeProva {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		char status = switch (Integer.valueOf(n)) {
		case Integer m when m == 0 -> 'E';
		case Integer m when m <= 35 -> 'D';
		case Integer m when m <= 60 -> 'C';
		case Integer m when m <= 85 -> 'B';
		case Integer m when m <= 100 -> 'A';
		default -> 'e';
		};

		System.out.println(status);

		sc.close();

	}

}
