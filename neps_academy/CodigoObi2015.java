import java.util.Scanner;

public class CodigoObi2015 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int vet[] = new int[n];
		int cont = 0;

		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 2; i++) {

			if (vet[i] == 1 && vet[i + 1] == 0 && vet[i + 2] == 0) {
				cont++;
			}

		}

		System.out.println(cont);

		sc.close();

	}

}
