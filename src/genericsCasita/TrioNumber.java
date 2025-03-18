package genericsCasita;

public class TrioNumber <T, S, X> {
	private T elemento1;
	private S elemento2;
	private X elemento3;
	
	
	public TrioNumber(T elemento1, S elemento2, X elemento3) {
		this.elemento1 = elemento1;
		this.elemento2 = elemento2;
		this.elemento3 = elemento3;
	}


	@Override
	public String toString() {
		return "TrioNumber [" + elemento1 + ", " + elemento2 + ", " + elemento3 + "]";
	}
	
	
	
}
