package arraylistnotion;

import java.util.ArrayList;

public class ArrayListLibros {
	
	public static void main(String[] args) {
		ArrayList<String> libros = new ArrayList<>();
		libros.add("Cien años de soledad");
		libros.add("1984");
		
		System.out.printf("Dos libros%n");
		System.out.printf("==========%n");
		System.out.println(libros);
		
		
		libros.add("El principito");
		libros.add("El retrato de Dorian Grey");
		
		System.out.println();
		System.out.printf("Cuatro libros%n");
		System.out.printf("=============%n");
		System.out.println(libros);
		
		
		System.out.println();
		System.out.printf("Libros en Array con bucle foreach%n");
		System.out.printf("=================================%n");
		libros.toArray();
		for (String libro : libros) {
			System.out.println(libro);
		}
		
		
		System.out.println();
		System.out.printf("Libros en Array con bucle for%n");
		System.out.printf("=============================%n");
		
		for (int i = 0; i < libros.size(); i++) {
			System.out.println(libros.get(i));
			
		}
		
		}
		
		
} 
