import java.util.Arrays;
import java.util.Scanner;

public class BucaSimplesNoVetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] vet = new int[n];
		
		for(int i = 0; i < n; i++) {
			vet[i] = sc.nextInt();
		}
		
		Arrays.sort(vet);
		
		int x = sc.nextInt();
		
		int procura = Arrays.binarySearch(vet, x);
		
		String resp = (procura >= 0) ?  "pertence" : "nao_pertence";
		
		System.out.println(resp);
		
		sc.close();

	}

}
