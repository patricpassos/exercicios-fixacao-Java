import java.util.Locale;
import java.util.Scanner;

public class ProblemaAumento {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o salario da pessoa: ");
		double salario = sc.nextDouble();

		double aumento, novoSalario, percentual;
		if (salario <= 1000.0) {
			percentual = 20.0;
		} else if (salario <= 3000.0) {
			percentual = 15.0;
		} else if (salario <= 8000.0) {
			percentual = 10.0;
		} else {
			percentual = 2.0;
		}

		aumento = salario * percentual / 100;
		novoSalario = salario + aumento;

		System.out.printf("Novo salario = %.2f\n", novoSalario);
		System.out.printf("Aumento = %.2f\n", aumento);
		System.out.printf("Porcentagem = %.0f %%", percentual);

		sc.close();

	}

}
