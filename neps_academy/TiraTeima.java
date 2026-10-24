import java.util.Scanner;

class Quadra {
	
	public int comprimento;
	public int altura;
	
	public boolean limiteComprimento() {
		if(comprimento >= 0 && comprimento <= 432) {
			return true;
		}
		return false;
	}
	
	public boolean limiteAltura() {
		if (altura >= 0 && altura <= 468) {
			return true;
		}
		return false;
	}
	
	public boolean pontuacao() {
		if (limiteComprimento() && limiteAltura()) {
			return true;
		}
		return false;
	}
	
}


public class TiraTeima {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Quadra quadra = new Quadra();
		
		quadra.comprimento = sc.nextInt();
		quadra.altura = sc.nextInt();
		
		boolean pontucao = quadra.pontuacao();
		
		String status = switch(Boolean.valueOf(pontucao)) {
			case Boolean s when s == true -> "dentro";
			case Boolean s when s == false -> "fora";
			default -> "erro";
		};
		
		System.out.println(status);
		
		sc.close();

	}

}
