import java.util.Scanner;

public class Animal1049 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String classificacao, especie, alimentacao;
		
		classificacao = sc.next();
		especie = sc.next();
		alimentacao = sc.next();
		
		if (classificacao.equals("vertebrado") && especie.equals("ave") && alimentacao.equals("carnivoro")) {
			System.out.println("aguia");
		}
		if (classificacao.equals("vertebrado") && especie.equals("ave") && alimentacao.equals("onivoro")) {
			System.out.println("pomba");
		}
		
		if (classificacao.equals("vertebrado") && especie.equals("mamifero") && alimentacao.equals("onivoro")) {
			System.out.println("homem");
		}
		
		if (classificacao.equals("vertebrado") && especie.equals("mamifero") && alimentacao.equals("herbivoro")) {
			System.out.println("vaca");
		}
		
		if (classificacao.equals("invertebrado") && especie.equals("inseto") && alimentacao.equals("hematofago")) {
			System.out.println("pulga");
		}
		
		if (classificacao.equals("invertebrado") && especie.equals("inseto") && alimentacao.equals("herbivoro")) {
			System.out.println("lagarta");
		}
		
		if (classificacao.equals("invertebrado") && especie.equals("anelideo") && alimentacao.equals("hematofago")) {
			System.out.println("sanguessuga");
		}
		
		if (classificacao.equals("invertebrado") && especie.equals("anelideo") && alimentacao.equals("onivoro")) {
			System.out.println("minhoca");
		}
		
		sc.close();

	}

}
