package lacos.repeticao;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
        
		System.out.print("Digite um número para ver sua tabuada: ");
		int numero = scanner.nextInt();
		
		
		for(int cont = 0; cont <= 10; cont++) {
			int resul = numero * cont;
			System.out.println(numero + " x " + cont + " = " + resul);
			
			System.out.println("Segunda forma:"+numero * cont);
		}
		
	}

}
