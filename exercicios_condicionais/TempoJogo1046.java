import java.util.Scanner;

public class TempoJogo1046 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		
		if (horaFinal < horaInicial) {
			duracao = 24 - horaInicial + horaFinal;
		}
		else if (horaInicial == horaFinal) {
			duracao = horaInicial - horaFinal + 24;
		}
		else {
			duracao = horaFinal - horaInicial;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);

		sc.close();
	
	}

}
