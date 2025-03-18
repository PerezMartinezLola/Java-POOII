package figurasexamenherencia;

public class Triangulo extends FigurasGeometricas{
	private double base;
	private double altura;
	
	
	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base = base < 0 ? 0 : base;
		this.altura = altura < 0 ? 0 : altura;
	}


	@Override
	public double calcularArea() {
		return (base * altura) / 2;
	}


	@Override
	public double calcularPerimetro() {
		return 3 * base;
	}


	@Override
	public String toString() {
		return "Triangulo [base = " + base + ", altura = " + altura + super.toString();
	}
	
	
	
	

}
