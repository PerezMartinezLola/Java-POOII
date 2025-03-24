package arraylistnotion;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AhorcadoEnMain {

	public static void main(String[] args) {
		ArrayList<String> coloresAL = new ArrayList<>();
		String[] colores = { "azul", "rosa", "amarillo", "verde", "naranja", "negro", "blanco" };

		for (String color : colores) {
			coloresAL.add(color);
		}

		int tamañoArrayList = coloresAL.size();

		Random random = new Random();
		int indiceRandom = random.nextInt(0, tamañoArrayList);
		String palabraOculta = coloresAL.get(indiceRandom);
		System.out.println(palabraOculta);


		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce tu intento: ");
		String intentoPalabra = scanner.next();
		System.out.printf("Introducido: %s%n", intentoPalabra);

		int intentosUsuario = 0;
		while (++intentosUsuario <= 3) {

			if (palabraOculta.equals(intentoPalabra)) {
				System.out.println("Acertaste la palabra, vaya crack!");
				break;
			}
			if (intentoPalabra.length() == 1 && palabraOculta.contains(intentoPalabra)) {
				System.out.println("contiene esta letra!");
				System.out.println();
			} else if (intentoPalabra.length() == 1 && !palabraOculta.contains(intentoPalabra)) {
				System.out.println("lo siento no contiene esta letra!");
				
			} else {
				System.out.println("Lo siento esa no es la palabra secreta! Prueba mejor a poner una letra y te daré pistas");
				
			}

			System.out.print("Introduce tu intento: ");
			intentoPalabra = scanner.next();
			System.out.printf("Introducido: %s%n", intentoPalabra);
			System.out.println();

		}
		if(intentosUsuario > 3 || !palabraOculta.equals(intentoPalabra)){ 
			System.out.println("Jooo, se te acabó el tiempo!");
		}
				
	}

}