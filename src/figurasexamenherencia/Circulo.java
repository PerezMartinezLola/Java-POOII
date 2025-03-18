package figurasexamenherencia;

public class Circulo extends FigurasGeometricas{
	 private double radio;
	 //private static final double PI = 3.1416; puede ponerse pero no es necesario
	 
	 
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio < 0 ? 0 : radio;
	}


	@Override
	public double calcularArea() {
		return  Math.PI* (radio* radio);
	}


	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}


	@Override
	public String toString() {
		return "Circulo [radio = " + radio + super.toString();
	}
	 
	 
	 
}
