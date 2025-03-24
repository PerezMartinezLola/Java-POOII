package __collectionsParkingCasa;

import java.util.Random;

public enum Marca {
	TO("Toyota"), DA("Dacia"), SE("Seat"), RE("Renault");
	private String marca;
	private static Random random = new Random();

	private Marca(String nombre) {
		this.marca = nombre;
	}

	public String getMarca() {
		return marca;
	}
	
	public Marca marcaAleatoria() {
		Marca [] arrayMarca = Marca.values();
		Marca marcaAleatoria = arrayMarca[random.nextInt(arrayMarca.length)];
		return marcaAleatoria;
	}
	
	public static void main(String[] args) {
		System.out.println(Marca.RE);
		System.out.println(Marca.RE.getMarca());
	}
	
	
}
