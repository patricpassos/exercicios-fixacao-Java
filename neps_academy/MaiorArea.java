import java.util.Scanner;

public class MaiorArea {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int larguraA = sc.nextInt();
		int alturaA = sc.nextInt();

		int larguraB = sc.nextInt();
		int alturaB = sc.nextInt();

		int areaA = larguraA * alturaA;
		int areaB = larguraB * alturaB;

		String colocacaoArea = areaA == areaB ? "Empate" : areaA > areaB ? "Primeiro" : "Segundo";

		System.out.println(colocacaoArea);

		sc.close();

	}

}
