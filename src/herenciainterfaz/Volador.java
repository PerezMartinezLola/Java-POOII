package herenciainterfaz;

public interface Volador {
	//una interfaz no es abstracta pero no se puede instanciar
	// puede no tener public abstract porque al estar en un interface no es necesario
	public abstract void despega ();
	public abstract void aterriza ();
	public abstract void planea ();
}
