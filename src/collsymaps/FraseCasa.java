package collsymaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class FraseCasa {
	public static void main(String[] args) {
		
		String frase = "En un lugar de la mancha de cuyo nombre de la tierra";
		String [] palabras = frase.split(" ");
		
		ArrayList <String> palabrasAL = new ArrayList <>();
		HashSet <String> palabrasSet = new HashSet<String>();
		TreeSet <String> palabrasSetOrdenadas = new TreeSet <>();
		HashMap<String, Integer> palabrasMap = new HashMap<>();
		
		
		for (String palabra : palabras) {
			palabrasAL.add(palabra);
			palabrasSet.add(palabra);
			palabrasSetOrdenadas.add(palabra);
		}
		System.out.println(palabrasAL);
		System.out.println(palabrasSet);
		System.out.println(palabrasSetOrdenadas);
		
		palabrasMap.put("En", 1);
		palabrasMap.put("un", 1);
		palabrasMap.put("lugar", 1);
		palabrasMap.put("de", 1);
		palabrasMap.put("la", 1);
		palabrasMap.put("mancha", 1);
		palabrasMap.put("de", 2);
		palabrasMap.put("nombre", 1);
		palabrasMap.put("de", 2);
		palabrasMap.put("la", 2);
		palabrasMap.put("tierra", 1);
		
		
	}
}
