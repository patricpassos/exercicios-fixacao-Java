import java.util.Scanner;

public class BuffOuNerf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int projeteisInicial = sc.nextInt();
		int danoInicial = sc.nextInt();
		
		int projeteisFinal = sc.nextInt();
		int danoFinal = sc.nextInt();
		
		int danoAntigo = projeteisInicial * danoInicial;
		int danoAtual = projeteisFinal * danoFinal;
		
		String tipo = (danoAtual > danoAntigo) ? "BUFF" : "NERF";
		
		System.out.println(tipo);
		
		sc.close();
		

	}

}
