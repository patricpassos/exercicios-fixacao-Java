import java.util.Locale;
import java.util.Scanner;

public class SenhaFixa1114 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		double senha = sc.nextDouble();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextDouble();
		}
				
		System.out.println("Acesso Permitido");
		
		sc.close();

	}

}
