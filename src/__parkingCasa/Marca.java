package __parkingCasa;

import java.util.Random;

public enum Marca {
	TO("Toyota"), DA("Dacia"), SE("Seat"), ME("Mercedes"), RE("Renault");
	
	private String marca;
	private static Random random = new Random();

	private Marca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public static Marca marcaRandom() {
		Marca [] arrayMarcas = Marca.values();
		Marca marcaAleatoria = arrayMarcas[random.nextInt(0,arrayMarcas.length)];
		return marcaAleatoria;
		
	}
	//return Color.values() [random.nextInt(0, Color.values().length)];
	

	public static void main(String[] args) {
		Marca m1 = Marca.RE;
		System.out.println(m1.getMarca());
		System.out.println(Marca.ME.getMarca());
	}
}
