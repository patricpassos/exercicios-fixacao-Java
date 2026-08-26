import java.util.Scanner;

public class SequenciaNumerosSoma1101 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x > 0 && y > 0) {
			
			int menor = x;
			int maior = y;
			
			if (x > y) {
				menor = y;
				maior = x;
			}
			
			int soma = 0;
			for (int i = menor; i <= maior; i++) {
				soma += i;
				System.out.print(i + " ");
			}
			System.out.println("Sum=" + soma);
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
