import java.util.Scanner;
import java.util.stream.IntStream;

public class FuncaoFatorial {

	public static int fatorial(int n) {
		int fat = 1;
		for(int i = n; i > 1; i--) {
			fat *= i;
		}
		return fat;
	}
	
	public static int fatorialStream(int n) {
		int fatorial = IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
		return fatorial;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int fatorial = fatorial(n);
		
		System.out.println(fatorial);
		
		sc.close();

	}

}
