import java.util.Locale;
import java.util.Scanner;

public class ProblemaMediaIdades {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as idades:");
		int idade = sc.nextInt();

		if (idade > 0) {
			double soma = 0, media;
			int cont = 0;
			while (idade >= 0) {
				soma += idade;
				cont += 1;
				idade = sc.nextInt();
			}

			media = soma / cont;
			System.out.printf("MEDIA = %.2f", media);

		} else {
			System.out.println("IMPOSSIVEL CALCULAR");
		}

		sc.close();

	}

}
