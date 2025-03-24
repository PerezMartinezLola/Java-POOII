package __collections;

import java.util.Objects;
import java.util.Random;

public class Coche {
	
	private Marca marca;
	private Color color;
	
	
	
	public Coche(Marca marca, Color color) {
		this.marca = marca;
		this.color = color;
	}
	
	public Coche () {
		marca = Marca.marcaAleatoria();
		color = Color.colorAleatorio();
	}
	
	public Marca getMarca() {
		return marca;
	}

	public Color getColor() {
		return color;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(color, marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		//compara el mismo color y marca en memoria porque son Enum
		return color == other.color && marca == other.marca;
	}

	@Override
	public String toString() {
		return "Coche: " + marca + " " + color;
	}
	
	/*public static void main(String[] args) {
		Coche c1 = new Coche(Marca.DA, Color.IN);
		System.out.println(c1);
		
		Coche c2 = new Coche();
		System.out.println(c2);
	}*/
	
}
