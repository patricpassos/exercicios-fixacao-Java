import java.util.Scanner;

public class LimonadaManolo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int limoes = sc.nextInt();
		int preco = sc.nextInt();

		int total = 0;
		for (int i = 0; i < limoes; i++) {

			if (preco - i <= 0) {
				total = total + 1;
			} else {
				total = total + preco - i;
			}
			
		}
		
		System.out.println(total);

		sc.close();

	}

}
