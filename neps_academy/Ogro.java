import java.util.Scanner;

public class Ogro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int e = sc.nextInt();
		int d = sc.nextInt();
		
		int soma = 0;
		if(e > d) {
			soma = e + d;
		} else {
			soma = 2 * (d - e);
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
