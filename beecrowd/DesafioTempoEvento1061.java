import java.util.Scanner;

public class DesafioTempoEvento1061 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int diaInicial, horaInicial, minutoInicial, segundoInicial, totalSegundosIncial;
		int diaFinal, horaFinal, minutoFinal, segundoFinal, totalSegundosFinal;
		int diferenca, resto, dias, horas, minutos, segundos;
		String s;

		// Entrada iniciais
		s = sc.next();
		diaInicial = sc.nextInt();
		horaInicial = sc.nextInt();
		s = sc.next();
		minutoInicial = sc.nextInt();
		s = sc.next();
		segundoInicial = sc.nextInt();

		// Entradas Finais
		s = sc.next();
		diaFinal = sc.nextInt();
		horaFinal = sc.nextInt();
		s = sc.next();
		minutoFinal = sc.nextInt();
		s = sc.next();
		segundoFinal = sc.nextInt();

		// Transformação para segundos
		totalSegundosIncial = diaInicial * 24 * 60 * 60 + horaInicial * 60 * 60 + minutoInicial * 60 + segundoInicial;
		totalSegundosFinal = diaFinal * 24 * 60 * 60 + horaFinal * 60 * 60 + minutoFinal * 60 + segundoFinal;

		/**
		 * Calculos: 1 dia = 86400 segundos 1 hora = 3600 segundos 1 minutos = 60
		 * segundos
		 */
		diferenca = totalSegundosFinal - totalSegundosIncial;

		dias = diferenca / 86400;
		resto = diferenca % 86400;

		horas = resto / 3600;
		resto = resto % 3600;

		minutos = resto / 60;
		resto = resto % 60;

		segundos = resto;

		System.out.println(dias + " dia(s)");
		System.out.println(horas + " hora(s)");
		System.out.println(minutos + " minuto(s)");
		System.out.println(segundos + " segundo(s)");
		System.out.println(s);

		sc.close();

	}

}
