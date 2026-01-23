import java.util.Scanner;

public class DesafioGiraFila {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt(); //linha
		int n = sc.nextInt(); // coluna
		
		int [] [] mat = new int [m] [n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat [i] [j] = sc.nextInt();
			}
		}
		
		int fila = sc.nextInt();
		
		fila = fila - 1;
		int ultimoFila = mat [fila] [n-1];
		
		for (int j = n-1; j > 0; j--) {
			mat [fila] [j] = mat [fila] [j-1];
		}
		
		mat [fila] [0] = ultimoFila;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat [i] [j] + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
