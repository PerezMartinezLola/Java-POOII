package genericsCasita;

public class Caja <T> {
	private T contenido;

	public Caja(T contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Caja [contenido=" + contenido + "]";
	}
	
	
	
	
}
