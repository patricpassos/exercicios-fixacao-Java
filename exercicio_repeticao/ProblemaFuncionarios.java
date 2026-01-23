import java.util.Locale;
import java.util.Scanner;

public class ProblemaFuncionarios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos funcionarios serão digitados? ");
		int n = sc.nextInt();

		double maiorSalario = 0;
		String nome = "";
		double soma = 0;
		double cont = 0;
		for (int i = 1; i <= n; i++) {
			System.out.printf("Digite os dados do %d° funcionario: \n", i);
			System.out.print("Nome: ");
			String nomeFuncionario = sc.next();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();

			if (salario >= maiorSalario) {
				maiorSalario = salario;
				nome = nomeFuncionario;
			}

			if (salario >= 5000.0 && salario <= 10000.0) {
				soma = soma + salario;
				cont += 1;
			}

		}

		double media = soma / cont;
		System.out.println();
		System.out.println("Funcionario com maior salario: " + nome);
		System.out.printf("Salario medio de quem ganha de 5000.00 a 10000.00 = %.2f", media);

		sc.close();
	}

}
