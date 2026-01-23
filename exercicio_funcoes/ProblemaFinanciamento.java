import java.util.Locale;
import java.util.Scanner;

public class ProblemaFinanciamento {
	
	/**
	 * 
	 * @param i: valor total do imovel
	 * @param e: vlor de entrada do financiamento
	 * @param m: quantidade de meses em que o restante será financiado
	 * @return: retorna o valor das parcelas do financiamento sem juros
	 */
	static double parcelasFinanciamento(double i, double e, int m) {
		double valorParcelas = (i - e) / m;
		return valorParcelas;
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor total do imovel: ");
		double valorImovel = sc.nextDouble();
		System.out.print("Valor pago na entrada: ");
		double valorEntrada = sc.nextDouble();
		System.out.print("Será financiado em quantos meses? ");
		int meses = sc.nextInt();
		
		System.out.printf("Valor de cada prestação: %.2f", parcelasFinanciamento(valorImovel, valorEntrada, meses));
		
		sc.close();
	}

}
