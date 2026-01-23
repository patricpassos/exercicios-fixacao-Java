import java.util.Scanner;

public class SequenciaLogica21145 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		for (int i = 1; i <= n2; i++) {
			System.out.print(i);
			if (i % n1 == 0) {
				System.out.println();
			}
			else {
				System.out.print(" ");
			}
		}
		
		sc.close();

	}

}
