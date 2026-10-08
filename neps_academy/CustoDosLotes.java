import java.util.Scanner;

public class CustoDosLotes {

	public static int precoDosLotes(int lote) {
		int precoEmbalagem = 8;
		return (lote < 20) ? lote * 4 + precoEmbalagem : lote * 3 + precoEmbalagem;
	}

	public static void orcamentoLote(int lote, int orcamento) {
		int precoLotes = precoDosLotes(lote);
		System.out.println(precoLotes);
		System.out.println((precoLotes <= orcamento) ? "YES" : "NO");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int lote = sc.nextInt();
			int orcamento = sc.nextInt();

			orcamentoLote(lote, orcamento);

		}

		sc.close();

	}

}
