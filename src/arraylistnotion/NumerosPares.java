package arraylistnotion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class NumerosPares {
	


public static void mostrarYsubrayar(String texto) {
		System.out.println();
		System.out.println(texto);
		for (int i = 0; i < texto.length(); i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	private static String palabra() {
		String palabra = "";
		for (int i = 0; i < 4; i++) {
			Random random = new Random();
			char charAleatorios = (char) random.nextInt('a', 'z');
			palabra += charAleatorios;

		}
		return palabra;
	}

	public static void main(String[] args) {
		// Crea un ArrayList que contenga n números pares.

		ArrayList<Integer> alNumerosPares = new ArrayList<>();

		int numerosArrayList = 5;
		int contadorPares = 0;

		for (int num = 0; contadorPares < numerosArrayList; num++) {
			if (num % 2 == 0) {
				contadorPares++;
				alNumerosPares.add(num);
			}
		}

		mostrarYsubrayar("Pares");
		System.out.println(alNumerosPares);

		// .Crea un ArrayList que contenga los n números múltiplos de m a partir de un
		// número dado p.
		ArrayList<Integer> listaMultiplos = new ArrayList<>();

		numerosArrayList = 5;
		int numeroInicial = 2;
		int multiplosDe = 4;

		while (listaMultiplos.size() < numerosArrayList) {
			if (numeroInicial % multiplosDe == 0) {
				listaMultiplos.add(numeroInicial);

			}
			numeroInicial++;
		}

		mostrarYsubrayar("Multiplos");
		System.out.println(listaMultiplos);

		// Crea un ArrayList de Strings de 4 letras aleatorias del alfabeto inglés en
		// minúsculas, con 1000 palabras.
		ArrayList<String> listaPalabrasAleatorias = new ArrayList<>();

		// ArrayList de palabras Random
		ArrayList<String> palabrasRandom = new ArrayList<>();

		numerosArrayList = 20;

		for (int i = 0; i < numerosArrayList; i++) {
			palabrasRandom.add(palabra());

		}
		mostrarYsubrayar("Palabras aleatorias");
		System.out.println(palabrasRandom);

		// Luego recórrelo y crea otro nuevo ArrayList, donde estén las palabras que
		// terminan por a o c

		//contador de palabras que terminana en AoC
		
		ArrayList <String> palabrasTerminadasAc = new ArrayList <>();

		for (int i = 0; i < palabrasRandom.size(); i++) {
			if (palabrasRandom.get(i).endsWith("a") || palabrasRandom.get(i).endsWith("c")) {
				palabrasTerminadasAc.add(palabrasRandom.get(i));
			}

		}
		mostrarYsubrayar("Palabras terminadas a o c");
		System.out.println(palabrasTerminadasAc.size());
		
		
		mostrarYsubrayar("ArrayList con palabras terminadas en a o c");
		System.out.println(palabrasTerminadasAc);
		
		
		
		
	}
}














/*
 * int cantidadNumeros = 6; int numeroDado = 3; int multiplosDe = 2;
 * 
 * int contadorMultiplos = 0;
 * 
 * for (int i = numeroDado; contadorMultiplos < cantidadNumeros; i++) { if(i %
 * multiplosDe == 0) { contadorMultiplos++; alNumerosMultiplos.add(i); } }
 * mostrarYsubrayar("multiplos"); System.out.println(alNumerosMultiplos);
 */

/*
 * public static void main(String[] args) { //Crea un ArrayList que contenga los
 * primeros n números pares. int contadorPares = 0; int nPrimerosNumeros = 4;
 * ArrayList <Integer> numerosPares = new ArrayList <>(); for (int num = 0;
 * contadorPares < nPrimerosNumeros; num++) { if(num % 2 == 0) {
 * contadorPares++; numerosPares.add(num); } }
 * 
 * mostrarYsubrayar("Numeros pares"); System.out.println(numerosPares);
 * 
 * //Crea un ArrayList que contenga los primeros n números múltiplos de m //a
 * partir de un número dado p
 * 
 * ArrayList <Integer> listaMultiplos = new ArrayList <>();
 * 
 * int cantidadNumeros = 3; int numeroInicial = 3; int multiploDe = 4;
 * 
 * int actual = numeroInicial;
 * 
 * while (listaMultiplos.size() < cantidadNumeros) { if(actual % multiploDe ==
 * 0) { listaMultiplos.add(actual);
 * 
 * } actual++; }
 * 
 * mostrarYsubrayar("Numeros multiplos"); System.out.println(listaMultiplos);
 * 
 * //si haces "" + char } }
 */
