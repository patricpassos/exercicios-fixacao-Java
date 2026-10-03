import java.util.Arrays;
import java.util.Scanner;

public class BucasSimplesVetores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] vet = new int[10];
		
		for(int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		
		boolean existe = Arrays.stream(vet).anyMatch(elemento -> elemento == x);

		String resultado = existe ? "SIM" : "NAO";

		System.out.println(resultado);
		
		
		sc.close();

	}

}
