import java.util.Locale;
import java.util.Scanner;

public class ProblemaTroco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Preço do produto: ");
		double preco = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		int quantidade = sc.nextInt();
		
		System.out.print("Dinheiro recebido: ");
		double dinheiro = sc.nextDouble();
		
		double troco = dinheiro - (preco * quantidade);
		
		System.out.print("TROCO = " + troco);
		
		sc.close();

	}

}
