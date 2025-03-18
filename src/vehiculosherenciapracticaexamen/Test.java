package vehiculosherenciapracticaexamen;

public class Test {
	public static void main(String[] args) {
		
		//instancias
		Coche c1 = new Coche(120, 80, 4, 1_500, "ABCD1234");
		Moto m1 = new Moto(100, 60, 2, 130, "ABCD1234");
		Bicicleta b1 = new Bicicleta(80, 40, 2, 10);
		
		//pruebas
		System.out.println(c1);
		System.out.println(m1);
		System.out.println(b1);
		
	}	
	
}
