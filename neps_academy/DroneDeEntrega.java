import java.util.Arrays;
import java.util.Scanner;

public class DroneDeEntrega {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Outra opção para adicionar dados em um vetor sem precisar de for
		/*
		int [] caixav = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		int [] janelav = {sc.nextInt(), sc.nextInt()};
		*/
		
		int [] caixa = new int[3];
		int [] janela = new int[2];
		
		for(int c = 0; c < caixa.length; c++) {
			caixa[c] = sc.nextInt();
		}
		
		for(int j = 0; j < janela.length; j++) {
			janela[j] = sc.nextInt();
		}
		
		Arrays.sort(caixa);
		Arrays.sort(janela);
		
		if(caixa[0] <= janela[0] && caixa[1] <= janela[1]) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
		
		sc.close();

	}

}
