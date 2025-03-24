package __collections;

public class Test {
	
		public static void main(String[] args) {
			Parking p1 = new Parking(3, "Mi primer parking");
			
			Coche c1 = new Coche(Marca.RE, Color.RO);
			Coche c2 = new Coche(Marca.RE, Color.RO);
			Coche c3 = new Coche(Marca.RE, Color.RO);
			
			//metemos coches
			p1.entraCoche(c1);
			p1.entraCoche(c2);
			p1.entraCoche(c3);
			
			//report coches
			p1.reportParking();
			p1.reportColores();
			p1.reportMarcas();
			p1.reportCochesIguales();
			p1.reportSetCoches();
			
			//sacamos c2
			System.out.printf("%nSaco coche c2: %s%n", p1.saleCoche(c2));
			p1.reportParking();
			p1.reportColores();
			p1.reportMarcas();
			p1.reportCochesIguales();
			p1.reportSetCoches();
			
			
			//saco c2 de nuevo 
			System.out.printf("%nSaco coche c2 otra vez: %s%n", p1.saleCoche(c2));
			p1.reportParking();
			p1.reportColores();
			p1.reportMarcas();
			p1.reportCochesIguales();
			p1.reportSetCoches();
			
			//vaciar
			System.out.printf("%nVacio parking: %s%n", p1.vaciaParking());
			p1.reportParking();
			p1.reportColores();
			p1.reportMarcas();
			p1.reportCochesIguales();
			p1.reportSetCoches();
			
			
			
			System.out.printf("%n Parking p2%n");
			
			
			Parking p2 = new Parking(3, "Mi segundo Parking");
			Coche c4 = new Coche(Marca.DA, Color.AZ);
			Coche c5 = new Coche(Marca.DA, Color.AZ);
			Coche c6 = new Coche(Marca.DA, Color.AZ);
			
			System.out.printf("%nMeto 3 coches%n");
			p2.entraCoche(c4);
			p2.entraCoche(c5);
			p2.entraCoche(c6);
			//Report
			p2.reportParking();
			p2.reportColores();
			p2.reportMarcas();
			p2.reportCochesIguales();
			p2.reportSetCoches();
			
			System.out.printf("%nSaco coche aleatorio: %s%n", p2.saleCocheAleatorio());
			
			p2.reportParking();
			p2.reportColores();
			p2.reportMarcas();
			p2.reportCochesIguales();
			p2.reportSetCoches();
			
			
			System.out.printf("%nSaco coche aleatorio: %s%n", p2.saleCocheAleatorio());
			
			p2.reportParking();
			p2.reportColores();
			p2.reportMarcas();
			p2.reportCochesIguales();
			p2.reportSetCoches();
			
			System.out.printf("%nSaco coche aleatorio: %s%n", p2.saleCocheAleatorio());
			
			p2.reportParking();
			p2.reportColores();
			p2.reportMarcas();
			p2.reportCochesIguales();
			p2.reportSetCoches();
			
			
			System.out.printf("%nMi tercer Parking%n");
			Parking p3 = new Parking(3, "Mi tercer parking");
			
			Coche c7 = new Coche(Marca.TO, Color.NA);
			Coche c8 = new Coche(Marca.TO, Color.NA);
			Coche c9 = new Coche(Marca.TO, Color.NA);
			
			System.out.printf("%nMeto coche: %s%n", p3.entraCoche(c7));
			System.out.printf("%nMeto coche: %s%n", p3.entraCoche(c8));
			System.out.printf("%nMeto coche: %s%n", p3.entraCoche(c9));
			
			p3.reportParking();
			p3.reportColores();
			p3.reportMarcas();
			p3.reportCochesIguales();
			p3.reportSetCoches();
			
			System.out.printf("%nSaco coche aleatorio: %s%n", p3.saleCocheAleatorio());
			Coche c0 = p3.saleCocheAleatorio();
			p3.reportParking();
			p3.reportColores();
			p3.reportMarcas();
			p3.reportCochesIguales();
			p3.reportSetCoches();
			System.out.printf("%nCoche aleatorio: %s%n", c0);
			p3.reportParking();
			p3.reportColores();
			p3.reportMarcas();
			p3.reportCochesIguales();
			p3.reportSetCoches();
			
			System.out.printf("%nMi cuarto Parking%n");
			Parking p4 = new Parking(3, "Mi cuarto parking");
			
			System.out.printf("%nSaco coche aleatorio: %s%n", p4.saleCocheAleatorio());
			p4.reportParking();
			p4.reportColores();
			p4.reportMarcas();
			p4.reportCochesIguales();
			p4.reportSetCoches();
			
			System.out.printf("%nSaco coche aleatorio: %s%n", p4.saleCoche(c1));
			
			
			System.out.printf("%nMi quinto Parking%n");
			Parking p5 = new Parking(3, "Mi cuarto parking");
			
			for (int i = 0; i < 5; i++) {
				p5.entraCoche(new Coche(Marca.ME, Color.IN));
			}
			
			p5.reportParking();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*Coche c0 = new Coche(Marca.DA, Color.AM);
			Coche c1 = new Coche(Marca.RE, Color.IN);
			Coche c3 = new Coche(Marca.DA, Color.AZ);
			Coche c4 = new Coche(Marca.ME, Color.NA);
			Coche c5 = new Coche(Marca.TO, Color.RO);
			Coche c6 = new Coche(Marca.TO, Color.RO);
			
			
			
			System.out.printf("%n--PRUEBA CON SET COCHES--%n");
			System.out.printf("%n--Metodo entraCoche--%n");
			p1.reportSetCoches();
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c3));
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c3));
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c1));
			p1.reportSetCoches();
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c5));
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c6));
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c4));
			p1.reportCochesIguales();
			p1.reportSetCoches();
			
			System.out.printf("%nMetodo sale coche%n");
			p1.reportCochesIguales();
			p1.reportSetCoches();
			
			/*System.out.printf("%nSacar coche aleatorio: %s%n", p1.saleCocheAleatorio());
			p1.reportCochesIguales();
			p1.reportSetCoches();
			System.out.printf("%nSacar coche: %s%n", p1.saleCoche(c6));
			p1.reportCochesIguales();
			p1.reportSetCoches();
			
			System.out.printf("%nSacar coche: %s%n", p1.saleCoche(c5));
			p1.reportCochesIguales();
			p1.reportSetCoches();*/
			
			
			
			/*System.out.printf("1. Entra un coche: %s%n", p1.entraCoche(c1));
			p1.entraCoche(c1);
			p1.reportParking();

			System.out.println();
			System.out.printf("%n2. Sale un coche: %s%n", p1.saleCoche(c1));
			p1.reportParking();
			
			System.out.println();
			System.out.printf("%nNo hay coche pero ¿sale coche? : %s%n", p1.saleCoche(c0));
			
			p1.reportParking();
			
			System.out.printf("%nEntran 2 coches para llenarlo%n");
			p1.entraCoche(c0);
			p1.entraCoche(c1);
			p1.reportParking();
			
			System.out.printf("%n¿Meto un coche si esta lleno?: %s%n", p1.entraCoche(c3));
			p1.entraCoche(c3);
			p1.reportParking();
			
			System.out.printf("%nVacio el parking%n");
			p1.vaciaParking();
			p1.reportParking();
			
			System.out.printf("%nSaco Coche aleatorio de parking vacio: %s%n", p1.saleCocheAleatorio());
			p1.saleCocheAleatorio();
			System.out.printf("%nSaco Coche de parking vacio: %s%n", p1.saleCoche(c5));
			p1.reportParking();
			
			
			
			System.out.printf("%n--PRUEBA CON REPORT COLORES--%n");
			System.out.printf("%nEl parking ahora está vacio%n");
			System.out.printf("%n--Meto coches--%n");
			System.out.printf("%nmeto coche: %s%n", p1.entraCoche(c5));
			System.out.printf("%nmeto coche: %s%n", p1.entraCoche(c6));
			p1.reportParking();
			p1.reportColores();
			System.out.printf("%nmeto coche: %s%n", p1.entraCoche(c4));
			System.out.printf("%nmeto coche: %s%n", p1.entraCoche(c0));
			p1.reportParking();
			System.out.printf("%n--Saco coches--");
			System.out.printf("%nSaca coche aleatorio: %s%n", p1.saleCocheAleatorio());
			p1.reportParking();
			p1.reportColores();
			
			System.out.printf("%nSaco coche%n");
			System.out.printf("%nSaco coche: %s%n", p1.saleCoche(c4));
			System.out.printf("%nSaco coche: %s%n", p1.saleCoche(c5));
			System.out.printf("%nVacio parking: %s%n", p1.vaciaParking());
			System.out.printf("%nSaco coche: %s%n", p1.saleCoche(c1));
			System.out.printf("%nSaco coche aleatorio: %s%n", p1.saleCocheAleatorio());
	
			p1.reportColores();
			
			System.out.printf("%nParking vacio de nuevo%n");
			System.out.printf("%n--PRUEBA CON REPORT MARCAS--%n");
			System.out.printf("%n--Metodo entracoche--%n");
			p1.reportParking();
			System.out.printf("%nEntra coche: %s%n",p1.entraCoche(c3));
			System.out.printf("%nEntra coche: %s%n",p1.entraCoche(c3));
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c5));
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c6));
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c6));
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c4));
			p1.reportParking();
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c1));
			p1.reportParking();
			p1.reportMarcas();
			
			
			
			System.out.printf("%n--Metodo saleCoche--%n");
			p1.reportParking();
			System.out.printf("%nSacar coche aleatorio: %s%n", p1.saleCocheAleatorio());;
			p1.reportParking();
			
			System.out.printf("%nVacio parking%n");
			p1.vaciaParking();
			p1.reportColores();
			p1.reportMarcas();
			System.out.printf("%nSacar coche con parking vacio con coche especifico: %s%n", p1.saleCoche(c6));
			System.out.printf("%nSacar coche con parking vacio con coche aleatorio: %s%n", p1.saleCocheAleatorio());
			
			System.out.printf("%nParking vacio de nuevo%n");
			System.out.printf("%n--PRUEBA CON COCHES IGUALES--%n");
			System.out.printf("%n--Metodo entraCoche--%n");

			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c1));
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c3));
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c5));
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c6));
			p1.reportCochesIguales();
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c5));//no esta dentro
			
			System.out.printf("%n--Metodo saleCoche--%n");
			System.out.printf("%nSale coche: %s%n", p1.saleCoche(c4));
			p1.reportCochesIguales();
			System.out.printf("%nSaco coche repetido%n", p1.saleCoche(c6));
			p1.reportCochesIguales();
			
			p1.vaciaParking();
			p1.reportCochesIguales();
			System.out.printf("%nSale coche: %s%n", p1.saleCoche(c4));
			System.out.printf("%nSale coche aleatorio: %s%n", p1.saleCocheAleatorio());
			
			
			System.out.printf("%nParking vacio de nuevo%n");
			System.out.printf("%n--PRUEBA CON SET COCHES--%n");
			System.out.printf("%n--Metodo entraCoche--%n");
			p1.reportSetCoches();
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c3));
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c3));
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c1));
			p1.reportSetCoches();
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c5));
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c6));
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c4));
			p1.reportCochesIguales();
			p1.reportSetCoches();
			System.out.printf("%nEntra coche: %s%n", p1.entraCoche(c0));
			p1.reportSetCoches();
			
			System.out.printf("%nMetodo sale coche%n");
			p1.reportCochesIguales();
			p1.reportSetCoches();
			System.out.printf("%nVaciar: %s%n", p1.vaciaParking());
			p1.reportCochesIguales();
			p1.reportSetCoches();
			System.out.printf("%nSacar coche con parking vacio: %s%n", p1.saleCoche(c6));
			p1.reportSetCoches();*/
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			// Ahora el parking esta vacío, vuelvo a llenarlo
			
			
			/*Coche c2 = new Coche(Marcas.RE, Color.IN);
			Coche c3 = new Coche(Marcas.ME, Color.RO);
			Coche c4 = new Coche(Marcas.TO, Color.AZ);
			Coche[] coches = { c1, c2, c3, c4 };

			for (Coche coche : coches) {
				p1.entraCoche(coche);
			}
			System.out.println();
			System.out.printf("%nLleno el parking mediante for%n");
			p1.mostrarListaCoches();

			System.out.println();
			System.out.printf("%n3.Sale coche aleatorio%n");
			p1.saleCocheAleatorio();
			p1.mostrarListaCoches();

			System.out.println();
			System.out.printf("%n4.Vacía el parking%n");
			p1.vaciaParking();
			p1.mostrarListaCoches();

			// void reportParking()
			System.out.println();
			Coche c5 = new Coche(Marcas.BM, Color.AM);
			Coche c6 = new Coche(Marcas.DA, Color.AZ);
			Coche c7 = new Coche(Marcas.ME, Color.IN);
			Coche c8 = new Coche(Marcas.RE, Color.NA);
			Coche c9 = new Coche(Marcas.TO, Color.RO);
			Coche c10 = new Coche(Marcas.DA, Color.NA);
			Coche c11 = new Coche(Marcas.TO, Color.AM);
			Coche c12 = new Coche(Marcas.ME, Color.VE);

			Coche[] coches2 = { c5, c6, c7, c8, c9, c10, c11, c12 };
			for (Coche coche : coches2) {
				p1.entraCoche(coche);
			}
			System.out.printf("%n-PRUEBAS REPORT COLORES-%n");
			p1.reportParking();
			p1.reportColores();
			
			
			System.out.printf("%nSale el coche: %s", c6);
			p1.saleCoche(c6);
			p1.mostrarListaCoches();
			
			Coche c13 = new Coche(Marcas.TO, Color.IN);
			System.out.printf("%nEntra el coche: %s", c13);
			p1.entraCoche(c13);
			p1.mostrarListaCoches();
			
			
			System.out.printf("%nSale un coche aleatorio %n");
			p1.saleCocheAleatorio();
			
			p1.reportParking();
			p1.reportColores();
			
			
			System.out.printf("%n-PRUEBAS REPORT MARCAS-%n");
			p1.mostrarListaCoches();
			Coche c14 = new Coche(Marcas.ME, Color.RO);
			System.out.printf("%nEntra un coche: %s%n", c14);
			p1.entraCoche(c14);
			p1.mostrarListaCoches();
			p1.reportColores();
			p1.reportMarcas();
			
			
			System.out.printf("%nSale un coche: %s%n", c8);
			p1.saleCoche(c8);
			p1.mostrarListaCoches();
			p1.reportColores();
			p1.reportMarcas();
			
			System.out.printf("%nSale un coche aleatorio%n");
			p1.saleCocheAleatorio();
			p1.mostrarListaCoches();
			p1.reportColores();
			p1.reportMarcas();
			
			System.out.printf("%nPRUEBAS MAPCOCHE%n");
			p1.reportCochesIguales();
			System.out.printf("%nEntra coche%n");
			Coche c15 = new Coche(Marcas.DA, Color.NA);
			p1.entraCoche(c15);
			p1.reportCochesIguales();
			
			System.out.printf("%nEntra coche%n");
			Coche c16 = new Coche(Marcas.TO, Color.IN);
			p1.entraCoche(c16);
			p1.reportCochesIguales();
			
			System.out.printf("%nSale coche%n");
			p1.saleCoche(c15);
			p1.reportCochesIguales();
			
			System.out.printf("%nSale coche%n");
			p1.saleCocheAleatorio();
			p1.reportCochesIguales();*/
			
			
		}
	
	
}
