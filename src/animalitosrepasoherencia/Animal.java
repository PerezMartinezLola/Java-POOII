package animalitosrepasoherencia;

public abstract class Animal implements EmisorSonido{
	private float peso;
	//con estatico te tienes que olvidar de la herencia
	//si pongo final tengo que darle el valor en el momento
	
	
	//protected es que se pueden heredar los campos por parte de los hijos sin necesidad de un getters
	//pero protected no respeta las resticciones del padre
	//public lo puede utilizar cualquiera aunque no herede
	//private, public, default, protected
	//solo puede haber una clase publica en una misma clase
	
	//si lo pongo privado los hijos no lo pueden utilizar
	//sin nada sería default
	//ponemos protected pero no puede cambiarse porque es enum
	//default solo permite acceder en el mismo paquete
	//protected es por extends, herencia
	//default es por el mismo paquete
	
	protected enum Clasificacion{
		VE, IN
	}
	
	public Animal(float peso) {
		this.peso = peso;
	}

	//lo hereda perro
	//%f sirve para float y para double
	//float tiene menos rando de numeros
	//double tiene mas rango de numeros
	
	
	public String toString() {
		return String.format("Soy un animal de %f gramos", peso);
	}
	public static void show(Animal animal) {
		//cuando ponemos animal.show el show esta mostrando el show de cada clase
		animal.show();
	}
	//lo pongo abstracto porque no quiero que nunca se implemente aqui porque nunca voy a poder imprimir un animal
	public abstract void show();
	
}
