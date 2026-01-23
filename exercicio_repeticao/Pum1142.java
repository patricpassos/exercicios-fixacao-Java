import java.util.Scanner;

public class Pum1142 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int entrada = sc.nextInt();
		int primeiro = 1;
		
		for (int i = 1; i <= entrada; i++) {
			
			int segundo = primeiro + 1;
			int terceiro = primeiro + 2;
			
			System.out.printf("%d %d %d PUM%n", primeiro, segundo, terceiro);
			
			primeiro += 4;
		}
		
		sc.close();

	}

}
