package examenprofesionesherencia;

public class Profesor extends Profesion{

	public Profesor(String nombre, short anioDeNacimiento, String especialidad) {
		super(nombre, anioDeNacimiento, especialidad);
	}

	@Override
	public void trabajar() {
		System.out.printf("El Profesor [%s] esta enseñando a sus estudiantes [%s]%n",
				getNombre(), getEspecialidad());
		
	}
	
	public void calificarExamenes (int cantidadDeEstudiantes) {
		System.out.printf("El Profesor [%s] ha calificado [%s] estudiantes%n",
				getNombre(), cantidadDeEstudiantes);
	}
	
	
	

	
	
	
}
