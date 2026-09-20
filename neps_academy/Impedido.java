import java.util.Scanner;

public class Impedido {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int r = sc.nextInt();
		int d = sc.nextInt();
		
		char i = 'N';
		if (r > 50 && l < r && r > d) {
			i = 'S';
		}
		
		System.out.println(i);
		
		sc.close();

	}

}
