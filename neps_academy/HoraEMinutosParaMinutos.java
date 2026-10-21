import java.util.Scanner;

class Minutos {
	
	public int horas;
	public int minutos;
	
	public int totalMinutos() {
		return horas * 60 + minutos;
	}
	
	@Override
	public String toString() {
		return String.format("%d", totalMinutos());
	}
	
}

public class HoraEMinutosParaMinutos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Minutos transformacao = new Minutos();
		
		transformacao.horas = sc.nextInt();
		transformacao.minutos = sc.nextInt();
		
		System.out.println(transformacao);
		
		sc.close();

	}

}
