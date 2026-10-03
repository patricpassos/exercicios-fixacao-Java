import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int precoA = switch(Integer.valueOf(a)) {
		case Integer p when p <= 17 -> 15;
		case Integer p when p <= 59 -> 30;
		default -> 20;
		};
		
		int precoB = switch(Integer.valueOf(b)) {
		case Integer p when p <= 17 -> 15;
		case Integer p when p <= 59 -> 30;
		default -> 20;
		};
		
		int total = precoA + precoB;

		System.out.println(total);
		
		sc.close();

	}

}
