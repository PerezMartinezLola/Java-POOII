package vehiculoexamenpooii;

public class Motocicleta extends Vehiculo {
	private String matricula;

	public Motocicleta(int velocidad, int velocidadMaxima, String color, int elementosHistorico, String matricula) {
		super(velocidad, velocidadMaxima, color, elementosHistorico);
		this.matricula = validarMatricula(matricula) ? matricula.toUpperCase() : "ABCD1234";
	}
	
	
	
	
}










