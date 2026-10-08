import java.util.Scanner;

//return (n == 0) ? 0 : (n % 10) + soma(n /10);
public class SomaDeAlgarismo {

	public static long somaAlgarismo(long n) {
		long soma = 0;
		while (n != 0) {
			soma += n % 10;
			n /= 10;
		}
		return soma;
	}

	public static long somaAlgarismoRecursivo(long n) {
		return (n == 0) ? 0 : (n % 10) + somaAlgarismoRecursivo(n /10);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		System.out.println(somaAlgarismo(n));

		sc.close();

	}

}
