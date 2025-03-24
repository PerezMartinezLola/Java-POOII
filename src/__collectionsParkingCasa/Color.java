package __collectionsParkingCasa;

import java.util.Random;

public enum Color {
	RO("rojo"), NA("naranja"), AM("amarillo"), VE("verde");
	private String color;
	private static Random random = new Random();

	private Color(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	
	public Color colorAleatorio() {
		Color [] coloresArray = Color.values();
		Color colorAleatorio = coloresArray[random.nextInt(0, coloresArray.length)];
		return colorAleatorio;
	}

	
	public static void main(String[] args) {
		System.out.println(Color.NA.getColor());
	}
}
