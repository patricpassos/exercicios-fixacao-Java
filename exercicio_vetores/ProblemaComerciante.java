import java.util.Locale;
import java.util.Scanner;

public class ProblemaComerciante {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Serão digitados dados de quantos produtos? ");
		int n = sc.nextInt();

		String[] produto = new String[n];
		double[] compra = new double[n];
		double[] venda = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Produto %s: \n", i + 1);
			System.out.print("Nome: ");
			produto[i] = sc.next();
			System.out.print("Preço de compra: ");
			compra[i] = sc.nextDouble();
			System.out.print("Preço de venda: ");
			venda[i] = sc.nextDouble();
		}

		/**
		 * Porcentagens dos lucros lucro < 10% 10% <= lucro <= 20% lucro > 20% formula:
		 * lucro(%) = (venda - compra) / compra * 100
		 */

		double[] lucro = new double[n];
		for (int i = 0; i < n; i++) {
			lucro[i] = (venda[i] - compra[i]) / compra[i] * 100;
		}

		int contA = 0;
		int contB = 0;
		int contC = 0;
		for (int i = 0; i < n; i++) {
			if (lucro[i] < 10) {
				contA++;
			} else if (lucro[i] < 20) {
				contB++;
			} else {
				contC++;
			}
		}

		double somaCompra = 0.0;
		double somaVenda = 0.0;
		for (int i = 0; i < n; i++) {
			somaCompra += compra[i];
			somaVenda += venda[i];
		}

		double lucroTotal = somaVenda - somaCompra;

		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.println("Lucro abaixo de 10%: " + contA);
		System.out.println("Lucro entre 10% e 20%: " + contB);
		System.out.println("Lucro acima de 20%: " + contC);
		System.out.printf("Valor total de compra: %.2f\n", somaCompra);
		System.out.printf("Valor total de venda: %.2f\n", somaVenda);
		System.out.printf("Lucro total: %.2f", lucroTotal);

		sc.close();

	}

}
