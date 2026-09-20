import java.util.Arrays;
import java.util.Scanner;

public class AndandoNoTempo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vet = new int[3];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}

		Arrays.sort(vet);

		if (vet[0] == vet[1] || vet[1] == vet[2] || vet[0] + vet[1] == vet[2]) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}

		sc.close();

	}

}
