package examenprofesionesherencia;

public class Ingeniero extends Profesion{

	public Ingeniero(String nombre, short anioDeNacimiento, String especialidad) {
		super(nombre, anioDeNacimiento, especialidad);
	}

	@Override
	public void trabajar() {
		System.out.printf("El Ingeniero [%s] esta diseñando un proyecto de [%s]%n",
				getNombre(), getEspecialidad());
		
	}
	
	public double calcularCostoProyecto (double horas, double tarifaPorHoras) {
		return horas * tarifaPorHoras;
	}
	
	
	

	
	
	
}
