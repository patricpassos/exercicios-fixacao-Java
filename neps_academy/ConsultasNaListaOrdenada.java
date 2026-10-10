import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultasNaListaOrdenada {
	
	public static List<Integer> lista (Scanner sc){
		List<Integer> lista = new ArrayList<>();
	    int n = sc.nextInt();
	    for(int i = 0; i < n; i++) {
	        lista.add(sc.nextInt());
	    }
	    return lista;
	}
	
	public static boolean verificacaoLista(List<Integer> lista, int v) {
		for(int j = 0; j < lista.size(); j++) {
			if(v == lista.get(j)) {
				return true;
			}
		}
		return false;
	}
	
	public static void verificacaoStreams(List<Integer> lista, int v) {
		System.out.println(lista.contains(v) ? "YES" : "NO");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> lista = lista(sc);
		
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int v = sc.nextInt();
	        System.out.println(verificacaoLista(lista, v) ? "YES" : "NO");  
		 }
	
		sc.close();

	}

}
