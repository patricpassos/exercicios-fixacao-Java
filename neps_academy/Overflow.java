import java.util.Scanner;

public class Overflow {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int p = sc.nextInt();
		char c = sc.next().charAt(0);
		int q = sc.nextInt();
		
		int resultado = 0;
		
		if(c == '+') {
			resultado = p + q;
		} else if (c == '*') {
			resultado = p * q;
		}
		
		String t = (resultado > n) ? "OVERFLOW" : "OK";
		System.out.println(t);
		
		sc.close();

	}

}
