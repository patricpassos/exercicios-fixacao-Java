import java.util.Scanner;

public class FatorialSimples1153 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int entrada = sc.nextInt();
		
		int fatorial = 1;
		for (int i = entrada; i >= 2; i--) {
			fatorial = fatorial * i;
			System.out.println(i);
		}
		
		System.out.println(fatorial);
		sc.close();
	}

}
