import java.util.Locale;
import java.util.Scanner;

public class ProblemaTrocoVerificado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double precoUnitario, dinheiroRecebido, troco, resto;
		int quantidadeProduto;

		System.out.print("Preço unitário do produto: ");
		precoUnitario = sc.nextDouble();

		System.out.print("Quantidade comprada: ");
		quantidadeProduto = sc.nextInt();

		System.out.print("Dinheiro recebido: ");
		dinheiroRecebido = sc.nextDouble();

		if (quantidadeProduto * precoUnitario > dinheiroRecebido) {
			resto = quantidadeProduto * precoUnitario - dinheiroRecebido;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", resto);
		} 
		else {
			troco = dinheiroRecebido - quantidadeProduto * precoUnitario;
			System.out.printf("TROCO = %.2f\n", troco);
		}

		sc.close();

	}

}
