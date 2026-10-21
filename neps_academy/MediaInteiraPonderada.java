import java.util.Scanner;

class CalculadoraMedia{
	
	public int NotaA;
	public int NotaB;
		
	public int mediaPonderada() {
		return (NotaA * 4 + NotaB * 6) / (4 + 5);
	}
	
	public String toString() {
		return String.format("%d", mediaPonderada());
	}
}

public class MediaInteiraPonderada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CalculadoraMedia mediaPonderada = new CalculadoraMedia();
		
		mediaPonderada.NotaA = sc.nextInt();
		mediaPonderada.NotaB = sc.nextInt();
		
		System.out.println(mediaPonderada);
		
		sc.close();

	}

}
