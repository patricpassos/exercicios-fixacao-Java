import java.util.Scanner;

public class TempoJogoMinutos1047 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, minutoInicial, horaFinal, minutoFinal;
		
		horaInicial = sc.nextInt();
		minutoInicial = sc.nextInt();
		
		horaFinal = sc.nextInt();
		minutoFinal = sc.nextInt();
		
		//horas para minutos
		int totalInicial = horaInicial * 60 + minutoInicial;
		int totalFinal = horaFinal * 60 + minutoFinal;
		
		int duracao;
		if (totalInicial < totalFinal) {
			duracao = totalFinal - totalInicial;
		}
		else {
			duracao = (24 * 60 - totalInicial) + totalFinal;
		}
		
		//transformação de horas e minutos
		int duracaoHoras = duracao / 60;
		int duracaoMinutos = duracao % 60;
		
		System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
		
		sc.close();

	}

}
