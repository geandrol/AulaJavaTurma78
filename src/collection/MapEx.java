package collection;

import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {
		HashMap<Integer , String > pessoa = new HashMap<>();
		
		pessoa.put(1124122111, "Felipe ");
		pessoa.put(1124152111, "Sassão ");
		pessoa.put(1124152112, "Sassão ");
		
		System.out.println(pessoa);
		
		
		System.out.println(" " + pessoa.get(1124152111));
		

	}

}
