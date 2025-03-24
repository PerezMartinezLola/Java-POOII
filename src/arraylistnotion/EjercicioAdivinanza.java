package arraylistnotion;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EjercicioAdivinanza {

	public static int lanzamiento() {
		// random
		int lanzamiento;
		Random random = new Random();
		lanzamiento = random.nextInt(1, 101);
		System.out.printf("Lanzamiento Random de la maquina: %d%n", lanzamiento);
		return lanzamiento;
	}

	public static void main(String[] args) {

		ArrayList<Integer> historial = new ArrayList<>();

		int numOculto = lanzamiento();
		

		// programa escaner
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Introduce tu intento: ");
			int intento = scanner.nextInt();
			System.out.printf("Introducido: %d%n", intento);

			System.out.println();

			if (numOculto > intento) {
				System.out.println("El lanzamiento es menor que el numero aleatorio");
			}
			if (numOculto < intento) {
				System.out.println("El lanzamiento es mayor que el numero aleatorio");
			}
			if (numOculto == intento) {
				System.out.println("Has acertado con tu lanzamiento!!");
				break;
			}

			// historial

			historial.add(intento);
			System.out.println(historial);
		}
		System.out.println("Se acabó lo que se daba!!");

	}
}
/*	//HE INTENTADO PONER LA CONDICION DE QUE SE HAGAN MÁXIMO 5 LANZAMIENTOS PERO NO ME SALE
	//EL CÓDIGO VÁLIDO ESTA EN MI NOTION

	public static int lanzamiento() {
		// random
		
		Random random = new Random();
		int lanzamiento = random.nextInt(1, 101);
		System.out.printf("Lanzamiento Random de la maquina: %d%n", lanzamiento);
		return lanzamiento;
	}

	public static void main(String[] args) {

		ArrayList<Integer> historial = new ArrayList<>();

		int numOculto = lanzamiento();
		

		// programa escaner
		int vecesIntentos = 0;
		Scanner scanner = new Scanner(System.in);
		while (vecesIntentos < 5) {
			System.out.print("Introduce tu intento: ");
			int intento = scanner.nextInt();
			vecesIntentos++;
			System.out.printf("Introducido: %d%n", intento);

			System.out.println();

			if (numOculto > intento) {
				System.out.println("El lanzamiento es menor que el numero aleatorio");
			}
			if (numOculto < intento) {
				System.out.println("El lanzamiento es mayor que el numero aleatorio");
			}
			if (numOculto == intento) {
				System.out.println("Has acertado con tu lanzamiento!!");
				
			if(vecesIntentos == 5) {
				System.out.println("Se acabó lo que se daba!!");
			}
			}

			// historial

			historial.add(intento);
			System.out.println(historial);
		}
		

	}
}*/