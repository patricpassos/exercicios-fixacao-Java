import java.util.Locale;
import java.util.Scanner;

public class AumentoSalario1048 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, reajuste, novoSalario, percentual;
		
		salario = sc.nextDouble();
		
		if (salario <= 400.0) {
			percentual = 15.0;
			//reajuste = salario * percentual / 100;
			//novoSalario = salario + reajuste;
		}
		else if (salario < 800.0) {
			percentual = 12.0;
			//reajuste = salario * percentual / 100;
			//novoSalario = salario + reajuste;
		}
		else if (salario < 1200.0) {
			percentual = 10.0;
			//reajuste = salario * percentual / 100;
			//novoSalario = salario + reajuste;
		}
		else if (salario <= 2000.0) {
			percentual = 7.0;
			//reajuste = salario * percentual / 100;
			//novoSalario = salario + reajuste;
		}
		else {
			percentual = 4.0;
			//reajuste = salario * percentual / 100;
			//novoSalario = salario + reajuste;
		}
		
		
		//Podemos realizar evidenciar calculos que se repetem dentro do if
		reajuste = salario * percentual / 100;
		novoSalario = salario + reajuste;
		
		System.out.printf("Novo salario: %.2f%n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.printf("Em percentual: %.0f %%%n", percentual);
		
		sc.close();

	}

}
