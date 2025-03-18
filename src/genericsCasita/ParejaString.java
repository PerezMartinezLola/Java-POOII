package genericsCasita;

public class ParejaString <T,S> {
	private T elemento1;
	private S elemento2;
	
	
	
	public ParejaString(T elemento1, S elemento2) {
	
		this.elemento1 = elemento1;
		this.elemento2 = elemento2;
	}



	@Override
	public String toString() {
		return "ParejaString [" + elemento1 + ", " + elemento2 + "]";
	}
	
	
	
	
}
