import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvidoLeituraIdade03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome01 = sc.next();
		int idade01 = sc.nextInt();
		
		String nome02 = sc.next();
		int idade02 = sc.nextInt();
		
		double mediaIdade = (double) (idade01 + idade02) / 2.0;
		
		System.out.printf("A idade média de %s e %s é de %n", nome01, nome02);
		System.out.printf("%.1f anos%n", mediaIdade);
		
		sc.close();

	}

}
