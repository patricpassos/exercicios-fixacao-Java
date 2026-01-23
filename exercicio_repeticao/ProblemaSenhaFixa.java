import java.util.Scanner;

public class ProblemaSenhaFixa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int senha;

		System.out.print("Digite a senha: ");
		senha = sc.nextInt();

		while (senha != 2002) {
			System.out.print("Senha Invalida! Tente Novamente: ");
			senha = sc.nextInt();
		}
		System.out.println("Acesso permitido!");

		sc.close();

	}

}
