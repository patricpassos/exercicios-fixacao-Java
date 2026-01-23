import java.util.Scanner;

public class ProblemaTempoDeJogo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hora inicial: ");
		int horaInicial = sc.nextInt();
		
		System.out.print("Hora Final: ");
		int horaFinal = sc.nextInt();
		
		int tempoJogo;
		if (horaInicial >= horaFinal) {
			tempoJogo = 24 - horaInicial + horaFinal;
		}
		else {
			tempoJogo = horaFinal - horaInicial;
		}
		
		System.out.printf("O JOGO DUROU %s HORAS(S)", tempoJogo);
		
		sc.close();

	}

}
