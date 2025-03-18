package vehiculonavidadjavi;

public class Motocicleta extends Vehiculo{
	private boolean motorArrancado;
	private String matricula;
	
	
	public Motocicleta(int velocidadMaxima, int numRuedas, double peso, String matricula) {
		super(velocidadMaxima, numRuedas, peso);
		this.matricula = matricula;
	}


	public void hacerCaballito () {
		System.out.println("Haciendo caballito");
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
		return "Motocicleta [" + super.toString() +
				" motorArrancado = " + motorArrancado + ", matricula = " + matricula + "]";
	}
	
	
}
