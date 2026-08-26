import java.util.Scanner;

public class TesteSelecao1035 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, somacd, somaab, restoa;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		somacd = c + d;
		somaab = a + b;
		restoa = a % 2;
		
		if (b > c && d > a && somacd > somaab && c > 0 && d > 0 && restoa == 0) {
			System.out.println("Valores aceitos");
		}
		else {
			System.out.println("Valores nao aceitos");
		}
		
		sc.close();

	}

}
