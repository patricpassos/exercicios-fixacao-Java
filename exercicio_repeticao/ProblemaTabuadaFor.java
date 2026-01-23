import java.util.Scanner;

public class ProblemaTabuadaFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int entrada;

		System.out.print("Deseja a tabuada para qual valor? ");
		entrada = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			int produto = entrada * i;
			System.out.println(entrada + " x " + i + " = " + produto);
		}

		sc.close();

	}

}
