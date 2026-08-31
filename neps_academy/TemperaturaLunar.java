import java.util.Scanner;

public class TemperaturaLunar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int quantidadeDeMedicoes = sc.nextInt();
		int intervalosDeMedicoes = sc.nextInt();
		int[] vet = new int[quantidadeDeMedicoes];

		int contador = 1;
		while (quantidadeDeMedicoes != 0 || intervalosDeMedicoes != 0) {

			int menorMedia = 0;
			int maiorMedia = 0;
			int somaTemperatura = 0;
			boolean sinal = true;
			for (int i = 0; i < quantidadeDeMedicoes; i++) {
				vet[i] = sc.nextInt();
			}

			for (int t = 0; t < (quantidadeDeMedicoes - intervalosDeMedicoes) + 1; t++) {
				for (int m = t; m < t + intervalosDeMedicoes; m++) {
					somaTemperatura += vet[m];
				}
				int mediaAtual = somaTemperatura / intervalosDeMedicoes;

				if (sinal) {
					menorMedia = mediaAtual;
					maiorMedia = mediaAtual;
					sinal = false;
				} else {
					menorMedia = Math.min(menorMedia, mediaAtual);
					maiorMedia = Math.max(maiorMedia, mediaAtual);
				}

				somaTemperatura = 0;
			}

			System.out.println("Teste " + contador);
			contador++;
			System.out.print(menorMedia + " " + maiorMedia + "\n\n");

			quantidadeDeMedicoes = sc.nextInt();
			intervalosDeMedicoes = sc.nextInt();
			vet = new int[quantidadeDeMedicoes];
		}

		sc.close();

	}

}
