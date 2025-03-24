package enumerados;

public enum Mes {
	E("enero", "january", 1), F("febrero", "february", 2), MR("marzo", "march", 3), AB ("april", "abril", 4),
	MY ("mayo", "may", 5), JN ("junio", "june", 6), JL("julio", "july", 7), AG("agosto", "august", 8), 
	S("septiembre", "september", 9), O("octubre", "october", 10), N("noviembre", "november", 11),
	D ("diciembre", "december", 12);
	
	
	private String mesEspañol;
	private String mesIngles;
	private int numeroMes;
	
	private Mes(String mesEspañol, String mesIngles, int numeroMes) {
		this.mesEspañol = mesEspañol;
		this.mesIngles = mesIngles;
		this.numeroMes = numeroMes;
	}

	public String getMesEspañol() {
		return mesEspañol;
	}

	public String getMesIngles() {
		return mesIngles;
	}

	public int getNumeroMes() {
		return numeroMes;
	}
	
	public String show () {
		return String.format("El mes %d del año es %s (%s)", numeroMes, mesEspañol, mesIngles);
	}
	
	
}
