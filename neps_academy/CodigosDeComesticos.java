import java.util.Scanner;

public class CodigosDeComesticos {
	
	public static void codigoProdutos(int[] vet, int n) {
		if (vet.length > 0)
			vet[0] = 0;
		if (vet.length > 1)
			vet[1] = 1;
		
		for(int i = 2; i < vet.length; i++) {
			vet[i] = (vet[i - 1]) - 2 * (vet[i - 2]) + i;
		}
		
		System.out.println(vet[n]);
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int [] vet = new int[n+1];
		
		codigoProdutos(vet, n);

		sc.close();

	}

}
