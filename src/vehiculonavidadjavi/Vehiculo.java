package vehiculonavidadjavi;

public abstract class Vehiculo {
	private int velocidadMaxima;
	private int velocidad;
	private int numRuedas;
	private double peso;
	//private String matricula; 
	
	
	public Vehiculo(int velocidadMaxima, int numRuedas, double peso) {
		this.velocidadMaxima = velocidadMaxima;
		this.numRuedas = numRuedas;
		this.peso = peso;
	
	}
	
	
	public boolean acelerar() {
		if (velocidad + 10 > velocidadMaxima) {
			velocidad = velocidadMaxima;
			return false;
		} else {
		velocidad+=10;
		return true;
		}
	}
	//public boolean frenar();
	public boolean frenar() {
		if (velocidad - 10 > velocidadMaxima) {
			velocidad = velocidadMaxima;
			return false;
		} else {
		velocidad -= 10;
		return true;
		}
	}
	
	@Override
	public String toString() {
		return "velocidadMaxima = " + velocidadMaxima + ", numRuedas = " + numRuedas + ", peso = " + peso;
	}
	
	
	
	
}
