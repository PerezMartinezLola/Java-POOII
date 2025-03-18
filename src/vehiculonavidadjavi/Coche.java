package vehiculonavidadjavi;

public class Coche extends Vehiculo {
	private boolean puertasAbiertas;//false por defecto
	private boolean motorArrancado;
	private String matricula;
	
	
	public Coche(int velocidadMaxima, int numRuedas, double peso, String matricula) {
		super(velocidadMaxima, numRuedas, peso);
		this.matricula = matricula;
		puertasAbiertas = false;
		motorArrancado = false;
	}
	
	public void abrirPuertas(){
		puertasAbiertas = true;
		System.out.println("Puertas abiertas");
	}
	
	public void cerrarPuertas () {
		puertasAbiertas = false;
		System.out.println("Puertas cerradas");
	}

	
	public boolean arrancarMotor() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean detenerMotor() {
		// TODO Auto-generated method stub
		return false;
	}

	
	

	@Override
	public String toString() {
		return "Coche [" + super.toString() + "," + " puertasAbiertas = " + puertasAbiertas 
				+ ", motorArrancado = " + motorArrancado + ", matricula = " + matricula + "]";
				
				
	}
	
	
	
	
}
