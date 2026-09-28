import java.util.Arrays;
import java.util.Scanner;

public class Zip {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vet01 = { sc.nextInt(), sc.nextInt() };
		int[] vet02 = { sc.nextInt(), sc.nextInt() };

		Arrays.sort(vet01);
		Arrays.sort(vet02);

		int pontuacaoJogador01 = 0;
		if (vet01[0] == vet01[1]) {
			pontuacaoJogador01 = (vet01[0] + vet01[1]) * 2;
		} else if (vet01[0] + 1 == vet01[1]) {
			pontuacaoJogador01 = (vet01[0] + vet01[1]) * 3;
		} else {
			pontuacaoJogador01 = vet01[0] + vet01[1];
		}

		int pontuacaoJogador02 = 0;
		if (vet02[0] == vet02[1]) {
			pontuacaoJogador02 = (vet02[0] + vet02[1]) * 2;
		} else if (vet02[0] + 1 == vet02[1]) {
			pontuacaoJogador02 = (vet02[0] + vet02[1]) * 3;
		} else {
			pontuacaoJogador02 = vet02[0] + vet02[1];
		}

		String ganhador = (pontuacaoJogador01 > pontuacaoJogador02) ? "Lia"
				        : (pontuacaoJogador01 < pontuacaoJogador02) ? "Carolina" 
				        : "empate";

		System.out.println(ganhador);

		sc.close();

	}

}
