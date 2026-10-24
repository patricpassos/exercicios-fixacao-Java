import java.util.Scanner;

 class CalculadoraIdade{
	
	public int idadeMaisNovo;
	public int idadeDoMeio;
	
	public int idadeMaisVelho() {
		return idadeDoMeio - idadeMaisNovo + idadeDoMeio;
	}
	
	@Override
	public String toString() {
		return String.format("%d", idadeMaisVelho());
	}
	
}

public class Irmaos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CalculadoraIdade calIdade = new CalculadoraIdade();
		
		calIdade.idadeMaisNovo = sc.nextInt();
		calIdade.idadeDoMeio = sc.nextInt();
		
		System.out.println(calIdade);
		
		sc.close();

	}

}
