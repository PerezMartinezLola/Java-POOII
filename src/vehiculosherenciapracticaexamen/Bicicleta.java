package vehiculosherenciapracticaexamen;

public class Bicicleta extends Vehiculo{

	public Bicicleta(int velocidadMaxima, int velocidad, int numRuedas, double peso) {
		super(velocidadMaxima, velocidad, numRuedas, peso);
	}

	@Override
	public String toString() {
		return "Bicicleta " + super.toString() + "]";
	}
	
}
