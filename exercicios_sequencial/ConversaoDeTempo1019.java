import java.util.Scanner;

public class ConversaoDeTempo1019 {

	public static void main(String[] args) {
		
		/**
		 * Converte o tempo total em segundos para horas:minutos:segundos
		 * 1 minuto = 60 segundos
		 * 1 horas = 60 minutos = 3600 segundos
		 * Math.floorMod e a função que pega o mod (resto) da divisão
		 */
		Scanner sc = new Scanner(System.in);
		
		int tempoTotal = sc.nextInt();
		
		int horas = tempoTotal / 3600;
		
		int minutos = (tempoTotal % 3600) / 60;
		
		int segundos = (tempoTotal % 3600) % 60;
		 
		System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
		
		sc.close();

	}

}
