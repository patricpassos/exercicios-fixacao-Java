import java.util.Scanner;

public class Teleferico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int capacidade = sc.nextInt();
		int totalAlunos = sc.nextInt(); 
		
		int vagasReais = capacidade - 1;
		int viagensTotal = totalAlunos / vagasReais;
		int sobraAlunos = totalAlunos % vagasReais;
		
		if(sobraAlunos != 0) {
			viagensTotal = viagensTotal + 1;
		}
		
		System.out.println(viagensTotal);
				
		sc.close();

	}

}
