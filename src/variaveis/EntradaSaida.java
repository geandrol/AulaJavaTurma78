package variaveis;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		String nome;
		
		/*System.out.println("Entre com a sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("Entre com a seu nome: ");
		ler.skip("\\R?");
		nome = ler.nextLine();
		
		System.out.println("Sua idade é: "+ idade + "Seu nome é: "+nome.toUpperCase());
		
		*/
		
		
		int quantidade = 1000121122;
		long identificador = 100013213111l;
		float altura = 25.4f; 
		double area = 45.4567;
		double tamanho = 650000000.00;
		char tipo = 'A';
		String palavra = "Generation";
		 
		//System.out.printf("Variável quantidade= %d", quantidade);
		//System.out.printf("Variável identificador = %d", identificador);
		System.out.printf("Variável altura = %.2f", altura);
		System.out.printf("Variável area = %.3f", area);
		//System.out.printf("Variável tamanho = %e", tamanho);
		//System.out.printf("Variável tamanho = %E", tamanho);
		//System.out.printf("Variável tipo = %c", tipo);
		//System.out.printf("Variável palavra = %s", palavra);
		
		

	}

}
