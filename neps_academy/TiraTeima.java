import java.util.Scanner;

class Quadra {

	public int comprimento;
	public int altura;

	public boolean limiteComprimento() {
		return comprimento >= 0 && comprimento <= 432;
	}

	public boolean limiteAltura() {
		return altura >= 0 && altura <= 468;
	}

	public boolean pontuacao() {
		return limiteComprimento() && limiteAltura();
	}

}

public class TiraTeima {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Quadra quadra = new Quadra();

		quadra.comprimento = sc.nextInt();
		quadra.altura = sc.nextInt();

		boolean pontucao = quadra.pontuacao();

		String status = switch (Boolean.valueOf(pontucao)) {
		case Boolean s when s == true -> "dentro";
		case Boolean s when s == false -> "fora";
		default -> "erro";
		};

		System.out.println(status);

		sc.close();

	}

}
