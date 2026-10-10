import java.util.Scanner;


public class SistemaDeUnidades {
	
	public static int criacaoVetor(int vet[], int n) {
		int tamanho = 0; //Conta a quantidade de digitos que o numero tem (usado como condicional de parada)
		for(int i = 0; i < vet.length; i++) {
			vet[i] = n % 10;
			n = n / 10;
			tamanho++;
			if(n == 0) {
				break;
			}
		}
		return tamanho;
	}
	
	public static void sistemaUnidade(int[] vet, int tamanho) {
		for(int i = 0; i < tamanho; i++) {
			String t = switch(Integer.valueOf(i)) {
			case Integer v when v == 0 ->  vet[i] + " Unidade";
			case Integer v when v == 1 ->  vet[i] + " dezena";
			case Integer v when v == 2 ->  vet[i] + " centena";
			case Integer v when v == 3 ->  vet[i] + " unidade de milhar";
			case Integer v when v == 4 ->  vet[i] + " dezena de milhar";
			case Integer v when v == 5 ->  vet[i] + " centena de milhar";
			case Integer v when v == 6 ->  vet[i] + " milhao";
			default -> vet[i] + "Erro";
			};
			System.out.println(t);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] vet = new int[7];
		
		int tamanho = criacaoVetor(vet, n);
		
		sistemaUnidade(vet, tamanho);
		
		sc.close();

	}

}
