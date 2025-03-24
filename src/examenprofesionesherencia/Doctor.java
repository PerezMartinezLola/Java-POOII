package examenprofesionesherencia;

public class Doctor extends Profesion{

	public Doctor(String nombre, short anioDeNacimiento, String especialidad) {
		super(nombre, anioDeNacimiento, especialidad);
	}

	@Override
	public void trabajar() {
		System.out.printf("El Doctor [%s] esta atendiendo pacientes en el area de [%s]%n",
				getNombre(), getEspecialidad());
		
	}
	
	public void recetarMedicamento (String medicamento) {
		System.out.printf("El Doctor [%s] ha recetado el medicamento [%s]%n",
				getNombre(), medicamento);
	}
	
	
	

	
	
	
}
