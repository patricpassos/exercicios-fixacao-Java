import java.util.Scanner;

public class ParesImparesPositivosNegativos1066 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contPar = 0;
		int contImpar = 0;
		int contPositivo = 0;
		int contNegativo = 0;
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			
			if (n % 2 == 0 || n == 0) {
				contPar += 1;
			}
			if (n % 2 != 0) {
				contImpar += 1;
			}
			if (n > 0) {
				contPositivo += 1;
			}
			if (n < 0) {
				contNegativo += 1;
			}
			
		}
		
		System.out.println(contPar + " valor(es) par(es)");
		System.out.println(contImpar + " valor(es) impar(es)");
		System.out.println(contPositivo + " valor(es) positivo(s)");
		System.out.println(contNegativo + " valor(es) negativo(s)");
		
		sc.close();

	}

}
