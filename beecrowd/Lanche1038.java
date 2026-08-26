import java.util.Locale;
import java.util.Scanner;

public class Lanche1038 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoItem = sc.nextInt();
		int quantidadeItem = sc.nextInt();
		
		double precoTotal;
		if (codigoItem == 1) {
			precoTotal = quantidadeItem * 4.0;
		}
		else if (codigoItem == 2) {
			precoTotal = quantidadeItem * 4.5;	
		}
		else if (codigoItem == 3) {
			precoTotal = quantidadeItem * 5.0;
		}
		else if (codigoItem == 4) {
			precoTotal = quantidadeItem * 2.0;
		}
		else {
			precoTotal = quantidadeItem * 1.5;
		}
		
		//Só podemos evidenciar um print com condicionais após o else
		System.out.printf("Total: R$ %.2f%n", precoTotal);
		
		sc.close();
	}

}
