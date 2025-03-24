package __parkingCasa;

public class Test {
	
	
	public static void main(String[] args) {
		
		Parking p1 = new Parking("Mi primer parking", 2);
		Coche c1 = new Coche(Marca.DA, Color.AM);
		Coche c2 = new Coche(Marca.ME, Color.AZ);
		Coche c3 = new Coche(Marca.SE, Color.RO);
		Coche c4 = new Coche(Marca.DA, Color.AM);
		Coche c5 = new Coche(Marca.DA, Color.NA);
		
		
		
		
		System.err.printf("%n-METODO ENTRA COCHE-%n");
		System.out.printf("Entra coche: %s%n", p1.entraCoche(c1));
		System.out.printf("Entra coche: %s%n", p1.entraCoche(c2));
		System.out.printf("Entra coche: %s%n", p1.entraCoche(c3));
		System.out.println();
		p1.reportParking();
		

		System.err.printf("%n-METODO SALE COCHE-%n");
		System.out.printf("Sale coche: %s%n", p1.saleCoche(c1));
		System.out.printf("Sale coche: %s%n", p1.saleCoche(c2));
		System.out.printf("Sale coche: %s%n", p1.saleCoche(c3));
		System.out.println();
		p1.reportParking();
		
		
		System.err.printf("%nLleno el parking%n");
		System.out.printf("Entra coche: %s%n", p1.entraCoche(c1));
		System.out.printf("Entra coche: %s%n", p1.entraCoche(c2));
		System.out.printf("Entra coche: %s%n", p1.entraCoche(c3));
		System.out.println();
		p1.reportParking();
		
		System.err.printf("%n-METODO SALE COCHE ALEATORIO-%n");
		System.out.printf("%nSale coche aleatorio: %s%n", p1.saleCocheAleatorio());
		System.out.printf("%nSale coche aleatorio: %s%n", p1.saleCocheAleatorio());
		System.out.printf("%nSale coche aleatorio: %s%n", p1.saleCocheAleatorio());
		System.out.printf("%nSale coche aleatorio: %s%n", p1.saleCocheAleatorio());
		System.out.println();
		p1.reportParking();
		
		System.err.printf("%nLleno el parking%n");
		System.out.printf("Entra coche: %s%n", p1.entraCoche(c1));
		System.out.printf("Entra coche: %s%n", p1.entraCoche(c2));
		System.out.printf("Entra coche: %s%n", p1.entraCoche(c3));
		System.out.println();
		p1.reportParking();
		
		System.err.printf("%n-METODO VACIA PARKING-%n");
		System.out.printf("Vacia el parking: %s%n", p1.vaciaParking());
		System.out.println();
		p1.reportParking();
		
		System.err.printf("%n-MAP COLOR-%n");
		System.err.printf("%n-METODO ENTRA-%n");
		System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c1));
		p1.reportParking();
		p1.reportColores(); 
		System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c4));
		p1.reportParking();
		p1.reportColores(); 

		
		System.err.printf("%n-METODO SALE-%n");
		System.out.printf("%nSale coche: %s%n", p1.saleCoche(c1));
		p1.reportParking();
		p1.reportColores();
		System.out.printf("%nSale coche: %s%n", p1.saleCoche(c4));
		p1.reportParking();
		p1.reportColores();
		
		System.out.printf("%nSale coche: %s%n", p1.saleCoche(c2));
		p1.reportParking();
		p1.reportColores();
		
		System.err.printf("%n-METODO SALE COCHE ALEATORIO-%n");
		System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c1));
		System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c2));
		p1.reportParking();
		p1.reportColores();
		
		System.out.printf("%nSale coche aleatorio: %s%n", p1.saleCocheAleatorio());
		p1.reportParking();
		p1.reportColores();
		
		
		System.out.printf("%nVacia Parking: %s%n", p1.vaciaParking());
		p1.reportParking();
		p1.reportColores();
		
		System.out.printf("%nSale coche aleatorio: %s%n", p1.saleCocheAleatorio());
		p1.reportParking();
		p1.reportColores();
		
		System.err.printf("%n-MAP MARCA-%n");
		System.err.printf("%n-METODO ENTRA-%n");
		System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c4));
		p1.reportParking();
		p1.reportColores(); 
		p1.reportMarcas();

		
		System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c5));
		p1.reportParking();
		p1.reportColores(); 
		p1.reportMarcas();
		
		System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c2));
		p1.reportParking();
		p1.reportColores(); 
		p1.reportMarcas();
		
		System.err.printf("%n-METODO SALE-%n");
		System.out.printf("%nSale coche: %s%n", p1.saleCoche(c2));
		p1.reportParking();
		p1.reportColores(); 
		p1.reportMarcas();
		
		System.out.printf("%nVacia parking: %s%n", p1.vaciaParking());
		p1.reportParking();
		p1.reportColores(); 
		p1.reportMarcas();
		
		System.out.printf("%nSale coche: %s%n", p1.saleCoche(c4));
		p1.reportParking();
		p1.reportColores(); 
		p1.reportMarcas();

		
		System.out.printf("%nSale coche: %s%n", p1.saleCoche(c5));
		p1.reportParking();
		p1.reportColores(); 
		p1.reportMarcas();
		
		System.out.printf("%nSale coche aleatorio: %s%n", p1.saleCocheAleatorio());
		p1.reportParking();
		p1.reportColores(); 
		p1.reportMarcas();
		
		System.out.printf("%nVacia parking: %s%n", p1.vaciaParking());
		p1.reportParking();
		p1.reportColores(); 
		p1.reportMarcas();
		
		System.err.printf("%n-MAP COCHE-%n");
		System.err.printf("%n-METODO ENTRA-%n");
		System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c1));
		p1.reportParking();
		p1.reportColores(); 
		p1.reportMarcas();
		p1.reportCochesIguales();
		
		System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c4));
		System.out.printf("%nVacia parking: %s%n", p1.vaciaParking());
		p1.reportTodo();
		
		System.err.printf("%n-SET-%n");
		System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c1));
		p1.reportTodo();
		
		System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c4));
		p1.reportTodo();
		
		System.out.printf("%nSale coche aleatorio: %s%n", p1.saleCocheAleatorio());
		p1.reportTodo();
		
		System.out.printf("%nSale coche aleatorio: %s%n", p1.saleCocheAleatorio());
		p1.reportTodo();
		
		/*System.out.printf("%nSale coche: %s%n", p1.saleCoche(c4));
		p1.reportParking();
		p1.reportColores(); 
		p1.reportMarcas();
		p1.reportCochesIguales();
		
		System.out.printf("%nSale coche: %s%n", p1.saleCoche(c1));
		p1.reportParking();
		p1.reportColores(); 
		p1.reportMarcas();
		p1.reportCochesIguales();
		
		System.out.printf("%nSale coche cuando esta vacio: %s%n", p1.saleCoche(c1));
		p1.reportParking();
		p1.reportColores(); 
		p1.reportMarcas();
		p1.reportCochesIguales();
		
		System.out.printf("%nSale coche aleatorio cuando esta vacio: %s%n", p1.saleCocheAleatorio());
		p1.reportParking();
		p1.reportColores(); 
		p1.reportMarcas();
		p1.reportCochesIguales();*/
	}
	
	
	
	
}
