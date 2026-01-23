import java.util.Locale;
import java.util.Scanner;

public class ProblemaLanchonete {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Codigo do produto comprado: ");
		int codProduto = sc.nextInt();

		System.out.print("Quantidade comprada: ");
		int quantidade = sc.nextInt();

		Double total;
		if (codProduto == 1) {
			total = 5.0 * quantidade;
		} else if (codProduto == 2) {
			total = 3.50 * quantidade;
		} else if (codProduto == 3) {
			total = 4.80 * quantidade;
		} else if (codProduto == 4) {
			total = 8.90 * quantidade;
		} else {
			total = 7.32 * quantidade;
		}

		System.out.printf("Valor a pagar: R$ %.2f\n", total);

		sc.close();

	}

}
