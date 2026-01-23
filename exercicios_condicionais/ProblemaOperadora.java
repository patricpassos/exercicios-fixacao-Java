import java.util.Locale;
import java.util.Scanner;

public class ProblemaOperadora {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valorFatura = 50.0;

		System.out.print("Digite a quantidade de minutos: ");
		int quantidadeMinutos = sc.nextInt();

		if (quantidadeMinutos > 100) {
			valorFatura = (quantidadeMinutos - 100.0) * 2.0 + valorFatura;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f\n", valorFatura);

		sc.close();

	}

}
