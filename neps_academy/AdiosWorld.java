import java.util.Scanner;

public class AdiosWorld {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char letra = sc.next().charAt(0);

		switch (letra) {
		case 'i':
			System.out.println("Goodbye World!");
			break;
		case 'e':
			System.out.println("Adios Mundo!");
			break;
		case 'f':
			System.out.println("Au revoir le Monde!");
			break;
		default:
			System.out.println("Adeus Mundo!");
			break;
		}

		sc.close();

	}

}
