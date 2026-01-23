import java.util.Scanner;

public class Mes1052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mesNumero = sc.nextInt();
		String mesNome;
		
		switch (mesNumero) {
		case 1:
			mesNome = "January";
			break;
		case 2:
			mesNome = "February";
			break;
		case 3:
			mesNome = "March";
			break;
		case 4:
			mesNome = "April";
			break;
		case 5:
			mesNome = "May";
			break;
		case 6:
			mesNome = "June";
			break;
		case 7:
			mesNome = "July";
			break;
		case 8:
			mesNome = "August";
			break;
		case 9:
			mesNome = "September";
			break;
		case 10:
			mesNome = "October";
			break;
		case 11:
			mesNome = "November";
			break;
		case 12:
			mesNome = "December";
			break;
		default:
			mesNome = "";
			break;		
		}
		
		System.out.println(mesNome);
		
		sc.close();

	}

}
