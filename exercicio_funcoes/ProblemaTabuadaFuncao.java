import java.util.Scanner;

public class ProblemaTabuadaFuncao {

	//Metodos que não retornam (PROCEDIMENTO) valor são caracterizadas pelo void e sem o uso do return
	static void tabuadaMultiplicacao(int p) {
		for (int i = 1; i <= 10; i++) {
			int produto = p * i;
			System.out.println(p + " x " + i + " = " + produto);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Voce quer a tabuada de qual numero? ");
		int n = sc.nextInt();
		
		// Afunção pode ser chamada direto
		tabuadaMultiplicacao(n);
		sc.close();

	}

}
