package __parkinjavi;

public class Test {
	public static void main(String[] args) {
		Parking p1 = new Parking("P-1", 10);
		
		for (int i = 0; i < 5; i++) {
			p1.entraCoche(new Coche());
		}
		System.out.printf("%nLista%n");
		for (Coche coche : p1.getListaCoches()) {
			System.out.println(coche);
			
		}
		System.out.println("Conjunto");
		for (Coche coche : p1.getConjunCoches()) {
			System.out.println(coche);
			
		}
	}
}
