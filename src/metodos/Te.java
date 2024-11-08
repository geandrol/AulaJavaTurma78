package metodos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Te {

	public static void main(String[] args) {
		int limiteLista = 5;

		ArrayList<String> cores = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i <= 5; i++) {
			System.out.println("Digite as cores desejadas: ");
			cores.add(scanner.next());
		}
		System.out.println(cores);
		cores.sort(null);
		for (String ordem : cores) {
			System.out.println(ordem);
		}
		scanner.close();
	}
}
