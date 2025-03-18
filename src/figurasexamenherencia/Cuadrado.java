package figurasexamenherencia;

public class Cuadrado extends FigurasGeometricas{
	private double lado;

	
	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado < 0 ? 0 : lado;
	}


	@Override
	public double calcularArea() {
		return lado * lado;
	}


	@Override
	public double calcularPerimetro() {
		return 4 * lado;
	}


	@Override
	public String toString() {
		return "Cuadrado [lado = " + lado + super.toString();
	}
	
	
	

	
	
	
	

}
