package animalitosrepasoherencia;

public interface EmisorSonido {
	//las interfaces se utilizan cuando no todos los hijos necesitan implementarlo
	//en una interface public abstract se sobreentienden
	//en una interface puedes tener un default para tener un método común a todos los que implementen
	//la interface no tiene propiedades
	void emitirSonido();
	
	
}
