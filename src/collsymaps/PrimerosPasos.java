package collsymaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class PrimerosPasos {
	public static void main(String[] args) {
		//el set es sensitive case
		//treeSet no importa el orden en que los almacene pero lo devuelve ordenado por orden alfabetico
		String frase = "La casa de la pradera es de todos";
		
		ArrayList <String> palabrasAL = new ArrayList<>();
		HashSet<String> palabrasSet = new HashSet<String>();
		TreeSet<String> palabrasTreeSet = new TreeSet<String>();
		
		
		String [] palabras = frase.split(" ");
		
		for (String palabra : palabras) {
			palabrasAL.add(palabra);
			palabrasSet.add(palabra.toLowerCase());
			palabrasTreeSet.add(palabra.toLowerCase());
		}
		System.out.println(palabrasAL);
		System.out.println("Palabras con set");
		System.out.println(palabrasSet);
		System.out.println(palabrasTreeSet);
		
		for (String palabra : palabras) {
			System.out.print(palabra + " ");
		}
		System.out.println();
		
		
		HashMap<String, Integer> contadorPalabras = new HashMap<>();
		//las claves no tienen ningun orden, se imprime de manera desordenada
		TreeMap<String, Integer> contadorPalabrasOrdenadas = new TreeMap<>();
		
		contadorPalabras.put("la", 1);
		contadorPalabras.put("casa", 1);
		contadorPalabras.put("de", 1);
		contadorPalabras.put("la", 2);
		contadorPalabras.put("pradera", 1);
		contadorPalabras.put("es", 1);
		contadorPalabras.put("de", 2);
		contadorPalabras.put("todos", 1);
		
		
		
		
		for (String palabra : palabrasAL) {
			//si la palabra no está le ponemos el valor 1
			palabra = palabra.toLowerCase();
			if(contadorPalabras.get(palabra) == null) {
				contadorPalabras.put(palabra, 1);
			}else {
				contadorPalabras.put(palabra, contadorPalabras.get(palabra) + 1);
			}
			if(contadorPalabrasOrdenadas.get(palabra) == null) {
				contadorPalabrasOrdenadas.put(palabra, 1);
			}else {
				contadorPalabrasOrdenadas.put(palabra, contadorPalabrasOrdenadas.get(palabra) + 1);
			}
		}
		System.out.println(contadorPalabras);
		System.out.println(contadorPalabrasOrdenadas);
		

		
		
		
	}
}
