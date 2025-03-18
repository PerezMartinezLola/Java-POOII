package vehiculosherenciapracticaexamen;

public abstract class Vehiculo {
	private int velocidadMaxima;
	private int velocidad;
	private int numRuedas;
	private double peso;
	
	
	public Vehiculo(int velocidadMaxima,int velocidad, int numRuedas, double peso) {
		this.velocidadMaxima = velocidadMaxima < 0 ? 0 : velocidadMaxima;
		this.velocidad = velocidad < 0 ? 0 : velocidad;
		this.numRuedas = numRuedas;
		this.peso = peso;
		
		
	}
	
	//metodos comunes arrancar, parar, acelerar, frenar
	public boolean arrancar () {
		if(velocidad == 0) {
			velocidad = 1;
			return true;
		}
		return false;
	}
	
	public boolean parar () {
		if(velocidad > 0) {
			velocidad = 0;
			return true;
		}
		return false;
	}
	
	public int acelerar (int velocidadAceleracion) {
		if(velocidad + velocidadAceleracion <= velocidadMaxima) {
			velocidad += velocidadAceleracion;
		}else {
			velocidad = velocidadMaxima;
		}
		return velocidad;
	}
	
	public int frenar (int velocidadFrenada) {
		if(velocidad > velocidadFrenada) {
			velocidad -= velocidadFrenada;
		}
		return velocidad;
	}

	@Override
	public String toString() {
		return "[velocidadMaxima = " + velocidadMaxima + ", velocidad = " + velocidad + ", numRuedas = " + numRuedas
				+ ", peso = " + peso ;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	
	
}


