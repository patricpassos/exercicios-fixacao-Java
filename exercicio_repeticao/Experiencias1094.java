import java.util.Scanner;

public class Experiencias1094 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int entrada = sc.nextInt();
		
		int soma = 0;
		int somaCoelho = 0;
		int somaRato = 0;
		int somaSapo = 0;
		for (int i = 1; i <= entrada; i++) {
			
			int quantidadeCobaias = sc.nextInt();
			char tipoCobaia = sc.next().charAt(0);
			
			if (tipoCobaia == 'C') {
				somaCoelho +=  quantidadeCobaias;
			}
			else if (tipoCobaia == 'R') {
				somaRato += quantidadeCobaias;
			}
			else {
				somaSapo += quantidadeCobaias;
			}
			
			soma += quantidadeCobaias;
			
		}
		
		double porcentagemCoelho = (double) somaCoelho / soma * 100.0;
		double porcentagemRato = (double) somaRato / soma * 100.0;
		double porcentagemSapo = (double) somaSapo / soma * 100.0;
		
		System.out.println("Total: " + soma + " cobaias");
		System.out.println("Total de coelhos: " + somaCoelho);
		System.out.println("Total de ratos: " + somaRato);
		System.out.println("Total de sapos: " + somaSapo);
		
		System.out.printf("Percentual de coelhos: %.2f %%%n", porcentagemCoelho);
		System.out.printf("Percentual de ratos: %.2f %%%n", porcentagemRato);
		System.out.printf("Percentual de sapos: %.2f %%%n", porcentagemSapo);
		
		sc.close();

	}

}
