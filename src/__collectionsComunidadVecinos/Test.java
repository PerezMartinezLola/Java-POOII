package __collectionsComunidadVecinos;

public class Test {
	
	public static void main(String[] args) {
		ComunidadVecinos cv1 = new ComunidadVecinos("Edificio Sol", 2);
		Persona p1 = new Persona("Ana", Profesion.CA, Ciudad.MA);
		Persona p2 = new Persona("Sandra", Profesion.CA, Ciudad.MA);
		Persona p3 = new Persona("Teo", Profesion.IN, Ciudad.VA);
		
		
		System.out.printf("Entra persona: %s%n", cv1.entraPersona(p1));
		cv1.reportComunidad();
		//System.out.printf("Entra persona: %s%n", cv1.entraPersona(p2));
		cv1.reportComunidad();
		cv1.reportProfesiones();
		cv1.reportCiudades();
		
		
	
	}
	
	
}
