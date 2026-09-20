import java.util.Scanner;

public class SubstituicaoNoVetor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vet = new int[10];

		int menor = 100; //fornecido pela restrição
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
			if(vet[i] < menor) {
				menor = vet[i];
			}
		}

		System.out.println("Menor: " + menor);
		
		System.out.print("Ocorrencias: ");
		for (int i = 0; i < vet.length; i++) {
			if (menor == vet[i]) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		for (int i = 0; i < vet.length; i++) {
			if (menor == vet[i]) {
				vet[i] = -1;
			}
			System.out.print(vet[i] + " ");
		}
		System.out.println();

		sc.close();

	}

}
