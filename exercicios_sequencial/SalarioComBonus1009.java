import java.util.Locale;
import java.util.Scanner;

public class SalarioComBonus1009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeVendedor = sc.next();
		double salarioBase = sc.nextDouble();
		double totalVendas = sc.nextDouble();
		
		double comissao = totalVendas * 0.15;
		double salarioTotal = salarioBase + comissao;
		
		System.out.println("VENDEDOR: " + nomeVendedor);
		System.out.printf("TOTAL = R$ %.2f%n", salarioTotal);
		
		sc.close();

	}

}
