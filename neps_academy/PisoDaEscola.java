import java.util.Scanner;

class Revestimento {
	
	public int largura;
	public int comprimento;
	
	public int quantidadeLosango() {
		int revestimentoExterno = largura * comprimento;
		int revestimentoInterno = (largura - 1) * (comprimento - 1);
		return revestimentoExterno + revestimentoInterno;
	}
	
	public int quantidadeTriangulo() {
		int revestimentoLateral = (largura - 1) * 2;
		int revestimentoSuperioInferior = (comprimento - 1) * 2;
		return revestimentoLateral + revestimentoSuperioInferior;
	}
	
	@Override
	public String toString() {
		return String.format("%d%n%d", quantidadeLosango(), quantidadeTriangulo());
	}
	
}

public class PisoDaEscola {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Revestimento piso = new Revestimento();
		
		piso.largura = sc.nextInt();
		piso.comprimento = sc.nextInt();
		
		System.out.println(piso);

		sc.close();

	}

}
