package __parkingCasa;

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


	public static Color colorAleatorio() {
		Color [] arrayColores = Color.values();
		Color colorAleatorio = arrayColores[random.nextInt(0, arrayColores.length)];
		return colorAleatorio;
	}
}
