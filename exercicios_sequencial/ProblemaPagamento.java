import java.util.Locale;
import java.util.Scanner;

public class ProblemaPagamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.next();
		
		System.out.print("Valor por hora: ");
		double precoHora = sc.nextDouble();
		
		System.out.print("Horas Trabalhadas: ");
		int horaTrabalhada = sc.nextInt();
		
		double pagamento = (double) precoHora * horaTrabalhada;
		System.out.printf("O pagamento para %s deve ser %.2f", nome, pagamento);
		
		sc.close();

	}

}
