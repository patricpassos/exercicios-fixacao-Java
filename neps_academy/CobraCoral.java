import java.util.Scanner;

public class CobraCoral {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if(a == c || b == d) {
			System.out.println("V");
		} else{
			System.out.println("F");
		}
		
		sc.close();

	}

}
