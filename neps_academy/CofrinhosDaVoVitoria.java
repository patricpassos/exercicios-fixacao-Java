import java.util.Scanner;

public class CofrinhosDaVoVitoria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int entrada = sc.nextInt();

		int numeroTeste = 1;
		while (entrada != 0) {
			System.out.println("Teste " + numeroTeste);
			numeroTeste++;

			int diferenca = 0;
			for (int i = 0; i < entrada; i++) {
				int depositoJoao = sc.nextInt();
				int depositoZezinho = sc.nextInt();
				diferenca += depositoJoao - depositoZezinho;
				System.out.println(diferenca);
			}

			System.out.println();
			entrada = sc.nextInt();
		}

		sc.close();

	}

}
