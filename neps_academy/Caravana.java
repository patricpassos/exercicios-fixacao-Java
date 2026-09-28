import java.util.Arrays;
import java.util.Scanner;

public class Caravana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] vet = new int[n];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}

		int soma = Arrays.stream(vet).sum();
		long quantidade = Arrays.stream(vet).count();
		int div = (int) (soma / quantidade);

		for (int i = 0; i < vet.length; i++) {
			int a = div - vet[i];
			System.out.println(a);
		}

		sc.close();

	}

}
