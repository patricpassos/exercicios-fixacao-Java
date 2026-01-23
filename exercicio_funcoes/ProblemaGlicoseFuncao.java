import java.util.Locale;
import java.util.Scanner;

public class ProblemaGlicoseFuncao {

	/**
	 * Parametros:
	 * @param g: Quantidade de glicose no sangue (mg/dl)
	 * @return: classifica a glicose
	 */
	static void classificacaoGlicose(double g) {
		String descricao = "";
		if (g <= 100) {
			descricao = "Normal";
		} else if (g <= 140) {
			descricao = "Elevado";
		} else {
			descricao = "Diabetes";
		}
		
		System.out.println("Classificação: " + descricao);
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor da glicose: ");
		double glicose = sc.nextDouble();
		
		classificacaoGlicose(glicose);

		sc.close();

	}

}
