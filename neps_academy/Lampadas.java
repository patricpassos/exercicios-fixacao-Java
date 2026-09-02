import java.util.Scanner;

public class Lampadas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int entrada = sc.nextInt();

		int lampadaA = 0;
		int lampadaB = 0;

		for (int i = 0; i < entrada; i++) {
			int interruptor = sc.nextInt();

			if (interruptor == 1) {
				lampadaA = 1 - lampadaA;
			} else if (interruptor == 2) {
				lampadaA = 1 - lampadaA;
		        lampadaB = 1 - lampadaB;
			}
		}

		System.out.println(lampadaA);
		System.out.println(lampadaB);

		sc.close();
		
		
		/*if (interruptor == 1) {
		    // Foco total apenas na Lâmpada A
		    if (lampadaA == 0) lampadaA = 1;
		    else lampadaA = 0;
		} 
		else if (interruptor == 2) {
		    // Inverte a A
		    if (lampadaA == 0) lampadaA = 1;
		    else lampadaA = 0;
		    
		    // Inverte a B de forma totalmente independente
		    if (lampadaB == 0) lampadaB = 1;
		    else lampadaB = 0;
		}*/

	}

}
