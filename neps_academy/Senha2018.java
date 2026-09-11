import java.util.Scanner;

public class Senha2018 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tentativa = sc.nextInt();
		
		int cont = 0;
		while (tentativa != 2018) {
			cont++;
			tentativa = sc.nextInt();
		}
		
		System.out.println(cont);
		
		sc.close();

	}

}
