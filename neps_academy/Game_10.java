import java.util.Scanner;

public class Game_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int posicao = sc.nextInt();
		int disco = sc.nextInt();
		int aviao = sc.nextInt();
		
		int t = 0;
		
		if(aviao > disco) {
			t = posicao - (aviao - disco);
		} else {
			t = disco - aviao;
		}
		
		System.out.println(t);
		
		sc.close();

	}

}
