import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double [] altura = new double [n];
		char [] sexo = new char [n];
		
		for (int i = 0; i < n; i++) {
			altura [i] = sc.nextDouble();
			sexo [i] = sc.next().charAt(0);
		}
		
		double menorAltura = altura[0];
		for (int i = 0; i < n; i++) {
			if (altura [i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		
		System.out.println("Menor altura = " + menorAltura);
		
		double maiorAltura = altura[0];
		for (int i = 0; i < n; i++) {
			if (altura [i] > maiorAltura) {
				maiorAltura = altura[i];
			}
		}
		
		System.out.println("Maior altura = " + maiorAltura);
		
		//media das altura do sexo feminino
		double soma = 0.0;
		int contF = 0;
		for (int i = 0; i < n; i++) {
			if (sexo[i] == 'F') {
				soma = soma + altura[i];
				contF += 1;
			}
		}
		
		if (contF == 0) {
			System.out.println("Não tem mulheres entre as pessoas");
		}
		else {
			double media = soma / contF;
			System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		}
		
		int contM = 0;
		for (int i = 0; i < n; i++) {
			if (sexo[i] == 'M') {
				contM += 1;
			}
		}
		
		System.out.println("Numero de homens = " + contM);
		
		sc.close();

	}

}
