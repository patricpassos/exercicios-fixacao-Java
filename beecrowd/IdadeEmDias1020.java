import java.util.Scanner;

public class IdadeEmDias1020 {

	public static void main(String[] args) {
		
		/**
		 * calcular a idade em ano, mes, dia
		 * considerar: ano = 365, mes = 30
		 */
		Scanner sc = new Scanner(System.in);
		
		int idade, resto, anos, meses, dias;
		
		idade = sc.nextInt();
		
		resto = idade;
		
		anos = idade / 365;
		System.out.println(anos + " ano(s)");
		resto = idade % 365;
		
		meses = resto / 30;
		System.out.println(meses + " mes(es)");
		resto = resto % 30;
		
		dias = resto / 1;
		System.out.println(dias + " dia(s)");
		
		sc.close();

	}

}
