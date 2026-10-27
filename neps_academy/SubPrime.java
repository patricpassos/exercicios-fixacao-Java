import java.util.Scanner;

public class SubPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numBancos = sc.nextInt();
		int numDebentures = sc.nextInt();

		while (numBancos != 0 && numDebentures != 0) {

			int[] reservaMonetaria = new int[numBancos];
			for (int i = 0; i < reservaMonetaria.length; i++) {
				reservaMonetaria[i] = sc.nextInt();
			}

			for (int i = 0; i < numDebentures; i++) {
				int devedor = sc.nextInt();
				int credor = sc.nextInt();
				int valor = sc.nextInt();

				reservaMonetaria[devedor - 1] -= valor;
				reservaMonetaria[credor - 1] += valor;
			}

			boolean teste = true;
			for (int reserva : reservaMonetaria) {
				if (reserva < 0) {
					teste = false;
					break;
				}
			}

			System.out.println((teste) ? "S" : "N");

			numBancos = sc.nextInt();
			numDebentures = sc.nextInt();

		}

		sc.close();

	}

}
