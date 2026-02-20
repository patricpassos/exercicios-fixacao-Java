import java.util.ArrayList;
import java.util.List;

public class Frutas {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Abacaxi");
		list.add("Pera");
		list.add("Laranja");
		list.add("Melancia");
		list.add("Maçã");
		
		System.out.println("Adicionando um item na posição zero: ");
		list.add(0, "Morango");
		
		for(String f : list) {
			System.out.println(f);
		}
		
		System.out.println("---------------------------------------");
		System.out.println("Inserção de multiplos elementos: .addAll()");
		
		List<String> novasFrutas = new ArrayList<>();
        novasFrutas.add("Jaca");
        novasFrutas.add("Manga");
        novasFrutas.add("Pitomba");
        
        list.addAll(0, novasFrutas);
		
        for(String nv : list) {
        	System.out.println(nv);
        }

	}

}
