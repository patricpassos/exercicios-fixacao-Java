import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String [] nomes = new String [n];
		double [] notasSemestre1 = new double [n];
		double [] notasSemestre2 = new double [n];
		
		for (int i = 0; i < n; i++) {
			nomes [i] = sc.next();
			notasSemestre1 [i] = sc.nextDouble();
			notasSemestre2 [i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		
		double [] mediaNotas = new double [n];
		for (int i = 0; i < n; i++) {
			mediaNotas [i] = (notasSemestre1 [i] + notasSemestre2 [i]) / 2.0;
			if (mediaNotas[i] >= 6.0) {
				System.out.println( nomes[i]);
			}
		} 
		
		sc.close();

	}

}
