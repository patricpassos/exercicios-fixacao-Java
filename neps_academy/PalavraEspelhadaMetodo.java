import java.util.Scanner;

public class PalavraEspelhadaMetodo {
	
	// O loop vai apenas até a METADE do vetor (vet.length / 2)
	public static char[] vetor(String p) {
		char[] vet = p.toCharArray();
		for(int i = 0; i < vet.length / 2; i++) {
			char aux = vet[vet.length - i - 1];
			vet[i] = aux;
		}
		return vet;
	}
	
	public static void ehEspelhado(String p) {
		String str = String.valueOf(vetor(p));
		System.out.println((p.equals(str))? "YES" : "NON");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String p = sc.next().toLowerCase();
		
		ehEspelhado(p);

		sc.close();

	}

}
