import java.util.HashSet;
import java.util.Scanner;

public class LoteriaSet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HashSet<Integer> setJogo = new HashSet<>();
		HashSet<Integer> setResultados = new HashSet<>();

		for (int i = 0; i < 6; i++) {
			setJogo.add(sc.nextInt());
		}

		for (int i = 0; i < 6; i++) {
			setResultados.add(sc.nextInt());
		}

		// retem ou mantem dentro do setJogo apenas os correspondetes o resto e apagado
		setJogo.retainAll(setResultados);
		
		// qual e o tamanho dos vares que estão dentro do setJogo
		int cont = setJogo.size();

		String classificacao = switch (Integer.valueOf(cont)) {
		case Integer c when c == 6 -> "sena";
		case Integer c when c == 5 -> "quina";
		case Integer c when c == 4 -> "quadra";
		case Integer c when c == 3 -> "terno";
		default -> "azar";
		};

		System.out.println(classificacao);

		sc.close();

	}

}
