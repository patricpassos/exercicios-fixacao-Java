import java.util.Locale;
import java.util.Scanner;

public class ProblemaNotas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Leitura de duas notas do primeiro e segundo semestre

		System.out.print("Digite a primeiro nota: ");
		double nota1 = sc.nextDouble();

		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();

		// Soma das notas

		double somaNota = nota1 + nota2;
		System.out.printf("NOTA FINAL = %.1f\n", somaNota);
		
		// Condicional para reprovação
		
		if (somaNota < 60.0) {
			System.out.println("REPROVADO");
		}

		sc.close();

	}

}
