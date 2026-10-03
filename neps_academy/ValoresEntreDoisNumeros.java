import java.util.Scanner;
import java.util.stream.IntStream;

public class ValoresEntreDoisNumeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int menor = Math.min(a, b);
		int maior = Math.max(a, b);

		for (int i = menor; i <= maior; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("Com stream");
		
		//IntStream.range -> exclusivo -> range(1,5) -> 1, 2, 3, 4
		//IntStream.rangeClosed -> inclusivo -> rangeclosed(1,5) -> 1, 2, 3, 4, 5
 		IntStream.rangeClosed(Math.min(a, b), Math.max(a, b))
        		 .forEach(i -> System.out.print(i + " "));

		sc.close();

	}

}
