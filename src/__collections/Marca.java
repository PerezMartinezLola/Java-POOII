package __collections;

import java.util.Random;

public enum Marca {
	//Dacia, toyota, Renault, BMW, Mercedes
	DA("Dacia"), TO("Toyota"), RE("Renault"), BM("BMW"), ME("Mercedes");
	
	private String marca;
	private static Random random = new Random();

	private Marca(String nombre) {
		this.marca = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public String show() {
		return String.format("Marca: %s" , marca);
	}
	
	public static Marca marcaAleatoria () {
		Marca [] marcasArray = Marca.values();
		//int indiceMarcaAleatoria = random.nextInt(0, marcasArray.length);
		Marca marcaAleatoria = marcasArray [random.nextInt(0, marcasArray.length)];
		
		return marcaAleatoria;
		
	}
	
	
	/*public static void main(String[] args) {
		Marca m1 = Marca.BM;
		System.out.println(m1.show());
		
		System.out.println(Marca.BM.getNombre());
		
		
		System.out.printf("Coche aleatorio: %s", Marca.marcaAleatoria().getNombre());*/
	
	
	
}
