import java.util.Scanner;

class Conversor {
	
	public int minutos;
	
	public int horas() {
		return minutos / 60;
	}
	
	public int minutos() {
		return minutos % 60;
	}
	
	@Override
	public String toString() {
		return String.format("%d\n%d", horas(), minutos());
	}
	
}

public class MinutosParaHorasEMinutos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Conversor conversor = new Conversor();
		
		conversor.minutos = sc.nextInt();
		
		System.out.println(conversor);
		
		sc.close();

	}

}
