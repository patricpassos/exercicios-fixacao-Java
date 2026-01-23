import java.util.Scanner;

public class ProblemaMenorDeTres {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Primeiro valor: ");
		int a = sc.nextInt();

		System.out.print("Segundo valor: ");
		int b = sc.nextInt();

		System.out.print("Terceiro valor: ");
		int c = sc.nextInt();

		if (a < b && a < c) {
			System.out.println("MENOR = " + a);
		} else if (b < c) {
			System.out.println("MENOR = " + b);
		} else {
			System.out.println("MENOR = " + c);
		}

		sc.close();

	}

}
