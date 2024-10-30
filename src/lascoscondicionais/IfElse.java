package lascoscondicionais;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner escrever = new Scanner(System.in);
		float nota1, nota2, media, cont=0;

		System.out.println("Digite a nota da P1:");
		nota1 = escrever.nextFloat();

		System.out.println("Digite a nota da P2:");
		nota2 = escrever.nextFloat();

		// Calculo da media

		media = (nota1 + nota2) / 2;

		if (media >= 5) {
			cont ++;
			System.out.printf(cont + "Parabêns você foi aprovado!" + media );
		} else {
			System.out.println(cont + "Reprovado, estude mais!" + media);
		}
		
		escrever.close();
	}

}
