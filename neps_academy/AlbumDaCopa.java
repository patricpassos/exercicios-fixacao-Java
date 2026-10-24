import java.util.Arrays;
import java.util.Scanner;

class Album {
	
	public int totalFiguras;
	public int[] figurasCompradas;
	
	int figurasQueFaltam() {
		int compras = (int) Arrays.stream(figurasCompradas).distinct().count();
		return totalFiguras - compras;
	}
	
	public String toString() {
		return String.format("%d", figurasQueFaltam());
	}
	
}

public class AlbumDaCopa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Album album = new Album();
		
		album.totalFiguras = sc.nextInt();
		
		int m = sc.nextInt();
		int[] vet = new int[m];
		
		for(int i = 0; i < m; i++) {
			vet[i] = sc.nextInt();
		}
		
		album.figurasCompradas = vet;
		
		System.out.println(album);
		
		
		sc.close();

	}

}
