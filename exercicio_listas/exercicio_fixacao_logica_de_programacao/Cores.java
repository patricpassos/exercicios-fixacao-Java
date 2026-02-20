package exercicio_fixacao_logica_de_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class  Cores {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Azul");
		list.add("Verde");
		list.add("Vermelho");
		list.add("Lilas");
		list.add("Vermelho");
		
		System.out.println("Lista de cores:");
		for(String c : list) {
			System.out.println(c);
		}
		
		System.out.println("------------------------------------");
		
		list.add("Azul");
		list.add("Verde");
		list.add("Vermelho");
		list.add("Lilas");
		list.add("Vermelho");
		
		List<String> distintos = list.stream().distinct().collect(Collectors.toList());
		// Converte a lista para stream
		// filtra os elemento unicos (informação externa)
		// converte de volta pra uma lista
	
		for(String d : distintos) {
			System.out.println(d);
		}
		
	}

}
