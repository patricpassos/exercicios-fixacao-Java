import java.util.Scanner;

public class Cedulas1018Professor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int entrada, notas, resto, divisao;
		
		entrada = sc.nextInt();
		System.out.println(entrada);
		
		resto = entrada;
		
		notas = 100;
		divisao = resto / notas;
		System.out.println(divisao + " nota(s) de R$ " + notas + ",00");
		resto = resto % notas;
		
		notas = 50;
		divisao = resto / notas;
		System.out.println(divisao + " nota(s) de R$ " + notas + ",00");
		resto = resto % notas;
		
		notas = 20;
		divisao = resto / notas;
		System.out.println(divisao + " nota(s) de R$ " + notas + ",00");
		resto = resto % notas;
		
		notas = 10;
		divisao = resto / notas;
		System.out.println(divisao + " nota(s) de R$ " + notas + ",00");
		resto = resto % notas;
		
		notas = 5;
		divisao = resto / notas;
		System.out.println(divisao + " nota(s) de R$ " + notas + ",00");
		resto = resto % notas;
		
		notas = 2;
		divisao = resto / notas;
		System.out.println(divisao + " nota(s) de R$ " + notas + ",00");
		resto = resto % notas;
		
		notas = 1;
		divisao = resto / notas;
		System.out.println(divisao + " nota(s) de R$ " + notas + ",00");
		resto = resto % notas;
		
		sc.close();

	}

}
