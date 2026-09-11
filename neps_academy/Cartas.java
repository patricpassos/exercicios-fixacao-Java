import java.util.Scanner;

public class Cartas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cartaA = sc.nextInt();
		int cartaB = sc.nextInt();
		int cartaC = sc.nextInt();
		
		int cartaD = 0;
		if(cartaA != cartaB && cartaA != cartaC) {
			cartaD = cartaA;
		} else if (cartaB != cartaA && cartaC != cartaB) {
			cartaD = cartaB;
		} else {
			cartaD = cartaC;
		}
		
		System.out.println(cartaD);
		
		
		sc.close();

	}

}
