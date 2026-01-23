import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1 = sc.nextInt();
		int qtd1 = sc.nextInt();
		double preco1 = sc.nextDouble();
		
		int cod2 = sc.nextInt();
		int qtd2 = sc.nextInt();
		double preco2 = sc.nextDouble();
		
		double precoTotal = qtd1 * preco1 + qtd2 * preco2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", precoTotal);
		System.out.println(cod1 + " - " + cod2);
		
		sc.close();

	}

}
