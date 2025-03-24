package __collections;

import java.util.Random;

public enum Color {
	RO("rojo"), NA("naranja"), AM("amarillo"), VE("verde"), AZ("azul"), IN("indigo"), VI("violeta");
	
	private String color;
	private static Random random = new Random();

	private Color(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public String show() {
		return String.format("Color: %s", color);
	}
	
	public static Color colorAleatorio() {
		Color [] coloresArray = Color.values();
		//int indiceColorAleatorio = random.nextInt(0, coloresArray.length);
		Color colorAleatorio = coloresArray [random.nextInt(0, coloresArray.length)];
		
		return colorAleatorio;
	}
	
	
	/*public static void main(String[] args) {
		Esta es una forma de hacerlo si necesito el valor varias veces
		Color c1 = Color.AM;
		System.out.println(c1.getColor());
		
		System.out.println(Color.AM.getColor());
		
		System.out.printf("Color aleatorio: %s", Color.colorAleatorio().getColor());
	}*/
	
}
