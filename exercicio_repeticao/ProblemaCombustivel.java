import java.util.Scanner;

public class ProblemaCombustivel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
		int entrada = sc.nextInt();

		int contAlcool = 0;
		int contGasolina = 0;
		int contDiesel = 0;

		while (entrada != 4) {

			switch (entrada) {
			case 1:
				contAlcool++;
				break;
			case 2:
				contGasolina++;
				break;
			case 3:
				contDiesel++;
				break;
			}

			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			entrada = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + contAlcool);
		System.out.println("Gasolina: " + contGasolina);
		System.out.println("Diesel: " + contDiesel);

		sc.close();

	}

}
