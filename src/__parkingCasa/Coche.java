package __parkingCasa;

import java.util.Objects;

public class Coche {
	private Marca marca;
	private Color color;
	
	
	public Coche(Marca marca, Color color) {
		this.marca = marca;
		this.color = color;
	}
	
	public Coche() {
		marca = Marca.marcaRandom();
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
		return color == other.color && marca == other.marca;
	}

	

	public static void main(String[] args) {
		Coche c1 = new Coche();
		System.out.println(c1);
	}

}
