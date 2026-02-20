import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cor {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Azul");
		list.add("Verde");
		list.add("Vermelho");
		list.add("Lilas");
		list.add("Vermelho");

		System.out.println("Lista de cores:");
		for (String c : list) {
			System.out.println(c);
		}

		System.out.println("------------------------------------");

		System.out.println("Removendo cores repetidas: .distinct()");
		List<String> distintos = list.stream().distinct().collect(Collectors.toList());
		// Converte a lista para stream
		// filtra os elemento unicos (informação externa)
		// converte de volta pra uma lista

		for (String d : distintos) {
			System.out.println(d);
		}

		System.out.println("------------------------------------");

		     // x.equals("Verde") selecionaria apenas o Verde.
    		// !x.equals("Verde") seleciona tudo o que for diferente de Verde.
		 
		System.out.println("Filtrando uma cor pelo nome completo: x.equals()");
		List<String> filtro = list.stream().filter(x -> !x.equals("Verde")).collect(Collectors.toList());

		for (String f : filtro) {
			System.out.println(f);
		}

		System.out.println("------------------------------------");

		//ordem derescente (z-a)
		//também serve para numeros
		System.out.println("Ordenação de z-a: Collections.sort()");
		Collections.sort(list, Collections.reverseOrder());

		for (String l : list) {
			System.out.println(l);
		}

		System.out.println("------------------------------------");

		//Ordem crescente (a-z)
		//também serve para numeros
		System.out.println("Ordenação de a-z");
		Collections.sort(list);

		for (String l : list) {
			System.out.println(l);
		}

	}

}
