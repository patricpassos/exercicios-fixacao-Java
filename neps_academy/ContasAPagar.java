import java.util.Scanner;

public class ContasAPagar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int v = sc.nextInt();

		int cont = 0;

		for (int i = 0; i < 3; i++) {
			int conta = sc.nextInt();
			
			if (v >= conta) {
				cont++;
				v -= conta;
			}

		}

		System.out.println(cont);
		
		sc.close();

	}

}
