import java.util.Arrays;
import java.util.Scanner;

public class Loteria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] jogo = new int[6];
		int[] resultado = new int[6];

		for (int i = 0; i < jogo.length; i++) {
			jogo[i] = sc.nextInt();
		}

		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = sc.nextInt();
		}

		Arrays.sort(jogo);
		Arrays.sort(resultado);

		int p1 = 0;
		int p2 = 0;

		int cont = 0;

		while (p1 < jogo.length && p2 < resultado.length) {

			if (jogo[p1] == resultado[p2]) {
				p1++;
				p2++;
				cont++;
			} else if (jogo[p1] < resultado[p2]) {
				p1++;

			} else {
				p2++;

			}
		}

		String classificacao = switch (Integer.valueOf(cont)) {
		case Integer c when c == 6 -> "sena";
		case Integer c when c == 5 -> "quina";
		case Integer c when c == 4 -> "quadra";
		case Integer c when c == 3 -> "terno";
		default -> "azar";
		};

		System.out.println(classificacao);

		sc.close();

	}

}
