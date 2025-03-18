package figurasexamenherencia;

public abstract class FigurasGeometricas {
	private String color;
	
	
	
	public FigurasGeometricas(String color) {
		this.color = color;
	}
	
	
	public abstract double calcularArea (); 
	public abstract double calcularPerimetro ();
	
	public boolean compararAreas (FigurasGeometricas f) {
		return calcularArea() == f.calcularArea();
	}


	@Override
	public String toString() {
		return ", color = " + color + "]";
	}
	
	
	public static void main(String[] args) {
		FigurasGeometricas [] figuras = new FigurasGeometricas [4];
		figuras [0] = new Rectangulo("rojo", 20, 15);
		figuras [1] = new Circulo("verde", 10);
		figuras [2] = new Cuadrado("negro", 30);
		figuras [3] = new Triangulo("amarillo", 40, 35);
		
		System.out.printf("Figuras%n");
		System.out.printf("========%n");
		for (FigurasGeometricas figura : figuras) {
			System.out.println(figura.toString());
		}
		
		System.out.println();
		System.out.printf("Areas%n");
		System.out.printf("======%n");
		
		for (FigurasGeometricas figura: figuras) {
			System.out.printf("%s Area = %.2f%n",figura, figura.calcularArea());
		}
		
		System.out.println();
		System.out.printf("Perimetros%n");
		System.out.printf("==========%n");
		for (FigurasGeometricas figura : figuras) {
			System.out.printf("%s Perimetro = %.2f%n", figura, figura.calcularPerimetro());
		}
		
		System.out.println();
		System.out.printf("Comparar areas%n");
		System.out.printf("==============%n");
		System.out.println(figuras [0].compararAreas(figuras [1]));
		System.out.println(figuras [1].compararAreas(figuras [2]));
		System.out.println(figuras [2].compararAreas(figuras [3]));
		
		}
		
		
	}
	
	

