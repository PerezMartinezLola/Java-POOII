package universo;

public class Persona {
	public String nombre;
	public String primerApellido;
	public String segundoApellido;
	public int DNISinLetra;
	public char letraDNIMayusculas;
	public int anioNaciomiento;
	public char genero; //‘V’ y ‘H’
	public int personaID;
	public static long nextPersonaID = 0;
	
	
	public Persona(String nombre, String primerApellido, String segundoApellido, char genero) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		anioNaciomiento = 2022;
		this.genero = genero;
		personaID = (int) nextPersonaID++;
	}


	public Persona(String nombre, String primerApellido, String segundoApellido, int DNISinLetra,
			char letraDNIMayusculas, int anioNaciomiento, char genero) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.DNISinLetra = DNISinLetra;
		this.letraDNIMayusculas = letraDNIMayusculas;
		this.anioNaciomiento = anioNaciomiento;
		this.genero = genero;
		personaID = (int) nextPersonaID++;
	}
	
	
	private String DNIcompleto() {
		String DNIcompleto = "";
		String DNIsinLetraString = DNISinLetra + "";
		boolean letraDNIvalida = false;
		
		if(letraDNIMayusculas > 'A' &&  letraDNIMayusculas < 'Z') {
				letraDNIvalida = true;
		}
		
		if(DNISinLetra > 0 && letraDNIvalida) { 
			 DNIcompleto = DNIsinLetraString + letraDNIMayusculas;
			 return DNIcompleto;
		}
		return null;
	}
	
	
	
	
}
