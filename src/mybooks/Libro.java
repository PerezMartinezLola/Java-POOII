package mybooks;

public class Libro extends Publicacion {
	private String autor;
	private static String mensajeCabecera = "\nDATOS LIBRO\n===========\n";
	
	
	
	
	public Libro(String titulo, String autor, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		super(titulo, numPags, formatoDigital, precio, pagInicial);
		this.autor = autor;
		
	}


	@Override
	public String showPaginaLeida() {
		return String.format("del libro titulado %s del autor %s%n", getTitulo(), autor);
	}

	

	@Override
	public String showFinal() {
		return String.format("%nLibro titulado %s del autor %s ya ha sido leído", getTitulo(), autor);
	}


	@Override
	public String getMesajeCabecera() {
		return mensajeCabecera;
	}



	



	



	




	
	
	
	
	

	
}
