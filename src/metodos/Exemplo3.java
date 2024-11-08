package metodos;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		String classificacao =  classoficarIdade(scanner.nextInt());
		System.out.println(classificacao);
		
	}
	
	
	

	public static String classoficarIdade(int idade) {
		if(idade < 13) {
			return "Criança";
		}else if(idade < 18 ) {
			return "Adolescente";
		}else if(idade < 65) {
			return "Adulto";
		}else {
			return "Idoso";
		}			
	}

}
