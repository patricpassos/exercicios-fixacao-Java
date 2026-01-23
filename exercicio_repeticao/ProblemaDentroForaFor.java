import java.util.Scanner;

public class ProblemaDentroForaFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos nueros você vai digitar? ");
		int entrada = sc.nextInt();

		int contDentro = 0;
		int contFora = 0;
		for (int i = 1; i <= entrada; i++) {
			System.out.print("Digite um numero: ");
			int x = sc.nextInt();

			if (x >= 10 && x <= 20) {
				contDentro++;
			} else {
				contFora++;
			}

		}

		System.out.println(contDentro + " DENTRO");
		System.out.println(contFora + " FORA");

		sc.close();

	}

}
