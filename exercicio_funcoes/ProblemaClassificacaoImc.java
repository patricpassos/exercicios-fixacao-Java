import java.util.Locale;
import java.util.Scanner;

public class ProblemaClassificacaoImc {

	static double calculoImc(double p, double a) {
		double imc = p / Math.pow(a, 2);
		return imc;
	}

	static void classificacaoImc(double p, double a) {
		String descricao = "";
		double auxImc = calculoImc(p, a);  //Varialvel auxiliar que chama a funcao calculoImc 
		if (auxImc < 20) {
			descricao = "Abaixo do peso";
		} else if (auxImc < 25) {
			descricao = "Peso normal";
		} else if (auxImc < 30) {
			descricao = "Sobre peso";
		} else {
			descricao = "Obeso";
		}
		System.out.println("Resultado do IMC: " + descricao);
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o peso: ");
		double peso = sc.nextDouble();
		System.out.print("Digite a altura: ");
		double altura = sc.nextDouble();
		
		classificacaoImc(peso, altura);

		sc.close();

	}

}
