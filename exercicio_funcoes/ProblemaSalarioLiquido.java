import java.util.Locale;
import java.util.Scanner;

public class ProblemaSalarioLiquido {

	static double imposto(double salario) {
		double calculoImposto;
		if (salario <= 4000.0) {
			calculoImposto = salario * 0.20;
		} else {
			calculoImposto = salario * 0.25;
		}
		return salario - calculoImposto;
	}

	static double previdencia(double salario) {
		double calculoPrevidencia;
		if (salario <= 1500.00) {
			calculoPrevidencia = salario * 0.10;
		} else {
			calculoPrevidencia = salario * 0.15;
		}
		return salario - calculoPrevidencia;
	}

	static double salarioLiquido(double salario) {
		double totalImposto = imposto(salario) + previdencia(salario);
		return totalImposto - salario;
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o salário bruto: ");
		double salarioBruto = sc.nextDouble();

		double resultadoSalarioLiquido = salarioLiquido(salarioBruto);
		System.out.printf("Salário liquido = R$ %.2f", resultadoSalarioLiquido);

		sc.close();

	}

}
