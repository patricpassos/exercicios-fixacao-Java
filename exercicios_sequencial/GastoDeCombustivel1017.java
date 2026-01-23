import java.util.Scanner;

public class GastoDeCombustivel1017 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tempoGasto = sc.nextInt();
		int velocidadeMedia = sc.nextInt();
		int consumoCarro = 12;
		
		double litros = (double) velocidadeMedia * tempoGasto / consumoCarro;
		
		System.out.printf("%.3f%n", litros);
		
		sc.close();
	}

}
