import java.util.Scanner;

public class GabaritoOrdenacaoCrescente {

	public static void main(String[] args) {
		
		
		/**
		 * Ordenação decrescente: professor
		 */
		Scanner sc = new Scanner(System.in);

		int n1, n2, n3;
	
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		int A, B, C;
		if (n1 > n2 && n1 > n3) {
			A = n1;
			if (n2 > n3) {
				B = n2;
				C = n3;	
			}
			else {
				B = n3;
				C = n2;
			}
		}
		else if (n2 > n3) {
			A = n2;
			if (n1 > n3) {
				B = n1;
				C = n3;
			}
			else {
				B = n3;
				C = n1;
			}
		}
		else {
			A = n3;
			if (n1 > n2) {
				B = n1;
				C = n2;
			}
			else {
				B = n2;
				C = n1;
			}
		}
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
		sc.close();
	}

}
