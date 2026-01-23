import java.util.Scanner;

public class ExecicioMatrizesSomaDeMatrizes05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int m = sc.nextInt(); // linhas
		int n = sc.nextInt(); // coluna
		
		int [] [] matA = new int [m] [n];
		int [] [] matB = new int [m] [n];
		//int [] [] matC = new int [m] [n];
		
		//Inputs da matriz A
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matA [i] [j] = sc.nextInt();
			}
		}
		
		//Inputs da matriz B
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matB [i] [j] = sc.nextInt();
			}
		}
		
		//Matriz C com a soma dos elementos
		int [] [] matC = new int [m] [n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matC [i] [j] = matA[i] [j] + matB [i] [j];
				System.out.print(matC [i] [j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
