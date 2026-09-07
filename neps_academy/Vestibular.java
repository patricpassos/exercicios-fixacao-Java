import java.util.Scanner;

public class Vestibular {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String [] vetGabarito = sc.next().split("");
		String [] vetResposta = sc.next().split("");

		int cont = 0;
		for(int i = 0; i <= n - 1; i++) {
			
			if (vetGabarito[i].equals(vetResposta[i])) {
				cont++;
			}
		}
		
		System.out.println(cont);
		
		sc.close();

	}

}
