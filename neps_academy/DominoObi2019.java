import java.util.Scanner;

class Domino {
	
	 public static int qtdPecas(int duploN) {
		return ((duploN + 1) * (duploN + 2)) / 2;
	}
	
}

public class DominoObi2019 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int duploN = sc.nextInt();
		
		int qtdPecas = Domino.qtdPecas(duploN);
		
		System.out.println(qtdPecas);
		
		sc.close();

	}

}
