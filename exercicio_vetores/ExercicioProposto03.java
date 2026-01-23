import java.util.Scanner;

public class ExercicioProposto03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] vetA = new int [n];
		int [] vetB = new int [n];
		
		
		for (int i = 0; i < n; i++) {
			vetA [i] = sc.nextInt();
			}
		
		for (int i = 0; i < n; i++) {
			vetB [i] = sc.nextInt();
			}
		
		int [] vetAB = new int [n];
		for (int i = 0; i < n; i++) {
			vetAB [i] = vetA [i] + vetB[i];
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(vetAB[i] + " ");
		}
		
		
		sc.close();

	}

}
