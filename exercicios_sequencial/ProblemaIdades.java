import java.util.Scanner;

public class ProblemaIdades {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados da primeira pessoa: ");
		
		System.out.print("Nome: ");
		String nome1 = sc.next();
		
		System.out.print("Idade: ");
		int idade1 = sc.nextInt();
		
		System.out.print("Nome: ");
		String nome2 = sc.next();
		
		System.out.print("Idade: ");
		int idade2 = sc.nextInt();
		
		double mediaIdade = (double) (idade1 + idade2) / 2;
		
		System.out.println("A idade de " + nome1 + " e " + nome2 + " é de " + mediaIdade + " anos");
		
		sc.close();

	}

}
