package arraylistnotion;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeras {

	private static String eleccionMaquina() {
		ArrayList<String> opcionesJuego = new ArrayList<>();
		opcionesJuego.add("piedra");
		opcionesJuego.add("papel");
		opcionesJuego.add("tijeras");

		Random random = new Random();
		// String eleccionMaquina = opcionesJuego.get(random.nextInt(0,
		// opcionesJuego.size()));
		return opcionesJuego.get(random.nextInt(0, opcionesJuego.size()));

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int intento = 0;
		int totalIntentos = 3;

		while (++intento <= totalIntentos) {

			String eleccionMaquina = eleccionMaquina();
			System.out.println(eleccionMaquina);

			System.out.println("Introduce piedra, papel o tijeras: ");
			String eleccionIntroducida = scanner.next();
			System.out.printf("Has introducido: %s%n", eleccionIntroducida);

			switch (eleccionMaquina) {
			case "piedra":
				switch (eleccionIntroducida) {
				case "piedra":
					System.out.println("Empate bebé");
					break;
				case "papel":
					System.out.println("Vamohh, el papel envuelve a la piedra! Has ganado!");
					break;
				case "tijeras":
					System.out.println("Ohh, la piedra machaca las tijeras! Has perdido!");
					break;
				}	
				break;
				
			case "papel":
				switch (eleccionIntroducida) {
				case "piedra":
					System.out.println("Ohh, el papel envuelve a la piedra! Has perdido!");
					break;
				case "papel":
					System.out.println("Empate bebe!");
					break;
				case "tijeras":
					System.out.println("Vamohh, las tijeras cortan el papel! Has ganado!");
					
					break;
				}
				break;
			
			case "tijeras":
				switch (eleccionIntroducida) {
				case "piedra":
					System.out.println("Vamohh, la piedra machaca las tijeras! Has ganado!");
					break;
				case "papel":
					System.out.println("Ohh, las tijeras cortan el papel! Has perdido!");
					break;
				case "tijeras":
					System.out.println("Empate bebé!");
					
					break;
				}	
				break;
			}
			
		}
		
		if (intento > totalIntentos) {
			System.out.println("Lo sientoo, se acabó el juego!");
		}
	}
}
