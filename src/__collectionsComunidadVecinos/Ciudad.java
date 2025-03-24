package __collectionsComunidadVecinos;

import java.util.Random;

public enum Ciudad {
	
	MA("Madrid"), BA("Barcelona"), SE("Sevilla"), VA("Valencia");
	private String ciudad;
	private static Random random = new Random();

	private Ciudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	public String getCiudad() {
		return ciudad;
	}


	public static Ciudad ciudadAleatoria () {
		Ciudad [] arrayCiudad = Ciudad.values();
		int indiceAleatorio = random.nextInt(0, arrayCiudad.length);
		Ciudad ciudadAleatoria = arrayCiudad[indiceAleatorio];
		return ciudadAleatoria;
	}
	
}
