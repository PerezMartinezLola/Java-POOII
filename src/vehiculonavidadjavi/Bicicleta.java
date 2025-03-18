package vehiculonavidadjavi;

public class Bicicleta extends Vehiculo{
	
	
	public Bicicleta(int velocidadMaxima, int numRuedas, double peso) {
		super(velocidadMaxima, numRuedas, peso);
	
	}

	public void cambiarMarcha () {
		System.out.println("Cambiando de marcha");
	}

	
	@Override
	public String toString() {
		return "Bicicleta [" + super.toString() + "]";
	}

}
