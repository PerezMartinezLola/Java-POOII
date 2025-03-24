package interfaces;

public abstract class Animal extends Object implements Desplazable{
	
	public void respirar() {
		System.out.println(this.getClass().getSimpleName() + " respirando");
	}

}
