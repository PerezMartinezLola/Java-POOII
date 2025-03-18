package figurasexamenherencia;

public class Rectangulo extends FigurasGeometricas{
	private double base;
	private double altura;
	
	
	public Rectangulo(String color, double base, double altura) {
		super(color);
		this.base = base < 0 ? 0 : base;
		this.altura = altura < 0 ? 0 : altura;
	}


	@Override
	public double calcularArea() {
		return base * altura;
	}


	@Override
	public double calcularPerimetro() {
		return 2 * (base +altura);
	}


	@Override
	public String toString() {
		return "Rectangulo [base = " + base + ", altura = " + altura + super.toString();
	}
	
	
	
	
	
	
	
	
	
}
