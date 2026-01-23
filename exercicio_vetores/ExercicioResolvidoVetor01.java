import java.util.Scanner;

public class ExercicioResolvidoVetor01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int [] vet = new int[n];

		for (int i = 0; i < n; i++) {
			vet[i] = sc.nextInt();     // Leitura dos numeros e armazenando dentro do vetor
		}

		for (int i = 0; i < n; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}

		sc.close();

	}

}
