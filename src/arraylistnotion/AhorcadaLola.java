package arraylistnotion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class AhorcadaLola {

	private static String generaPalabraSecreta() {
		ArrayList<String> palabras = new ArrayList<>();
		palabras.add("palo");
		palabras.add("flor");
		palabras.add("nieve");
		palabras.add("sombrero");
		palabras.add("platano");
		palabras.add("alfombra");
		palabras.add("botella");
		
		Random random = new Random();
		// String palabraSecreta = palabras.get(random.nextInt(0, palabras.size()));
		// return palabraSecreta;
		return palabras.get(random.nextInt(0, palabras.size()));

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String palabraSecreta = generaPalabraSecreta();
		System.out.println(palabraSecreta);

		int intento = 0;
		int totalIntentos = 5;
		boolean exito = false;
		char[] letrasAdivinadas = new char[palabraSecreta.length()];

		for (int i = 0; i < letrasAdivinadas.length; i++) {
			letrasAdivinadas[i] = '_';
		}

		while (++intento <= totalIntentos && !exito) {
			System.out.printf("[%d de %d] Introduce tu intento: %n", intento, totalIntentos);
			String letra = scanner.next();
			System.out.printf("[%d de %d] Esta es tu letra: %s%n", intento, totalIntentos, letra.charAt(0));

			for (int i = 0; i < palabraSecreta.length(); i++) {
				if (palabraSecreta.charAt(i) == letra.charAt(0)) {
					letrasAdivinadas[i] = letra.charAt(0);
				}
			}
			
			// Mensaje si la letra está en la palabra
			if (palabraSecreta.contains(letra)) {
			    System.out.println("¡Bien hecho! La letra está en la palabra.");
			} else {
			    // Mensaje si la letra no está en la palabra
			    System.out.println("Jooo, la letra no está en la palabra.");
			}
			
			
			for (char c : letrasAdivinadas) {
				System.out.print(c);
				System.out.print(" ");
			}
			System.out.println();

			exito = true;
			for (char c : letrasAdivinadas) {
				if (c == '_') {
					exito = false;
					break;
				}
			}
			if(exito) {
				System.out.println("Acertaste la palabra!");
			}
			
			if(intento == totalIntentos) {
				System.out.println("Lo siento se acabaron los intentos!");
			}
		}
	}
}
