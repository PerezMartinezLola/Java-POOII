package __collectionsParkingCasa;


public class Test {
	public static void main(String[] args) {
		Parking p1 = new Parking("Mi primer parking", 2);
		Coche c1 = new Coche(Color.AM, Marca.DA);
		Coche c2 = new Coche(Color.NA, Marca.TO);
		Coche c3 = new Coche(Color.AM, Marca.DA);
		
		System.out.printf("Entra coche: %s%n", p1.entraCoche(c1));
		System.out.printf("Entra coche: %s%n", p1.entraCoche(c2));
		System.out.printf("Entra coche: %s%n", p1.entraCoche(c3));
		p1.reportListaCoches();
		
		System.out.println();
		System.out.printf("Sale coche: %s%n", p1.saleCoche(c1));
		System.out.printf("Sale coche: %s%n", p1.saleCoche(c1));
		System.out.printf("Sale coche: %s%n", p1.saleCoche(c3));
		System.out.printf("Sale coche: %s%n", p1.saleCoche(c2));
		p1.reportListaCoches();
		
	}
}
