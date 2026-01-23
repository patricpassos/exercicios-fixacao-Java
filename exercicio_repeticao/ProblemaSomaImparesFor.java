import java.util.Scanner;

public class ProblemaSomaImparesFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite dois numeros:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		int a = 0;
		if (x > y) {
			a = x;
			x = y;
			y = a;
		}
		
		int soma = 0;
		for (int i = x + 1; i < y; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.printf("SOMA DOS PARES = %d\n", soma);
		
		sc.close();
	}

}
