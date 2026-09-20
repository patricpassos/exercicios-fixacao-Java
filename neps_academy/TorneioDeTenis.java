import java.util.Scanner;

public class TorneioDeTenis {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[] vet = new char[6];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.next().toUpperCase().charAt(0);
		}

		int contVitoria = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == 'V') {
				contVitoria++;
			}
		}

		int grupo = switch (contVitoria) {
		case 5, 6 -> 1;
		case 3, 4 -> 2;
		case 1, 2 -> 3;
		default -> -1;
		};

		System.out.println(grupo);

		/*if (contVitoria >= 5) {
			System.out.println(1);
		} else if (contVitoria >= 3) {
			System.out.println(2);
		} else if (contVitoria >= 1) {
			System.out.println(3);
		} else {
			System.out.println(-1);
		}*/

		sc.close();

	}

}
