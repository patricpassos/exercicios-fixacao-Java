import java.util.Scanner;

public class ProblemaExemploMenorDeTres {

	static int menorTres(int a, int b, int c) {
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

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite três numeros inteiros:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int resultadoMenor = menorTres(a, b, c);

		System.out.println("Menor = " + resultadoMenor);

		sc.close();

	}

}
