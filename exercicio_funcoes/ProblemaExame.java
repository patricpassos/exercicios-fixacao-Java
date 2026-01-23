import java.util.Locale;
import java.util.Scanner;

public class ProblemaExame {

	static void classificacaoGlicose(double g) {
		String descricaoGlicose = "";
		if (g <= 100) {
			descricaoGlicose = "Normal";
		} else if (g <= 140) {
			descricaoGlicose = "Elevado";
		} else {
			descricaoGlicose = "Diabetes";
		}

		System.out.println("Classificação: " + descricaoGlicose);

	}

	static void classificacaoTriglicerideos(double t) {
		String descricaoTriglicerideos = "";
		if (t <= 200) {
			descricaoTriglicerideos = "Desejável";
		} else {
			descricaoTriglicerideos = "Aumentado";
		}
		System.out.println("Classificação: " + descricaoTriglicerideos);
	}

	static void classificacaoColesterol(double c) {
		String descricaoColesterol = "";
		if (c <= 200) {
			descricaoColesterol = "Desejável";
		} else if (c <= 240) {
			descricaoColesterol = "Limiar";
		} else {
			descricaoColesterol = "Elevado";
		}
		System.out.println("Classificação: " + descricaoColesterol);
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Medida de glicose: ");
		double glicose = sc.nextDouble();
		classificacaoGlicose(glicose);

		System.out.print("Medida de triglicerídeos: ");
		double triglicerideos = sc.nextDouble();
		classificacaoTriglicerideos(triglicerideos);

		System.out.print("Medida de colesterol: ");
		double colesterol = sc.nextDouble();
		classificacaoColesterol(colesterol);

		sc.close();

	}

}
