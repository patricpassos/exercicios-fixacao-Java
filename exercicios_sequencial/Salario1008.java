import java.util.Locale;
import java.util.Scanner;

public class Salario1008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario, horasTrabalhada;
		double valorHorasTrabalhada, salario;
		
		numeroFuncionario = sc.nextInt();
		horasTrabalhada = sc.nextInt();
		valorHorasTrabalhada = sc.nextDouble();
		salario = horasTrabalhada * valorHorasTrabalhada;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}

}
