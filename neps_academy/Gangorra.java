import java.util.Scanner;

public class Gangorra {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int peso01 = sc.nextInt();
		int comprimento01 = sc.nextInt();

		int peso02 = sc.nextInt();
		int comprimento02 = sc.nextInt();

		int pesoEsquerdo = peso01 * comprimento01;
		int pesoDireito = peso02 * comprimento02;

		if (pesoEsquerdo == pesoDireito) {
			System.out.println("0");
		} else if (pesoEsquerdo > pesoDireito) {
			System.out.println("-1");
		} else {
			System.out.println("1");
		}

		sc.close();

	}

}
