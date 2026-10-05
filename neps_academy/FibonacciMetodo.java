import java.util.Scanner;

public class FibonacciMetodo {

	public static void fibonacci(int[] vet) {

		if (vet.length > 0)
			vet[0] = 0;
		if (vet.length > 1)
			vet[1] = 1;

		for (int i = 2; i < vet.length; i++) {
			vet[i] = vet[i - 1] + vet[i - 2];
		}

		for (int t : vet) {
			System.out.print(t + " ");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] vet = new int[n];

		fibonacci(vet);

		sc.close();

	}

}
