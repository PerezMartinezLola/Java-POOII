package barajas;

import java.util.Random;

public class Baraja {
	private Carta[] cartas;
	private Carta[] cartasSacadas;

	public Baraja(int numCartas, String[] palos) {
		cartas = new Carta[numCartas * palos.length];
		cartasSacadas = new Carta[0];

		int pos = 0;
		for (String palo : palos) {
			for (int numCarta = 1; numCarta <= numCartas; numCarta++) {
				cartas[pos++] = new Carta(numCarta, palo);
			}
		}
	}

	
	// mostrar carta al azar
	public int mostrarCartaAlAzar() {
		Random random = new Random();
		int posicionAleatoria = random.nextInt(0, cartas.length);
		System.out.println(cartas[posicionAleatoria]);
		return posicionAleatoria;
	}
	
	public Carta sacarCartaAlAzar () {
		//Elijo la carta al azar tirando del metodo anterior
		int posicionASacar = mostrarCartaAlAzar();
		Carta cartaASacar = cartas [posicionASacar];
		
		//Creo los futuros arrays de cartas sacadas y de la baraja
		Carta [] nuevaCartas = new Carta [cartas.length -1];
		Carta [] nuevaCartasSacadas = new Carta [cartasSacadas.length + 1];
		
		//la carta elegida la añado al nuevo array de cartas sacadas
		for (int i = 0; i < cartasSacadas.length; i++) {
			nuevaCartasSacadas [i] = cartasSacadas [i];
		}
		nuevaCartasSacadas [nuevaCartasSacadas.length -1] =  cartaASacar;
		cartasSacadas = nuevaCartasSacadas;
		//la carta elegida la saco del nuevo array de cartas 
		int indexNuevaCartas = 0;
		for (int i = 0; i < cartas.length; i++) {
			if(i != posicionASacar) {
				nuevaCartas [indexNuevaCartas++] = cartas [i];
			}
		}
		
		cartas = nuevaCartas;
		//Finalmente devuelvo la carta que he sacado
		return cartaASacar;
	}


	// Pruebas
	public static void main(String[] args) {
		Carta carta1 = new Carta(7, "Espadas");
		Carta carta2 = new Carta(9, "Bastos");
		Baraja esp1 = new Baraja(10, new String[] { "Espadas", "Bastos", "Copas", "Oros" });

		System.out.printf("Pruebas de cartas%n");
		System.out.printf("=================%n");
		System.out.println(carta1.toString());
		System.out.println(carta2.toString());
		System.out.printf("%nCarta al azar%n");
		System.out.printf("===============%n");
		System.out.println(esp1.mostrarCartaAlAzar());

	}
}
