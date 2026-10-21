import java.util.Scanner;

class Calibrador {
	
	public static int diferenca(int n, int m) {
		return n - m;
	}
	
}

public class Pneu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int diferenca = Calibrador.diferenca(n, m);
		System.out.println(diferenca);
		
		sc.close();

	}

}
