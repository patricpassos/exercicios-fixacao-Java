import java.util.Scanner;
import java.util.stream.IntStream;

public class SomaElementos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int soma = 0;
		for (int i = 0; i < n; i++) {
			int v = sc.nextInt();
			soma += v;
		}

		System.out.println(soma);

		System.out.println("--Soma com streams--");
		int somaStreams = IntStream.generate(sc::nextInt) // cria o fuxo que digitado pelo usuario
								   .limit(n) //Garante que o stream só vai até a quantidade m informada
								   .sum(); //realiza a soma dos valores digitado peo usuario
		
		System.out.println(somaStreams);

		sc.close();

	}

}
