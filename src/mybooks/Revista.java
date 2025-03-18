package mybooks;

public class Revista extends Publicacion {
	private static String mensajeCabecera = "\nDATOS REVISTA\n=============\n";
	

	

	public Revista(String titulo, int numPags, boolean formatoDigital, double precio) {
		super(titulo, numPags, formatoDigital, precio, 1);
		
	}


	@Override
	public String showPaginaLeida() {
		return String.format("de la revista titulada %s%n", getTitulo());
	}



	@Override
	public String showFinal() {
		return String.format("%nRevista titulada %s ya ha sido leída", getTitulo());
	}



	@Override
	public String getMesajeCabecera() {
		return mensajeCabecera;
	}
	
	



	
	
	//los metodos estaticos no se heredan y no se pueden sobreescribir
	// los constructores no se heredan
	//
	
}
