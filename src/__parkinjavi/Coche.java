package __parkinjavi;

import java.util.Objects;

public class Coche {
	private Color color;
	private Marca marca;
	
	
	
	public Coche(Color color, Marca marca) {
		this.color = color;
		this.marca = marca;
	}
	
	public Coche() {
		color = Color.aleatorio();
		marca = Marca.aleatorio();
	}
	
	
	
	
	public Color getColor() {
		return color;
	}

	public Marca getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "Coche [color=" + color + ", marca=" + marca + "]";
	}
	
	@Override
	//esto es una sobreescritura
	public boolean equals(Object obj) {
		//si es el mismo objeto return true
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		//this.getClass () != obj.getClass() si son instancias de la misma clase
		if (getClass() != obj.getClass())
			return false;
		//casteo a coche despues de todas las comprobaciones
		Coche other = (Coche) obj;
		return color == other.color && marca == other.marca;
	}

	@Override
	public int hashCode() {
		//Objects es la clase en la que le creo un hash teniendo en cuenta el color y marca
		return Objects.hash(color, marca);
	}

	
	
	
}
