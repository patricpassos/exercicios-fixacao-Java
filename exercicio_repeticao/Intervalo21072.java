import java.util.Scanner;

public class Intervalo21072 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int entrada = sc.nextInt();
		int contDentroIntervalo = 0;
		int contForaIntervalo = 0;
		
		for (int i = 0; i < entrada; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				contDentroIntervalo += 1;
			}
			else {
				contForaIntervalo += 1;
			}
			
		}
		
		System.out.println(contDentroIntervalo + " in");
		System.out.println(contForaIntervalo + " out");
		
		sc.close();
	}

}
