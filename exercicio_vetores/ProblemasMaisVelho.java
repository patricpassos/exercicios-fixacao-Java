import java.util.Scanner;

public class ProblemasMaisVelho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		int[] idade = new int[n];
		String[] nome = new String[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %sª pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		int maiorIdade = idade[0];      // Definir a pessoa com a maior idade dentro da coleção
		int posicao = 0;               // posição recebe o indice de incremento
		for (int i = 0; i < n; i++) {
			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				posicao = i;          // Para acessar a posição da varial utilizamos o start inicio e o incremento
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nome[posicao]); // O vetor nome recebe a variavel posição
		
		sc.close();

	}

}
