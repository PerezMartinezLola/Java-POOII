package examenprofesionesherencia;

public abstract class Profesion  {
	private String nombre; //no se debe poner cambiar set
	private short anioDeNacimiento; //no se debe poner cambiar set
	private String especialidad;
	
	
	public Profesion(String nombre, short anioDeNacimiento, String especialidad) {
		this.nombre = nombre;
		this.anioDeNacimiento = anioDeNacimiento;
		this.especialidad = especialidad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public abstract void trabajar ();
	
	public short calcularEdad () {
		return (short) (2025 -anioDeNacimiento);
	}
	// set de nombre y anioDeNacimiento no puede existir

	@Override
	public String toString() {
		return "Profesion [nombre=" + nombre + ", anioDeNacimiento=" + anioDeNacimiento + ", especialidad="
				+ especialidad + "]";
	}
	
	

}
