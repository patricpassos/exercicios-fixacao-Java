import java.util.Scanner;

public class ReprovadoAprovadoFinal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota01 = sc.nextDouble();
		double nota02 = sc.nextDouble();
		
		double mediaPonderada = (nota01 * 2.0 + nota02 * 3.0) / (2.0 + 3.0);
		
		if(mediaPonderada >= 7.0) {
			System.out.println("Aprovado");
		} else if(mediaPonderada < 3.0) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Final");
		}
		
		sc.close();
		
		//parttern matching
		/*String status = switch(mediaPonderada) {
			case double m when m >= 7.0 -> "Aprovado";
			case double m when m < 3.0 -> "Recuperação";
			default -> "Final";
		};*/

	}

}
