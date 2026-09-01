import java.util.Scanner;

public class Bondinho {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int quantidadeAlunos = sc.nextInt();
		int quantidadeMonitores = sc.nextInt();

		int soma = quantidadeAlunos + quantidadeMonitores;

		String resultado = (soma <= 50) ? "S" : "N";

		System.out.println(resultado);

		sc.close();

	}

}
