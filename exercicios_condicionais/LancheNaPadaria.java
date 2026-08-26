import java.util.Scanner;

public class LancheNaPadaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int preco = sc.nextInt();
		
		if(preco > 5) {
			System.out.println("NAO");
		} else {
			System.out.println("SIM");
		}
		
		sc.close();

	}

}
