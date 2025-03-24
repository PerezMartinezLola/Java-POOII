package enumerados;

public enum FinDe {
	//estos son los literales, van en mayusculas todos
	// si solo pones los literales no necesita ; al final si quieres constructores, etc. si los necesitas
	//son los nombres que utilizo para apuntar a los objetos que he creado
	VI(5, "viernes", "friday"), SA(6, "sabado", "saturday"), DO(7, "domingo", "sunday");
	
	private int numeroDia;
	private String nombreEspañol;
	private String nombreIngles;
	
	private FinDe(int numeroDia, String nombreEspañol, String nombreIngles) {
		this.numeroDia = numeroDia;
		this.nombreEspañol = nombreEspañol;
		this.nombreIngles = nombreIngles;
	}

	public int getNumeroDia() {
		return numeroDia;
	}

	public String getNombreEspañol() {
		return nombreEspañol;
	}

	public String getNombreIngles() {
		return nombreIngles;
	}
	
	//voy a hacer un toString  pero toString no me lo permite
	public String presentacion () {
		return String.format("El dia %d de la semana es el %s (%s)", numeroDia, nombreEspañol, nombreIngles);
	}
	
	//los contructores son privados porque java es quien lo crea
	/*private FinDe(int numeroDia) {
		this.numeroDia = numeroDia;
	}

	public int getNumeroDia() {
		return numeroDia;
	}*/
	
	
}

