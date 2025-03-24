package animalitosrepasoherencia;

public class Gato extends Animal{
	private boolean cascabel;
	protected static Clasificacion clasificacion = Clasificacion.VE;
	
	//hay dos final una por varible de clase y tiene que asignarse al crear la clase
	// hay otro por 
	public Gato(float peso, boolean cascabel) {
		super(peso);
		this.cascabel = cascabel;
	}

	@Override
	public void show() {
		System.out.printf("Soy un gato cascabel %b%n", cascabel);
	}

	@Override
	public void emitirSonido() {
		System.out.println("miau");
		
	}
	
	//los bloques estaticos se construyen con la clase
	//existen bloques no estaticos que afectan a la creacion de la instancia
	
	
}
