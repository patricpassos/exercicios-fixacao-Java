import java.util.Scanner;

public class Garcom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantidadeBandejas = sc.nextInt();
		
		int somaQuebraDeCopos = 0;
		for(int i = 0; i < quantidadeBandejas; i++) {
			int quantidadeLatas = sc.nextInt();
			int quantidadeCopos = sc.nextInt();
			
			if(quantidadeLatas > quantidadeCopos) {
				somaQuebraDeCopos += quantidadeCopos;
			}
		}
		
		System.out.println(somaQuebraDeCopos);
		
		sc.close();

	}

}
