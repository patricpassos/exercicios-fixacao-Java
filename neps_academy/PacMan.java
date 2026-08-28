import java.util.Scanner;

public class PacMan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int entrada = sc.nextInt();
		int comidasAtual = 0;
		int comidaMaximo = 0;

		for (int i = 0; i < entrada; i++) {
			String linha = sc.next();

			if (i % 2 == 0) {
				for (int j = 0; j < linha.length(); j++) {
					char caractere = linha.charAt(j);

					if (caractere == 'o') {
						comidasAtual++;
						comidaMaximo = Math.max(comidaMaximo, comidasAtual);
					} else if (caractere == 'A') {
						comidasAtual = 0;
					}
				}
			}
			
			else {
				for(int j = linha.length() - 1; j >= 0; j--) {
					char caractere = linha.charAt(j);
					
					if(caractere == 'o') {
						comidasAtual++;
						comidaMaximo = Math.max(comidaMaximo, comidasAtual);
					} else if (caractere == 'A' ) {
						comidasAtual = 0;
					}
				}
			}
		}

		System.out.println(comidaMaximo);

		sc.close();
	}

}
