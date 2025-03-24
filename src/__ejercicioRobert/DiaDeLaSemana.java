package __ejercicioRobert;

public enum DiaDeLaSemana {
	LU("LUNES", 1), MA("MARTES", 2), MI("MIERCOLES", 3), JU("JUEVES", 4), VI("VIERNES", 5), SA("SABADO", 6),
	DO("DOMINGO", 7);

	private String nombreEnMayusculas;
	private int numeroSemana;

	private DiaDeLaSemana(String nombreEnMayusculas, int numeroSemana) {
		this.nombreEnMayusculas = nombreEnMayusculas;
		this.numeroSemana = numeroSemana;
	}

	public DiaDeLaSemana diaSiguiente() {

		switch (this) {
		case LU:
			return MA;
		case MA:
			return MI;
		case MI:
			return JU;
		case JU:
			return VI;
		case VI:
			return SA;
		case SA:
			return DO;
		case DO:
			return LU;
		default:
			return this;
		}
	}

	public DiaDeLaSemana diaAnterior() {
		switch (this) {
		case LU:
			return DO;
		case MA:
			return LU;
		case MI:
			return MA;
		case JU:
			return MI;
		case VI:
			return JU;
		case SA:
			return VI;
		case DO:
			return LU;
		default:
			return this;

		}
	}
	
	public String getNombreEnMayusculas() {
		return nombreEnMayusculas;
	}

	public int getNumeroSemana() {
		return numeroSemana;
	}

	@Override
	public String toString() {
		
		return String.format("Hoy es %s y me corresponde el día %s.%n", getNombreEnMayusculas(), getNumeroSemana());
	}
	
	public static void main(String[] args) {
		DiaDeLaSemana d1 = DiaDeLaSemana.MA;
		System.out.println(d1);
	}

}
