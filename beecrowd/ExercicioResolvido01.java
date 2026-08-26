import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double semestre1, semestre2, notaFinal;
		
		semestre1 = sc.nextDouble();
		semestre2 = sc.nextDouble();
		
		notaFinal = semestre1 + semestre2;
		
		System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
		
		if (notaFinal < 60.0) {
			System.out.println("REPROVADO");
		}
		
		sc.close();

	}

}
