import java.util.Scanner;

public class AreaDoRetangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int areaRetangulo = a * b;

		System.out.println(areaRetangulo);

		sc.close();

	}

}
