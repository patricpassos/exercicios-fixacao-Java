import java.util.Scanner;

public class TipoCombustivel1134 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int entrada = sc.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (entrada != 4 ) {
			if (entrada == 1) {
				alcool += 1;
			}
			else if (entrada == 2) {
				gasolina += 1;
			}
			else if (entrada == 3) {
				diesel += 1;
			}
			
			entrada = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();

	}

}
