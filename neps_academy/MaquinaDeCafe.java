import java.util.Scanner;

class calculadoraTempo {

	int quantidadePessoasTerceiroAndar;
	int quantidadePessoasSugundoAndar;
	int quantidadePessoasPrimeiroAndar;

	public int tempoA() {
		return quantidadePessoasSugundoAndar * 2 + quantidadePessoasPrimeiroAndar * 4;
	}

	public int tempoB() {
		return quantidadePessoasTerceiroAndar * 2 + quantidadePessoasPrimeiroAndar * 2;
	}

	public int tempoC() {
		return quantidadePessoasSugundoAndar * 2 + quantidadePessoasTerceiroAndar * 4;
	}
	
	public int menorTempo() {
		return Math.min(tempoA(), Math.min(tempoB(), tempoC()));
	}
	
	public String toString() {
		return String.format("%d", menorTempo());
	}

}

public class MaquinaDeCafe {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		calculadoraTempo menor = new calculadoraTempo();
		
		
		menor.quantidadePessoasTerceiroAndar = sc.nextInt();
		menor.quantidadePessoasSugundoAndar = sc.nextInt();
		menor.quantidadePessoasPrimeiroAndar = sc.nextInt();

		System.out.println(menor);

		sc.close();

	}

}
