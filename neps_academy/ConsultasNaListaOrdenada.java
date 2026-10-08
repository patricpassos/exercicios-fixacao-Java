import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultasNaListaOrdenada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> lista = new ArrayList<>();
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			lista.add(sc.nextInt());
		}
		
		int q = sc.nextInt();
		
		for(int i = 0; i < q; i++) {
			int v = sc.nextInt();
			if(v == lista.get(i)) {
				System.out.println("YES");
			} else {
				
			}
		}
		
		System.out.println(lista);
		
		
		
		sc.close();
		

	}

}
