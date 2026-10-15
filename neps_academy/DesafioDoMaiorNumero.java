import java.util.Scanner;

public class DesafioDoMaiorNumero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int maior = n;
		while(n != 0) {
			n = sc.nextInt();
			if(n > maior) {
				maior = n;
			}
		}
		
		System.out.println(maior);
		
		sc.close();
	}

}
