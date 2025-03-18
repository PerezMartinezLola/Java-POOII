package vehiculosherenciapracticaexamen;

public class Moto extends Vehiculo{
	private String matricula;
	private boolean estaEnCaballito;
	

	public Moto(int velocidadMaxima, int velocidad, int numRuedas, double peso, String matricula) {
		super(velocidadMaxima, velocidad, numRuedas, peso);
		this.matricula = matricula;
	}
	
	//hacer caballito si la velocidad del motor es menor o igual a 20 km/h
	public boolean hacerCaballito() {
		if(estaEnCaballito) {
			return false;
		}else if(getVelocidad() <= 20) {
			estaEnCaballito = true;
			return true;
		}
		return false;
	}
	
	//dejar de hacer caballito
	public boolean dejarCaballito () {
		if(!estaEnCaballito) {
			return false;
		}else {
			estaEnCaballito = false;
			return true;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Moto " + super.toString() + "," + " matricula = " + matricula + "]";
	}

	
	
}
