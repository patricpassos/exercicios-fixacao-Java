import java.util.Scanner;

public class NumerosNaturais {
	
	public static int soma(int a) {
		int soma = 0;
		for(int i = 1; i < a + 1; i++) {
			soma += i;
		}
		return soma;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int somaNumNaturais = soma(num);
		
		System.out.println(somaNumNaturais);
		
		sc.close();

	}

}
