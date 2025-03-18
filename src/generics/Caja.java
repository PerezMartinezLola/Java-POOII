package generics;

public class Caja <T>{
	//T es un object por eso si ponemos <Raton> nombras a una clase
	private T contenido;

	public Caja(T contenido) {
		super();
		this.contenido = contenido;
	}
	
	//Caja<Raton>;
	
	
	public T getContenido() {
		return contenido;
	}

	public void setContenido(T contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Caja [contenido=" + contenido + "]";
	}
	
	public static void main(String[] args) {
		Caja<Raton> r1 = new Caja<Raton>(null);
		Caja<String> s1 = new Caja<String>(null);
	}
}
