package genericsCasita;



public class Test {
	public static void main(String[] args) {
		Caja <Ratones> c1 = new Caja<>(new Ratones(2));
		Caja<Colores> c2 = new Caja<>(new Colores("blanco"));
		System.out.println(c1);
		System.out.println(c2);
		System.out.println();
		
		//Parejas
		Pareja<Ratones, Colores> caja1 = new Pareja<>(new Ratones(3), new Colores("negro"));
		System.out.println(caja1);
		System.out.println();
		
		//Pareja String
		ParejaString<String, String> cajaString1 = new ParejaString<>("hola", "pesicola");
		System.out.println(cajaString1);
		System.out.println();
		
		//Trio number
		TrioNumber<Integer, Integer, String> cajaNumeros1 = new TrioNumber<>(4, 6, "dubidu");
		System.out.println(cajaNumeros1);
		
		
	}
}
