import java.util.Scanner;

public class LinhasEnviadas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int entrada = sc.nextInt();

		for (int i = 0; i < entrada; i++) {
			int linha = sc.nextInt();
			System.out.println(linha + " lines were sent");
		}

		sc.close();

	}

}
