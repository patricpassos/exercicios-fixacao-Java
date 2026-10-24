import java.util.Scanner;

public class BotasTrocadas {

	public static void main(String[] args) {
		
		// algoritmo: vetor de frequencia - mapeamento direto
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] direito = new int[61];
		int[] esquerdo = new int[61];

		for (int i = 0; i < n; i++) {
			int tamanho = sc.nextInt();
			char lado = sc.next().toUpperCase().charAt(0);

			if (lado == 'D') {
				direito[tamanho]++;
			} else if (lado == 'E') {
				esquerdo[tamanho]++;
			}

		}
		
		int totalPares = 0;
		for(int i = 30; i < 61; i++) {
			totalPares += Math.min(direito[i], esquerdo[i]);
		}
		
		System.out.println(totalPares);

		sc.close();
	}

}
