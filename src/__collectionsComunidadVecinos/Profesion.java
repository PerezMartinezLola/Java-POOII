package __collectionsComunidadVecinos;

import java.util.Random;

public enum Profesion {

	IN("Ingeniero"), AR("Arquitecto"), ME("Medico"), CA("Camarero");
	private String profesion;
	private static Random random = new Random();

	private Profesion(String profesion) {
		this.profesion = profesion;
	}
	
	
	
	public String getProfesion() {
		return profesion;
	}


	public static Profesion profesionAleatoria() {
		Profesion [] arrayProfesion = Profesion.values();
		Profesion profesionAleatoria = arrayProfesion[random.nextInt(0, arrayProfesion.length)];
		return profesionAleatoria;
	}
	
	
}
