import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//nome, preço de compra, preço de venda
		String [] produto = new String [n];
		double [] precoCompra = new double [n];
		double []precoVenda = new double [n];
		
		for (int i = 0; i < n; i++) {
			produto [i] = sc.next();
			precoCompra [i] = sc.nextDouble();
			precoVenda [i] = sc.nextDouble();
		}
		
		/**
		 * Porcentagens dos lucros
		 * lucro < 10%
		 * 10% <= lucro <= 20%
		 * lucro > 20%
		 * formula: lucro(%) = (venda - compra) / compra * 100
		 */
		
		
		int conta = 0;
		int contb = 0;
		int contc = 0;
		for (int i = 0; i < n; i++) {
			double lucro = precoVenda[i] - precoCompra[i];
			double lucroPercentual = lucro / precoCompra[i] * 100.0;
			
			if (lucroPercentual < 10.0) {
				conta++;
			}
			else if (lucroPercentual <= 20) {
				contb++;
			}
			else {
				contc++;
			}
		}
		
		System.out.println("Lucro abaixo de 10%: " + conta);
		System.out.println("Lucro entre 10% e 20%: " + contb);
		System.out.println("Lucro acima de 20%: " + contc);
		
		/**
		 * Preço total das compras
		 * Preço total de venda
		 * Lucro total
		 */
		
		double totalCompra = 0;
		double totalVenda = 0;
		
		for (int i = 0; i < n; i++) {
			totalCompra = totalCompra + precoCompra[i];
			totalVenda = totalVenda + precoVenda[i];
			
		}
		
		double totalLucro = totalVenda - totalCompra;
		
		System.out.printf("Valor total de compra = %.2f%n", totalCompra);
		System.out.printf("Valor total de venda = %.2f%n", totalVenda);
		System.out.printf("Lucro total = %.2f%n", totalLucro);
		
		sc.close();

	}

}
