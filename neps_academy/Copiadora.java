import java.util.Scanner;

public class Copiadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int quantidadeLinhas = sc.nextInt();

		for (int i = 0; i < quantidadeLinhas; i++) {
			int linha = sc.nextInt();
			System.out.println(linha + " " + linha);
		}

		sc.close();

	}

}
