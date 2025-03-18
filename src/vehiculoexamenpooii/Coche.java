package vehiculoexamenpooii;

public class Coche extends Vehiculo{
	private String matricula;
	private boolean parado;

	
	public Coche(int velocidad, int velocidadMaxima, String color, int elementosHistorico, String matricula) {
		super(velocidad, velocidadMaxima, color, elementosHistorico);
		this.matricula = validarMatricula(matricula) ? matricula.toUpperCase() : "ABCD1234";
	}
	
	
	
}
	



































	
	

	

	

	
	
	

