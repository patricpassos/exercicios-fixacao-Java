import java.util.Scanner;

public class ProblemaParImparFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros você vai digitar? ");
		int entrada = sc.nextInt();

		for (int i = 1; i <= entrada; i++) {
			System.out.print("Digite um numero: ");
			int x = sc.nextInt();
			
			if (x == 0) {
				System.out.println("NULO");
			} else if (x % 2 == 0 && x < 0) {
				System.out.println("PAR NEGATIVO");
			} else if (x % 2 == 0) {
				System.out.println("PAR POSITIVO");
			} else if (x % 2 != 0 && x < 0) {
				System.out.println("IMPAR NEGATIVO");
			} else {
				System.out.println("IMPAR POSITVO");
			}
		}

		sc.close();

	}

}
