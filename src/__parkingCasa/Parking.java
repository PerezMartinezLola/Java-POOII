package __parkingCasa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;



public class Parking {

	private String nombre;
	private int totalPlazas;
	private List <Coche> listaDeCoches;
	private Map <Color, Integer> mapColorParking;
	private Map <Marca, Integer> mapMarcaParking;
	private Map <Coche, Integer> mapCochesIguales;
	private Set <Coche> setcoches;
	private static Random random = new Random();
	
	
	
	public Parking(String nombre, int totalPlazas) {
		this.nombre = nombre;
		this.totalPlazas = totalPlazas;
		listaDeCoches = new ArrayList<Coche>();
		mapColorParking = new HashMap <>();
		mapMarcaParking = new HashMap<>();
		mapCochesIguales = new HashMap<>();
		setcoches = new HashSet<>();
	}
	
	private boolean parkingVacio() {
		return listaDeCoches.isEmpty();
	}
	
	private boolean parkingLleno() {
		return listaDeCoches.size() >= totalPlazas;
	}
	
	private boolean colorEntraCoche (Coche coche) {
		Color colorCoche = coche.getColor();
		
		if(mapColorParking.get(colorCoche) == null) {
			mapColorParking.put(colorCoche, 1);
		}else {
			mapColorParking.put(colorCoche, mapColorParking.get(colorCoche) + 1);
		}
		return true;
	}
	
	private boolean colorSaleCoche (Coche coche) {
		Color colorCoche = coche.getColor();
		
		if(mapColorParking.get(colorCoche) <= 1) {
			mapColorParking.remove(colorCoche);
		}else {
			mapColorParking.put(colorCoche, mapColorParking.get(colorCoche) - 1);
		}
		return true;
	}
	
	private boolean marcaEntracoche(Coche coche) {
		Marca marcaCoche = coche.getMarca();
		
		if(mapMarcaParking.get(marcaCoche) == null) {
			mapMarcaParking.put(marcaCoche, 1);
		}else {
			mapMarcaParking.put(marcaCoche, mapMarcaParking.get(marcaCoche) + 1);
		}
		return true;
	}
	
	private boolean marcaSaleCoche(Coche coche) {
		Marca marcaCoche = coche.getMarca();
		
		if(mapMarcaParking.get(marcaCoche) <= 1) {
			mapMarcaParking.remove(marcaCoche);
		}else {
			mapMarcaParking.put(marcaCoche, mapMarcaParking.get(marcaCoche) -1);
		}
		return true;
	}
	
	private boolean cochesIgualesEntraCoche(Coche coche) {
		
		if(mapCochesIguales.get(coche) == null) {
			mapCochesIguales.put(coche, 1);
		}else {
			mapCochesIguales.put(coche, mapCochesIguales.get(coche) + 1);
		}
		return true;
	}
	
	private boolean cochesIgualesSalecoche(Coche coche) {
		if(mapCochesIguales.get(coche) <= 1) {
			mapCochesIguales.remove(coche);
		}else {
			mapCochesIguales.put(coche, mapCochesIguales.get(coche) - 1);
		}
		return true;
	}
	
	public boolean entraCoche(Coche coche) {
		boolean cocheDentro = false;
		for (Coche c : listaDeCoches) {
			if(c == coche) {
				cocheDentro = true;
				break;
			}
		}
		
		
		if(parkingLleno()) {
			return false;
		}
		if(cocheDentro) {
			return false;
		}
		listaDeCoches.add(coche);
		colorEntraCoche(coche);
		marcaEntracoche(coche);
		cochesIgualesEntraCoche(coche);
		setcoches.add(coche);
		return true;
	}
	
	public boolean saleCoche(Coche coche) {
		if(parkingVacio()) {
			return false;
		}
		
		boolean cocheDentro = false;
		for (int i = 0; i < listaDeCoches.size(); i++) {
			if(listaDeCoches.get(i) == coche) {
				listaDeCoches.remove(i);
				cocheDentro = true;
				break;
			}
		}
		
		
		if(!cocheDentro) {
			return false;
		}
		
		colorSaleCoche(coche);
		marcaSaleCoche(coche);
		if(mapCochesIguales.get(coche) <= 1) {
			setcoches.remove(coche);
		}
		cochesIgualesSalecoche(coche);
		
		return true;
	}
	
	public boolean saleCocheAleatorio () {
		if(parkingVacio()) {
			return false;
		}
		int indiceAleatorio = random.nextInt(0, listaDeCoches.size());
		Coche cocheAleatorio = listaDeCoches.get(indiceAleatorio);
		return saleCoche(cocheAleatorio);
	}
	
	public boolean vaciaParking() {
		if(parkingVacio()) {
			return false;
			}
		while (!parkingVacio()) {
			saleCocheAleatorio();
			}
		return true;
		}
	
	private void encabezadoReport(String tipoReport) {
		System.out.printf("%n%s%n", tipoReport);
		String [] letrasReport = tipoReport.split("");
		for (String letras : letrasReport) {
			System.out.print("-");
		}
		System.out.printf("%nParking: %s%n", nombre);
	}
	
	public void reportParking() {
		encabezadoReport("LISTADO DE COCHES");
		for (Coche coche : listaDeCoches) {
			System.out.printf("Coche: %s %s%n", coche.getMarca(), coche.getColor());
		}
		System.out.printf("Total de coches: %d, plazas libres: %d%n", listaDeCoches.size(), totalPlazas - listaDeCoches.size());
	}
	
	public void reportColores() {
		encabezadoReport("REPORT COLORES");
		for (Color color : mapColorParking.keySet()) {
			System.out.printf("El coche de color %s se repite %d %s.%n", color.getColor(), mapColorParking.get(color), 
							  mapColorParking.get(color) == 1 ? "vez" : "veces");
		}
		System.out.printf("Total de coches: %d%n", listaDeCoches.size());
	}
	
	
	public void reportMarcas() {
		encabezadoReport("REPORT DE MARCAS");
		for (Marca marca : mapMarcaParking.keySet()) {
			System.out.printf("El coche de marca %s se repite %d %s.%n", marca.getMarca(), mapMarcaParking.get(marca), 
								mapMarcaParking.get(marca) == 1 ? "vez" : "veces");
		}
		System.out.printf("Total coches : %d%n", listaDeCoches.size());
	}
	
	public void reportCochesIguales() {
		encabezadoReport("REPORT DE COCHES IGUALES");
		for (Coche coche : mapCochesIguales.keySet()) {
			System.out.printf("Coche: %s %s se repite %d %s.%n", coche.getMarca(), coche.getColor(),
							  mapCochesIguales.get(coche), mapCochesIguales.get(coche) == 1 ? "vez": "veces");
		}
		System.out.printf("Total coches: %d%n", listaDeCoches.size());
	}
	
	public void reportSetCoches () {
		encabezadoReport("REPORT SET DE COCHES");
		for (Coche coche : setcoches) {
			System.out.printf("Coche: %s %s%n", coche.getMarca(), coche.getColor());
		}
		System.out.printf("Total items:%d%n", setcoches.size());
	}
	
	public void reportTodo() {
		 reportParking();
		 reportColores(); 
		 reportMarcas();
		 reportCochesIguales();
		 reportSetCoches();
	}
}
