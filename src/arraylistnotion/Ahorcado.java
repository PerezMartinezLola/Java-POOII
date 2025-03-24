package arraylistnotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
	//Palabra secreta: Una palabra es seleccionada aleatoriamente desde un conjunto predefinido de palabras.
	//Adivinanzas: El jugador adivina letras, y si la letra está en la palabra, se revela en el lugar 
	//correspondiente. Si no está, se registra un fallo.
	//Array para las letras adivinadas: Usamos un Array para almacenar las letras que el jugador ha adivinado.
	//Revelación de la palabra: Se debe mostrar la palabra actual con las letras adivinadas correctamente
	//y guiones para las letras no adivinadas.
	//Límites: El jugador tiene un número limitado de intentos para adivinar la palabra correctamente.
	
	
	
	private static String palabraSecreta() {
		//codigo repetido
		ArrayList <String> coloresAL= new ArrayList<>();
		String [] colores = {"azul", "rosa", "amarillo", "verde", "naranja", "negro", "blanco"};
		
		for (String color: colores) {
			coloresAL.add(color);
		}
		
		int tamañoArrayList = coloresAL.size();
		
		Random random = new Random ();
		int indiceRandom = random.nextInt(0,tamañoArrayList);
		String palabra = coloresAL.get(indiceRandom);
		
		return palabra;
		
	}
	
	public static String intento () {
		//codigo repetido
		ArrayList <String> coloresAL= new ArrayList<>();
		String [] colores = {"azul", "rosa", "amarillo", "verde", "naranja", "negro", "blanco"};
		
		for (String color: colores) {
			coloresAL.add(color);
		}
		
		//refactorizar quizas
		int tamañoArrayList = coloresAL.size();
		String intentoPalabra = "";
		char intentoChar = ' ';
		
		//intento palabra
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce tu intento: ");
		intentoPalabra = scanner.next();
		System.out.printf("Introducido: %s%n", intentoPalabra);
		
		return intentoPalabra;
		
	}
	
	private static boolean compararIntento() {
		
		String palabra = palabraSecreta();
		
		//comparar palabras
		String intentoPalabra = intento();
		
		if(palabra.equals(intentoPalabra)) {
			System.out.println("Acertaste");	
		}
		return true;
			
		
	}
	public static void main(String[] args) {
		System.out.printf("La palabra Secreta es: %s%n", palabraSecreta());
		
		char intentoChar = ' ';
		String intentoPalabra = "";
		
	/*	//intento char
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce tu intento: ");
		intentoChar = (char) scanner.nextInt('a', 'c');
		System.out.printf("Introducido: %d%n");*/
		
		intento();
		compararIntento();
		
	}
}
