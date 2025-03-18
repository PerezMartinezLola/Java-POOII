package vehiculosherenciapracticaexamen;

public class Coche extends Vehiculo {
	private String matricula;
	private boolean puertasAbiertas;
	private boolean climatizador;
	private boolean ventanasBajadas;
	private boolean luzDeFreno;
	

	public Coche(int velocidadMaxima, int velocidad, int numRuedas, double peso, String matricula) {
		super(velocidadMaxima, velocidad, numRuedas, peso);
		this.matricula = matricula;

	}

	// cerrar puertas
	public boolean cerrarPuertas () {
		if(puertasAbiertas) {
			puertasAbiertas = false;
			return true;
		}
		return false;
	}

	// Abrir puertas
	public boolean abrirPuertas() {
		if(!puertasAbiertas) {
			puertasAbiertas = true;
			return true;
		}
		return false;
	}
	
	//Encender climatizador Condición: Solo podrás encender el climatizador si el coche no está a la máxima velocidad. 
	//Si el coche está parado, el climatizador ya está encendido por defecto, por lo que no debe realizar ninguna acción. 
	//El método debe retornar true si puede encenderse el climatizador y false si no puede.
	public boolean encenderClimatizador() {
		if(getVelocidad() < getVelocidadMaxima()) {
			climatizador = true;
			return true;
		}else if (getVelocidad() == 0){
			return false;
		}
		return false;
	}
	
	//subirVentanas: Solo podrás subir las ventanas si el coche está parado. Si el coche está en movimiento, no puedes subir
	//las ventanas. Si las ventanas ya están subidas, no se realiza ninguna acción.
	public boolean subirVentanas() {
	    // Verifica si las ventanas están bajadas y el vehículo está parado
	    if (ventanasBajadas && getVelocidad() == 0) {
	        ventanasBajadas = false; // Subimos las ventanas
	        return true; // Indica que la operación fue exitosa
	    }
	    // Retorna false si no se cumplen las condiciones para subir las ventanas
	    return false;
	}
	
	
	@Override
	public String toString() {
		return "Coche " + super.toString() + "," + " matricula = " + matricula + "," + " puertasAbiertas = "
				+ puertasAbiertas + "]";
	}

}
