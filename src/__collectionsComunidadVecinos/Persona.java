package __collectionsComunidadVecinos;

import java.util.Objects;

public class Persona {
	private String nombre;
	private Profesion profesion;
	private Ciudad ciudad;
	
	public Persona(String nombre, Profesion profesion, Ciudad ciudad) {
		this.nombre = nombre;
		this.profesion = profesion;
		this.ciudad = ciudad;
	}
	
	public Persona() {
		profesion = Profesion.profesionAleatoria();
		ciudad = Ciudad.ciudadAleatoria();
	}
	
	public String getNombre() {
		return nombre;
	}

	public Profesion getProfesion() {
		return profesion;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ciudad, profesion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return ciudad == other.ciudad && profesion == other.profesion;
	}

	@Override
	public String toString() {
		return "Persona: " + nombre + " " + profesion + " " +  ciudad;
	}
	public static void main(String[] args) {
		Persona p1 = new Persona("Ana", Profesion.AR, Ciudad.BA);
		System.out.println(p1);
	}
}
