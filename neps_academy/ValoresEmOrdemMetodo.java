import java.util.Arrays;
import java.util.Scanner;

public class ValoresEmOrdemMetodo {
	
	public static void preencherVetor(int[] vet, Scanner sc) {
		for(int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}
	}
	
	public static void ordenarEImprimir(int[] vet) {
		Arrays.sort(vet);
		for(int v : vet) {
			System.out.print(v + " ");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] vet = new int[n];
		
		preencherVetor(vet, sc);
		
		ordenarEImprimir(vet);
		
		sc.close();

	}

}
