import java.util.Scanner;

public class Mobile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int a1 = b + c + d;
		int a2 = b + c;
		
		if(a == a1 && d == a2 && b == c) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
		
		sc.close();

	}

}
