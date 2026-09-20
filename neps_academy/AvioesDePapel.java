import java.util.Scanner;

public class AvioesDePapel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int quantidadeCompetidor = sc.nextInt();
		int quantidadePapel = sc.nextInt();
		int quantidadeFolhas = sc.nextInt();

		char resultado = (quantidadeCompetidor * quantidadeFolhas <= quantidadePapel) ? 'S' : 'N';
		System.out.println(resultado);

		sc.close();

	}

}
