import java.util.Scanner;

public class InversoVetores {
	
	public static void vetInverso(int[] vet) {
		for(int i = 9; i >= 0; i--) {
			System.out.println(vet[i]);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] vet = new int[10];
		
		for(int i = 0; i < 10; i++) {
			vet[i] = sc.nextInt();
		}
		
		vetInverso(vet);
		
		sc.close();

	}

}
