package collectionsymaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ForkJoinPool;

public class Test {

	// 1. Elimines los caracteres `.` `,` y `\n` del `String`.
	// 2. Obtengas un array de Strings con cada una de las palabras.
	private static String[] devuelvePalabras(String cuento) {
		
		//String cuentoSinCaracteres = cuento.replaceAll("[,.\n]", "");
		String cuentoSinCaracteres = cuento.replace(",", "").replace(".", "").replace("\n", "");
		//hacemos un array de String con cada palabra gracias a split(" ")
		//["Hola", "caracola", "esto", "es", "un", "cuento"]
		String [] cuentoSinCaracteresArray = cuentoSinCaracteres.split(" ");

		return cuentoSinCaracteresArray;
	}

	private static void arrayPalabras(String cuento) {
		int contador = 0;
		for (String palabra : devuelvePalabras(cuento)) {
			contador++;
			System.out.printf("[%s]", palabra);
			
		}
		System.out.printf("%nEste cuento tiene %d palabras", contador);
	}
	
	private static void ArrayListPalabras (String cuento) {
		ArrayList <String> cuentoAL = new ArrayList <>();
		
		for (String palabra : devuelvePalabras(cuento)) {
			cuentoAL.add(palabra);
			System.out.printf("[%s]", palabra);
		}
		System.out.printf("%nEste cuento tiene %d palabras", cuentoAL.size());
	}
	
	private static void hashSetPalabras (String cuento) {
		HashSet<String> cuentoSet = new HashSet<>();
		
		for (String palabra : devuelvePalabras(cuento)) {
			cuentoSet.add(palabra.toLowerCase());
			
		}
		for (String palabra : cuentoSet) {
			System.out.printf("[%s]", palabra.toLowerCase());
		}
		System.out.printf("%nEste cuento tiene %d palabras", cuentoSet.size());
	}
	
	private static void treeSetPalabras (String cuento) {
		TreeSet<String> cuentoTreeSet = new TreeSet <>();
		
		for (String palabra : devuelvePalabras(cuento)) {
			cuentoTreeSet.add(palabra.toLowerCase());
		}
		
		System.out.println();
		for (String palabra : cuentoTreeSet) {
			System.out.printf("[%s]", palabra.toLowerCase());
		}
		System.out.printf("%nEste cuento tiene %d palabras", cuentoTreeSet.size());
	}
	
	private static void mapConteoPalabras (String cuento){
		HashMap<String, Integer> mapCuento = new HashMap<>();
		
		for (String palabra : devuelvePalabras(cuento)) {
			if(mapCuento.get(palabra) == null) {
				mapCuento.put(palabra, 1);
			}else {
				mapCuento.put(palabra, mapCuento.get(palabra)+1);
			}
		}
		
		for (String palabra : mapCuento.keySet()) {
			System.out.printf("[%s(%d)]%n", palabra, mapCuento.get(palabra));
			
		}
		
		System.out.printf("%nEste cuento tiene %d palabras", mapCuento.size());
	}
	
	
	private static void mapConteoPalabrasOrdenadas (String cuento) {
		TreeMap<String, Integer> cuentoPalabrasOrdenadas = new TreeMap<>();
		
		for (String palabra: devuelvePalabras(cuento.toLowerCase())) {
			if(cuentoPalabrasOrdenadas.get(palabra) == null) {
				cuentoPalabrasOrdenadas.put(palabra, 1);
			}else {
				cuentoPalabrasOrdenadas.put(palabra.toLowerCase(), cuentoPalabrasOrdenadas.get(palabra)+1);
			}
		}
		
		for (String palabra : cuentoPalabrasOrdenadas.keySet()) {
			System.out.printf("[%s (%d)]%n", palabra, cuentoPalabrasOrdenadas.get(palabra));
		}
		System.out.printf("Este cuento tiene %d palabras", cuentoPalabrasOrdenadas.size());
		
	}
	
	//SIN TERMINAR
	private static void treeSetPalabrasOrdenadasInversas (String cuento) {
		TreeSet <String> cuentoTreeSetInverso = new TreeSet <>();
		
		for (String string : devuelvePalabras(cuento)) {
		
			
		}
	}
	
	public static void main(String[] args) {

		System.out.println("Cuento Zorro");
		System.out.printf("============%n");
		String cuento = CuentaCuentos.cuentoZorro();
		System.out.println(cuento);

		System.out.printf("%nCuentos sin , . y \n");
		System.out.printf("=====================%n");
		System.out.println(Arrays.toString(devuelvePalabras(CuentaCuentos.cuentoLechera())));

		System.out.printf("%nCuentos hechos arrays de palabras");
		System.out.printf("%n=================================%n");
		arrayPalabras(CuentaCuentos.cuentoLechera());
		
		System.out.println();
		System.out.printf("%nCuentos hechos ArrayList de palabras");
		System.out.printf("%n=====================================%n");
		ArrayListPalabras(CuentaCuentos.cuentoLechera());
		
		System.out.println();
		System.out.printf("%nCuentos hechos con HashSet de palabras");
		System.out.printf("%n=====================================%n");
		hashSetPalabras(CuentaCuentos.cuentoLechera());
		
		System.out.println();
		System.out.printf("%nCuentos hechos con TreeSet de palabras");
		System.out.printf("%n=====================================");
		treeSetPalabras(CuentaCuentos.cuentoLechera());
		
		System.out.println();
		System.out.printf("%nCuentos hechos con HashMap de palabras");
		System.out.printf("%n=====================================%n");
		mapConteoPalabras(CuentaCuentos.cuentoLechera());
		
		System.out.println();
		System.out.printf("%nCuentos hechos con TreeMap de palabras");
		System.out.printf("%n======================================%n");
		mapConteoPalabrasOrdenadas(CuentaCuentos.cuentoLechera());
		
		
	}
}
