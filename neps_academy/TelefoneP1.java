import java.util.Scanner;

public class TelefoneP1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String tel = sc.next().toUpperCase();

		for (int i = 0; i < tel.length(); i++) {
			char letra = tel.charAt(i);

			if (letra >= 'A' && letra <= 'C') {
				System.out.print('2');
			} else if (letra >= 'D' && letra <= 'F') {
				System.out.print('3');
			} else if (letra >= 'G' && letra <= 'I') {
				System.out.print('4');
			} else if (letra >= 'J' && letra <= 'L') {
				System.out.print('5');
			} else if (letra >= 'M' && letra <= 'O') {
				System.out.print('6');
			} else if (letra >= 'P' && letra <= 'S') {
				System.out.print('7');
			} else if (letra >= 'T' && letra <= 'V') {
				System.out.print('8');
			} else if (letra >= 'W' && letra <= 'Z') {
				System.out.print('9');
			} else {
				System.out.print(letra);
			}

		}

		sc.close();

	}

}
