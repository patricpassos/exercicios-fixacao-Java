import java.util.Scanner;

public class AprovadoReprovado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double notaA = sc.nextDouble();
		double notaB = sc.nextDouble();

		double mediaNota = (notaA + notaB) / 2.0;

		if (mediaNota < 4.0) {
			System.out.println("Reprovado");
		} else if (mediaNota < 7.0) {
			System.out.println("Recuperacao");
		} else {
			System.out.println("Aprovado");
		}

		sc.close();
		
		//Switch moderno avaliando o tipo e aplicando condições Pattern Matching
		/*String status = switch (mediaNota) {
		    case double m when m < 4.0 -> "Reprovado";
		    case double m when m < 7.0 -> "Recuperação";
		    default -> "Aprovado";
		};

		System.out.println("Status do aluno: " + status);*/

	}

}
