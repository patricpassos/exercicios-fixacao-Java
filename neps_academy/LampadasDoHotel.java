import java.util.Scanner;

public class LampadasDoHotel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int iA = sc.nextInt();
		int iB = sc.nextInt();
		
		int fA = sc.nextInt();
		int fB = sc.nextInt();
		
		int c1 = 0;
		int c2 = 0;
		
		if (iB != fB) {
			c2++;
			iA = 1 - iA;
		} 
		
		if(iA != fA) {
			c1++;
		}
			
		int soma = c1 + c2;
		System.out.println(soma);
		
		sc.close();

	}

}
