import java.util.Scanner;

class GerenciadorPostes {

	private int[] alturas;
	private int substituidos;
	private int consertados;

	public GerenciadorPostes(int quantidade) {
		this.alturas = new int[quantidade];
	}

	public void adicionarAlturas(int index, int altura) {
		this.alturas[index] = altura;
	}

	public void analisarPostes() {
		for (int i = 0; i < alturas.length; i++) {
			if (alturas[i] < 50) {
				substituidos++;
			} else if (alturas[i] < 85) {
				consertados++;
			}
		}
	}
	
	public String toString() {
		analisarPostes();
		return String.format("%d %d", substituidos, consertados);
	}
}

public class Postes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numPostes = sc.nextInt();
		GerenciadorPostes gerenciador = new GerenciadorPostes(numPostes);

		for (int i = 0; i < numPostes; i++) {
			int altura = sc.nextInt();
			gerenciador.adicionarAlturas(i, altura);
		}

		System.out.println(gerenciador);

		sc.close();

	}

}
