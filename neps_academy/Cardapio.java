import java.util.Locale;
import java.util.Scanner;

public class Cardapio {

	public static double totalCompra(int codProduto, int qtd) {
		return switch (Integer.valueOf(codProduto)) {
			case Integer t when t == 1 -> qtd * 6.90;
			case Integer t when t == 2 -> qtd * 7.30;
			case Integer t when t == 3 -> qtd * 4.50;
			case Integer t when t == 4 -> qtd * 5.70;
			default -> 0.0;
		};
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoProduto = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double totalGeral = totalCompra(codigoProduto, quantidade);

		System.out.printf("O valor total da compra e R$ %.2f", totalGeral);

		sc.close();

	}

}
