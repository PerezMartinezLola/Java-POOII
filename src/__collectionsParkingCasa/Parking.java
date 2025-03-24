package __collectionsParkingCasa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Parking {
	
	private String nombre;
	private int totalPlazas;
	private List <Coche> listaDecoches;
	private Map <Color, Integer> mapColor;
	private Map <Marca, Integer> mapMarca;
	private Map<Coche, Integer> mapCochesIguales;
	private Set <Coche> setCoches;
	private static Random random = new Random();
	
	
	
	
	public Parking(String nombre, int totalPlazas) {
		this.nombre = nombre;
		this.totalPlazas = totalPlazas;
		listaDecoches = new ArrayList<>();
		mapColor = new HashMap <>();
		mapMarca = new HashMap <>();
		mapCochesIguales = new HashMap <>();
		setCoches = new HashSet<>();
	}
	
	private boolean parkingVacio() {
		return listaDecoches.isEmpty();
	}
	
	private boolean parkingLleno() {
		return listaDecoches.size() == totalPlazas;
	}
	
	private boolean mapColorEntraCoche(Coche coche) {
		Color colorCoche = coche.getColor();
		if(mapColor.get(colorCoche) == null) {
			mapColor.put(colorCoche, 1);
		}else {
			mapColor.put(colorCoche, mapColor.get(colorCoche) + 1);
		}
		return true;
	}
	
	private boolean mapColorSaleCoche(Coche coche) {
		Color colorCoche = coche.getColor();
		
		if(mapColor.get(colorCoche) <= 1) {
			mapColor.remove(colorCoche);
		}else {
			mapColor.put(colorCoche, mapColor.get(colorCoche) - 1);
		}
		return true;
	}
	
	private boolean mapMarcaEntraCoche(Coche coche) {
		Marca marcaCoche = coche.getMarca();
		
		if(mapMarca.get(marcaCoche) == null) {
			mapMarca.put(marcaCoche, 1);
		}else {
			mapMarca.put(marcaCoche, mapMarca.get(marcaCoche) + 1);
		}
		return true;
	}
	
	
	public boolean mapMarcaSaleCoche (Coche coche) {
		Marca marcaCoche = coche.getMarca();
		
		if(mapMarca.get(marcaCoche) <= 1) {
			mapMarca.remove(marcaCoche);
		}else {
			mapMarca.put(marcaCoche, mapMarca.get(marcaCoche) - 1);
		}
		return true;
	}
	private boolean mapCocheEntraCoche(Coche coche) {
		
		if(mapCochesIguales.get(coche) == null) {
			mapCochesIguales.put(coche, 1);
		}else {
			mapCochesIguales.put(coche, mapCochesIguales.get(coche) + 1);
		}
		return true;
	}
	
	
	public boolean mapCocheSaleCoche (Coche coche) {
		
		if(mapCochesIguales.get(coche) <= 1) {
			mapCochesIguales.remove(coche);
		}else {
			mapCochesIguales.put(coche, mapCochesIguales.get(coche) - 1);
		}
		return true;
	}
	
	public boolean entraCoche(Coche coche) {
		boolean cocheDentro = false;
		for (Coche c : listaDecoches) {
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
		listaDecoches.add(coche);
		mapColorEntraCoche(coche);
		mapMarcaEntraCoche(coche);
		mapCocheEntraCoche(coche);
		setCoches.add(coche);
		return true;
	}
	
	public boolean saleCoche(Coche coche) {
		if(parkingVacio()) {
			return false;
		}
		
		int indiceCoche = 0;
		boolean cocheDentro = false;
		for (int i = 0; i < listaDecoches.size(); i++) {
			if(listaDecoches.get(i) == coche) {
				indiceCoche = i;
				cocheDentro = true;
				break;
			}
		}
		
		
		if(!cocheDentro) {
			return false;
		}
		listaDecoches.remove(indiceCoche);
		mapColorSaleCoche(coche);
		mapMarcaSaleCoche(coche);
		if(mapCochesIguales.get(coche) == 1) {
			setCoches.remove(coche);
		}
		mapCocheSaleCoche(coche);
		return true;
	}
	
	public boolean saleCocheAleatorio() {
		if(parkingVacio()) {
			return false;
		}
		
		Coche cocheAleatorio = listaDecoches.get(random.nextInt(0, listaDecoches.size()));
		saleCoche(cocheAleatorio);
		return true;
	}
		
	public boolean vacia() {
		if(parkingVacio()) {
			return false;
		}
		while(!parkingVacio()) {
			saleCocheAleatorio();
		}
		return true;
	}
		
	private void reportEncabezado(String tipoReport) {
		System.out.printf("%n%s%n", tipoReport);
		String [] arrayLetrasReport = tipoReport.split("");
		for (String letras : arrayLetrasReport) {
			System.out.print("-");
		}
		System.out.printf("%nParking: %s", nombre);
	}
	
	public void reportListaCoches() {
		reportEncabezado("LISTADO COCHES");
		for (Coche coche : listaDecoches) {
			System.out.printf("Coche: %s %s%n", coche.getMarca(), coche.getColor());
		}
		System.out.printf("Total coches: %d, plazas libres: %d.%n", listaDecoches.size(),  listaDecoches.size() - totalPlazas);
	}
	
	public void reportColores () {
		reportEncabezado("REPORT COLORES");
		for (Color color : mapColor.keySet()) {
			System.out.printf("El coche de color %s se repite %d %s%n", color.getColor(), mapColor.get(color), mapColor.get(color) == 1 ? "vez" : "veces");
		}
		System.out.printf("Total de coches: %d%n", listaDecoches.size());
	}
	
	public void reportMarcas() {
		reportEncabezado("REPORT MARCAS");
		for (Marca marca : mapMarca.keySet()) {
			System.out.printf("El coche de marca %s se repite %d %s.%n", marca.getMarca(), mapMarca.get(marca), mapMarca.get(marca) == 1 ? "vez" : "veces");
		}
	}
	
}
