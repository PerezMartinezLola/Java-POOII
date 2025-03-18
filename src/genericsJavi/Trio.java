package genericsJavi;

public class Trio <T, S, X>{
	private T elemento1;
	private S elemento2;
	private X elemento3;
	
	
	
	public Trio(T elemento1, S elemento2, X elemento3) {
		this.elemento1 = elemento1;
		this.elemento2 = elemento2;
		this.elemento3 = elemento3;
	}



	@Override
	public String toString() {
		return "Trio [" + elemento1 + ", " + elemento2 + ", " + elemento3 + "]";
	}
	
	
	
	
	
}
