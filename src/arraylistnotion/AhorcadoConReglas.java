package arraylistnotion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AhorcadoConReglas {

	public static void main(String[] args) {
		// Palabra secreta: Una palabra es seleccionada aleatoriamente desde un conjunto
		// predefinido de palabras.
		// Adivinanzas: El jugador adivina letras, y si la letra está en la palabra, se
		// revela en el lugar
		// correspondiente. Si no está, se registra un fallo.
		// Array para las letras adivinadas: Usamos un Array para almacenar las letras
		// que el jugador ha adivinado.
		// Revelación de la palabra: Se debe mostrar la palabra actual con las letras
		// adivinadas correctamente
		// y guiones para las letras no adivinadas.
		// Límites: El jugador tiene un número limitado de intentos para adivinar la
		// palabra correctamente.

		ArrayList<String> coloresAL = new ArrayList<>();
		String[] colores = { "azul", "rosa", "amarillo", "verde", "naranja", "negro", "blanco" };

		for (String color : colores) {
			coloresAL.add(color);
		}

		int tamañoArrayList = coloresAL.size();

		// Crear palabra oculta
		Random random = new Random();
		int indiceRandom = random.nextInt(0, tamañoArrayList);
		String palabraOculta = coloresAL.get(indiceRandom);
		System.out.println(palabraOculta);

		// Crear

		char[] letrasAdivinadas = new char[palabraOculta.length()];
		int intento = 0;
		int intentosMaximos = 5;
		boolean palabraCompletada = false;

		for (int i = 0; i < letrasAdivinadas.length; i++) {
			letrasAdivinadas[i] = '_';
		}

		while (++intento <= intentosMaximos && !palabraCompletada) {

			Scanner scanner = new Scanner(System.in);
			System.out.printf("%nIntroduce tu intento: ");
			String intentoLetra = scanner.next();
			System.out.printf("Introducido: %s%n", intentoLetra);
			System.out.printf("[Intento %d de %d]%n", intento, intentosMaximos);

			// si la letra propuesta la contiene la palabra oculta
			for (int i = 0; i < palabraOculta.length(); i++) {
				if (palabraOculta.charAt(i) == intentoLetra.charAt(0)) {
					letrasAdivinadas[i] = intentoLetra.charAt(0);

				}
			}
			// Imprimir
			for (char c : letrasAdivinadas) {
				System.out.print(c);
				System.out.print(" ");
			}

			// si he completado la palabra
			palabraCompletada = true;
			for (char c : letrasAdivinadas) {
				if (c == '_') {
					palabraCompletada = false;
					break;

				}
			}
			// si he llegado a los intentos máximos
			if (intento == intentosMaximos && !palabraCompletada) {
				System.out.printf("%njoo, se acabaron los intentos");

			}

			if (palabraCompletada) {
				System.out.printf("%nFantástico, ya conseguiste encontrar la palabra!");
			}

		}

	}

}
