import java.util.Scanner;

public class Grenal1131 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vitoriaInter = 0;
		int vitoriaGremio = 0;
		int empates = 0;
		int novoGrenal = 1;

		while (novoGrenal == 1) {
			int golInter = sc.nextInt();
			int golGremio = sc.nextInt();
			
			if (golInter > golGremio) {
				vitoriaInter += 1;
			}
			else if (golGremio > golInter) {
				vitoriaGremio += 1;
			}
			else {
				empates += 1;
			}
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			novoGrenal = sc.nextInt();
		}
		
		int total = vitoriaGremio + vitoriaInter + empates;
		
		System.out.println(total + " grenais");
		System.out.println("Inter:" + vitoriaInter);
		System.out.println("Gremio:" + vitoriaGremio);
		System.out.println("Empates:" + empates);
		
		if (vitoriaInter > vitoriaGremio) {
			System.out.println("Inter venceu mais");
		}
		else if (vitoriaGremio > vitoriaInter) {
			System.out.println("Gremio venceu mais");
		}
		else {
			System.out.println("Nao houve vencedor");
		}
		
		sc.close();

	}

}
