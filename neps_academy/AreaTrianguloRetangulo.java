import java.util.Scanner;

public class AreaTrianguloRetangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, areaTriangulo;
		a = sc.nextInt();
		b = sc.nextInt();

		areaTriangulo = (a * b) / 2;

		System.out.println(areaTriangulo);

		sc.close();

	}

}
