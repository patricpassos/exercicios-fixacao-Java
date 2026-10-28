import java.util.Scanner;

class RelatorioVendas {
	
	private int pao;
	private int doce;
	private int bolo;
	
	public RelatorioVendas(int pao, int doce, int bolo) {
		this.pao = pao;
		this.doce = doce;
		this.bolo = bolo;
	}
	
	public int calcularPontuacao() {
		return pao + doce * 2 + bolo * 3;
	}
	
	@Override
	public String toString() {
		int pontos = calcularPontuacao();
		return switch(Integer.valueOf(pontos)) {
			case Integer p when p >= 150 -> "B";
			case Integer p when p >= 120 -> "D";
			case Integer p when p >= 100 -> "P";
			default -> "N";
		};
	}
	
}

public class Premio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantidadePaoVendidos = sc.nextInt();
		int quantidadeDoceVendidos = sc.nextInt();
		int quantidadeBoloVendidos = sc.nextInt();
		
		RelatorioVendas vendas = new RelatorioVendas(quantidadePaoVendidos, quantidadeDoceVendidos, quantidadeBoloVendidos);
		
		System.out.println(vendas);
		
		sc.close();

	}

}
