import java.util.Scanner;

public class DuplaDeTenis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int diferencaA = b - a;
		int diferencaB = d - c;
		
		int menorDiferenca = diferencaB - diferencaA;
		
		int resultado = Math.abs(menorDiferenca);
		
		System.out.println(resultado);
		
		sc.close();

	}

}
