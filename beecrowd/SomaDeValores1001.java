import java.util.Scanner;

public class SomaDeValores1001 {

	public static void main(String[] args) {
		//Cria um objeto Scanner
		Scanner sc = new Scanner(System.in);
		//Declaração de variavel
		int A, B, X;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		X = A + B;
		
		System.out.println("X = " + X);
		
		sc.close();

	}

}
