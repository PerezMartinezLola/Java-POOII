package animalitosrepasoherencia;

public class Perro extends Animal implements EmisorSonido{
	private String raza;
	private static Clasificacion clasificacion = Clasificacion.VE;
	
	//hay dos final una por varible de clase y tiene que asignarse al crear la clase
	// hay otro por 
	public Perro(float peso, String raza) {
		super(peso);
		this.raza = raza;
	}

	@Override
	public void show() {
		System.out.printf("Soy un perro de raza %s%n", raza);
	}

	@Override
	public void emitirSonido() {
		System.out.println("guau");
		
	}
	
	//los bloques estaticos se construyen con la clase
	//existen bloques no estaticos que afectan a la creacion de la instancia
	

	
}
