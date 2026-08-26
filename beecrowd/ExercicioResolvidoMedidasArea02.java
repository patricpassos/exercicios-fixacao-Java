import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvidoMedidasArea02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		//Objeto Scanner para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados com double
		double comp, larg, preco, area, precoTotal;
		
		comp = sc.nextDouble();
		larg = sc.nextDouble();
		preco = sc.nextDouble();
		
		//Atribuição: Calculo da área e do preço do terreno
		area = comp * larg;
		precoTotal = area * preco; 
		
		
		//Saida de dados
		System.out.printf("AREA = %.2f %n", area);
		System.out.printf("PREÇO = %.2f %n", precoTotal);
		
		// Desaloca o Scanner
		sc.close();

	}

}
