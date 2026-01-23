import java.util.Scanner;

public class ProblemaExemploMenorCinco {

	static int menorDeTres(int a, int b, int c) {
		int menor = a;
		if (a < b && a < c) {
			menor = a;
		} else if (b < c) {
			menor = b;
		} else {
			menor = c;
		}
		return menor;
	}

	static int menorDeCinco(int a, int b, int c, int d, int e) {
		int aux = menorDeTres(a, b, c); // Retorna um numero menor entre x1, x2 e x3
		return menorDeTres(aux, d, e); // Compara o menoDeTres com x4 e x5
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite cinco numeros inteiros:");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int x3 = sc.nextInt();
		int x4 = sc.nextInt();
		int x5 = sc.nextInt();

		// int aux = menorDeCinco(x1, x2, x3);
		// int menor = menorDeCinco(aux, x4, x5);

		int menor2 = menorDeCinco(x1, x2, x3, x4, x5);

		System.out.println("Menor = " + menor2);

		sc.close();

	}

}
