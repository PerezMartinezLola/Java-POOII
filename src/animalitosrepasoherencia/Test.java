package animalitosrepasoherencia;

public class Test {
	public static void main(String[] args) {
		//Animal a  = new Animal();
		Perro p = new Perro (3.5f, "Mastín");
		Gato g = new Gato(2.5f, true);
		System.out.println(p);
		Animal.show(g);
		Animal.show(p);
	}
}
