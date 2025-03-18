package genericsJavi;

public class Test {
	 public static void main(String[] args) {
	
		Articulo a1 = new Articulo("Articulo 1");
		CajaArticulo ca1 = new CajaArticulo(a1);
		CajaArticulo ca2 = new CajaArticulo(new Articulo("Articulo 2"));
		CajaString cs1 = new CajaString ("String 1");
		
		
		System.out.println(ca1);
		System.out.println(ca2);
		System.out.println(cs1);
		
		CajaParaTodo c1 = new CajaParaTodo(new Articulo("Otro articulo"));
		CajaParaTodo c2 = new CajaParaTodo("Otro String");
		System.out.println(c1);
		System.out.println(c2);
	
		String s = ((String) c2.getContenido()).toLowerCase();
		
		Caja<String> c10 = new Caja<String>("Caja generica 10");
		System.out.println(c10.getContenido().toUpperCase());
		
		//Caja<Articulo> c11= new Caja<Articulo>(new Articulo("articulo maravilloso"));
		//esto es lo mismo que lo de abajo
		Caja<Articulo> c11= new Caja<>(new Articulo("articulo maravilloso"));
		System.out.println(c11.getContenido());
		
		//Pareja
		Pareja<String, String> p1 = new Pareja<>("hola", "adios");
		System.out.println(p1);
		
		//Estantes
		Estanteria <String> e1 = new Estanteria<>(new String [] {"1", "22", "33", "44"});
		System.out.println(e1);
		
		//trio
		Trio<String, String, String> t1 = new Trio<>("hola", "pajarito", "sin cola");
		System.out.println(t1);
		
		
		
	}
}
