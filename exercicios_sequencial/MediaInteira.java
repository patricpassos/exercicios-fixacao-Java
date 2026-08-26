import java.util.Scanner;

public class MediaInteira {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		int mediaInteira = (a + b) / 2;
		
		System.out.println(mediaInteira);
		
		sc.close();

	}

}
