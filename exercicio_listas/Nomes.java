import java.util.ArrayList;
import java.util.List;

public class Nomes {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Joaquim");
		list.add("Maria");
		list.add("Jose");
		list.add("Alef");
		list.add("Alef");
		list.add("Juca");
		list.add("Mateo");
		
		System.out.println("Lista de nomes");
		for(String n : list) {
			System.out.println(n);
		}
		
		System.out.println("------------------------------------");
		
		//Lista com indices:
		System.out.println("Lista de nomes com os indices: .get()");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " - " + i);
		}
		
		System.out.println("------------------------------------");
		
		System.out.println("Condicional com lista: for each()");
		for(String j : list) {
			if(j.charAt(0) == 'J') {
				System.out.println(j);
			}
		}
		
		System.out.println("------------------------------------");
		System.out.println("Atualização simultanea: .set()");
		
		for(int i = 0; i < list.size(); i++) {
			String nome = list.get(i);
			String novoValor = nome + " - " + nome.length(); // conta a quantidade de letras
			list.set(i, novoValor); //ele é usado para substituir o elemento que já existe em uma posição (índice) específica por um novo elemento.
		}
		
		for(String n : list) {
			System.out.println(n);
		}

	}

}
