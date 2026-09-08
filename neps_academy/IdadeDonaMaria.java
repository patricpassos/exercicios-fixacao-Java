import java.util.Scanner;

public class IdadeDonaMaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = m - (a + b);
		
		int maior = 0;
		if(a > b && a > c) {
			maior = a;
		} else if(b > a && b > c) {
			maior = b;
		} else {
			maior = c;
		}
		
		System.out.println(maior);

		sc.close();
		
	}

}
