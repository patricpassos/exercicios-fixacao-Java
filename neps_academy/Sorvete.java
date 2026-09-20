import java.util.Scanner;

public class Sorvete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int s = sc.nextInt();
		
		//vetores espelhados para guardar os intervalos (inicial e final)
		int[] inicio = new int[s];
		int[] fim = new int[s];
		
		
		for (int i = 0; i < s; i++) {
			inicio[i] = sc.nextInt();
			fim[i] = sc.nextInt();
		}
		
		// Invariante por ordenação (bubble sort espelhado)
		for(int i = 0; i < s; i++) {
			for(int j = i + 1; j < s; j++) {
				
				//cirterio de troca
				if(inicio[i] > inicio[j]) {
					
					//troca da posição dos vetores
					int auxInicio = inicio[i];
					inicio[i] = inicio[j];
					inicio[j] = auxInicio;
					
					// A REGRA DO ESPELHO: Troca os FINS correspondentes no mesmo milissegundo!
					int auxFim = fim[i];
					fim[i] = fim[j];
					fim[j] = auxFim;
				}
			}
		}
		
		
		//algoritmo de fusão de intervalos (Greedy algorithm)
		int inicioAtual = inicio[0];
		int fimAtual = fim[0];
		
		for (int i = 1; i < s; i++) {
			
			if (inicio[i] <= fimAtual) {
				fimAtual = Math.max(fimAtual, fim[i]);
			} else {
				System.out.println(inicioAtual + " " + fimAtual);
				
				inicioAtual = inicio[i];
				fimAtual = fim[i];
				
			}	
		}
		
		 System.out.println(inicioAtual + " " + fimAtual);
		 System.out.println();
		 
		 System.out.println(p);
		
		sc.close();

	}

}
