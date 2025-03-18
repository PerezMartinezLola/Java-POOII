package mybooks;

public abstract class Publicacion implements CanRead {
	private String titulo;
	private int numPags;
	private boolean formatoDigital;
	private double precio;
	private long id;
	private int pagActual;
	private boolean leido;
	private static long nextId = 0;
	private int pagInicial;

	public Publicacion(String titulo, int numPags, boolean formatoDigital, double precio, int pagInicial) {
		this.titulo = titulo;
		this.numPags = numPags < 1 ? 1 : numPags;
		this.formatoDigital = formatoDigital;
		this.precio = precio < 1 ? 1 : precio;
		pagActual = pagInicial;
		id = nextId++;
		this.pagInicial = pagInicial < 1 ? 1 : pagInicial;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public long getId() {
		return id;
	}
	
	public int getPagActual() {
		return pagActual;
	}


	public static void setNextId(long nextId) {
		Publicacion.nextId = nextId;
	}
	
	public abstract String getMesajeCabecera();
	
	public void show() {
		System.out.printf("%sTitulo: %s%nId: %d%nPáginas: %d%nPágina inicial:%d%nPagina Actual:%d%nPrecio: %.2f%nFormato digital: %s%nLeído: %s%n", getMesajeCabecera(), 
				titulo, id, numPags, pagInicial, pagActual, precio, formatoDigital ? "Si" : "No", leido ? "Si" : "No");
	}
	
	public static void showStatic(Publicacion publicacion) {
		publicacion.show();
	}

	public void leePagina(boolean silenciosamente) {
		if (silenciosamente) {
			if (pagActual == numPags) {
				System.out.println(showFinal());
				leido = true;

			} else if (pagActual == numPags - 1) {
				pagActual++;
				System.out.println("\nÚltima página (" + pagActual + ") leída " + showPaginaLeida());
				leido = true;

			} else {
				System.out.println("\nPágina " + pagActual + " leída " + showPaginaLeida());
				pagActual++;
				leido = false;
			}
		} else {
			System.out.printf("%nNo se lee silenciosamente%n");
		}
	}

	public abstract String showPaginaLeida();

	public abstract String showFinal();
	
	//METER PARAMETRO BOOLEAN SILENCIOSAMENTE
	public static void leePaginaStatic(Publicacion publicacion, boolean silenciosamente) {
		publicacion.leePagina(silenciosamente);
	}

	@Override
	public String toString() {
		return "Publicacion [titulo=" + titulo + ", numPags=" + numPags + ", formatoDigital=" + formatoDigital
				+ ", precio=" + precio + ", id=" + id + ", pagActual=" + pagActual + ", leido=" + leido
				+ ", pagInicial=" + pagInicial + "]";
	}

}
