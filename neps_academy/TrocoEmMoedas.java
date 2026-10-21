import java.util.Scanner;

class CalculadoraTroco{
	
	public int valorTroco;
	private static final int[] MOEDAS_DISPONIVEIS = {100, 50, 25, 10, 5, 1};
	
	//Retorna o vetor preenchido com as quantidade de moedas
	public int[] quantidadeMoedas() {
		int[] qtdMoedas = new int[6];
		int resto = valorTroco;
		
		for (int i = 0; i < 6; i++) {
			qtdMoedas[i] = resto / MOEDAS_DISPONIVEIS[i];
            resto %= MOEDAS_DISPONIVEIS[i];
        }
		
		return qtdMoedas;
	}
	
	public int somaMoedas() {
		int[] qtdMoedas = quantidadeMoedas(); // recebe o vetor preenchido
		int soma = 0;
		for(int qtd : qtdMoedas) {
			soma += qtd;
		}
		return soma;
	}
	
	@Override
	public String toString() {
		int[] qtd = quantidadeMoedas();
		return String.format("%d%n", somaMoedas()) 
				+ String.format("%d%n", qtd[0])
				+ String.format("%d%n", qtd[1])
				+ String.format("%d%n", qtd[2])
				+ String.format("%d%n", qtd[3])
				+ String.format("%d%n", qtd[4])
				+ String.format("%d",   qtd[5]);
	}

}

public class TrocoEmMoedas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CalculadoraTroco calculadora = new CalculadoraTroco();
		
		calculadora.valorTroco = sc.nextInt();
		
		System.out.println(calculadora);
				
		sc.close();

	}

}
