import java.util.Scanner;

public class PremioDoMilhao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int entrada = sc.nextInt();
		int[] vet = new int[entrada];

		int soma = 0;
		for (int i = 0; i < entrada; i++) {
			vet[i] = sc.nextInt();
		}

		for (int j = 0; j < entrada; j++) {
			soma += vet[j];

			if (soma >= 1000000) {
				System.out.println(j + 1);
				break;
			}
		}

		sc.close();

	}

}
