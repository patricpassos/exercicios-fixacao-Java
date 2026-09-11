import java.util.Scanner;

public class PlantacaoMorangos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int largura01 = sc.nextInt();
		int comprimento01 = sc.nextInt();
		
		int largura02 = sc.nextInt();
		int comprimento02 = sc.nextInt();
		
		int area01 = largura01 * comprimento01;
		int area02 = largura02 * comprimento02;
		int maiorArea = 0;
		
		if(area01 > area02) {
			maiorArea = area01;
		}else {
			maiorArea = area02;
		}
		
		System.out.println(maiorArea);
		
		sc.close();
	}

}
