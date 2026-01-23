import java.util.Locale;
import java.util.Scanner;

public class Media31040 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		n3 = sc.nextFloat();
		n4 = sc.nextFloat();
		
		float media = (n1 * 2f + n2 * 3f + n3 * 4f + n4 * 1f) / 10f;
		
		System.out.println("Media: " + media);
		
		if (media >= 7f) {
			System.out.println("Aluno aprovado.");
		}
		else if (media < 5f) {
			System.out.println("Aluno reprovado.");
		}
		else {
			System.out.println("Aluno em exame.");
			float n5 = sc.nextFloat();
			System.out.println("Nota do exame: " + n5);
			float mediaFinal = (n5 + media) / 2f;
			if (mediaFinal >= 5f) {
				System.out.println("Aluno aprovado.");
			}
			else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f%n", mediaFinal);
		}
		
		sc.close();

	}

}
