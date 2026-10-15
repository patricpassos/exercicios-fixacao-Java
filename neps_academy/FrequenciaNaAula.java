
import java.util.Arrays;
import java.util.Scanner;

public class FrequenciaNaAula {
	
	public static int contagemDeAlunos(int[] vet) {
		Arrays.sort(vet);
		int cont = 1;
		for(int i = 0; i < vet.length - 1; i++) {
			if(vet[i] != vet[i+1]) {
				cont++;
			}
		}
		return cont;
	}
	
	public static int contagemDeAlunosStreams(int[] vet) {
		return (int) Arrays.stream(vet).distinct().count();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] vet = new int[n];
		
		for(int i = 0; i < n; i++) {
			vet[i] = sc.nextInt();
		}
		
		System.out.println(contagemDeAlunos(vet));
		System.out.println(contagemDeAlunosStreams(vet));
		
		sc.close();

	}

}
