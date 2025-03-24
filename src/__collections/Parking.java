package __collections;

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
	private List<Coche> listaDeCoches;
	private Map<Color, Integer> mapParkingColor;
	private Map<Marca, Integer> mapParkingMarca;
	private Map<Coche, Integer> mapCochesIguales;
	private Set<Coche> setCoches;
	private static Random random;

	public Parking(int totalPlazas, String nombre) {
		this.nombre = nombre;
		this.totalPlazas = totalPlazas;
		listaDeCoches = new ArrayList<>();
		mapParkingColor = new HashMap<>();
		mapParkingMarca = new HashMap<>();
		mapCochesIguales = new HashMap<>();
		setCoches = new HashSet<>();
		random = new Random();
	}


	private boolean parkingVacio() {
		return listaDeCoches.isEmpty();
	}

	private boolean parkingLleno() {
		return listaDeCoches.size() == totalPlazas;
	}

	private boolean mapColorEntraCoche(Coche coche) {
		Color colorCoche = coche.getColor();

		if (mapParkingColor.get(colorCoche) == null) {
			mapParkingColor.put(colorCoche, 1);
		} else {
			mapParkingColor.put(colorCoche, mapParkingColor.get(colorCoche) + 1);
		}
		return true;
	}
	
	
	
	private boolean mapColorSaleCoche(Coche coche) {
		Color colorCoche = coche.getColor();
		int valorColorCoche = mapParkingColor.get(colorCoche);

		if (valorColorCoche == 1) {
			mapParkingColor.remove(colorCoche);
		} else {
			mapParkingColor.put(colorCoche, valorColorCoche - 1);
		}

		return true;
	}

	private boolean mapMarcaEntraCoche(Coche coche) {
		Marca marcaCoche = coche.getMarca();

		if (mapParkingMarca.get(marcaCoche) == null) {
			mapParkingMarca.put(marcaCoche, 1);
		} else {
			mapParkingMarca.put(marcaCoche, mapParkingMarca.get(marcaCoche) + 1);
		}
		return true;
	}

	private boolean mapMarcaSaleCoche(Coche coche) {
		Marca marcaCoche = coche.getMarca();
		int valorMarcaCoche = mapParkingMarca.get(marcaCoche);

		if (valorMarcaCoche == 1) {
			mapParkingMarca.remove(marcaCoche);
		} else {
			mapParkingMarca.put(marcaCoche, valorMarcaCoche - 1);
		}
		return true;
	}

	private boolean mapCocheEntraCoche(Coche coche) {
		if (mapCochesIguales.get(coche) == null) {
			mapCochesIguales.put(coche, 1);
		} else {
			mapCochesIguales.put(coche, mapCochesIguales.get(coche) + 1);
		}
		return true;
	}

	private boolean mapCocheSaleCoche(Coche coche) {
		if (mapCochesIguales.get(coche) == 1) {
			mapCochesIguales.remove(coche);
		} else {
			mapCochesIguales.put(coche, mapCochesIguales.get(coche) - 1);
		}
		return true;
	}

	/*
	 * private boolean cocheDentro(Coche coche) { for (Coche c : listaDeCoches) { if
	 * (c == coche) { return true; } } return false; }
	 */

	public boolean entraCoche(Coche coche) {
		boolean cocheDentro = false;
		// porque solo queremos verificar si el coche esta dentro
		for (Coche c : listaDeCoches) {
			if (c == coche) {
				cocheDentro = true;
				break;
			}
		}

		if (parkingLleno()) {
			return false;
		}
		if (cocheDentro) {
			return false;
		}

		listaDeCoches.add(coche);
		mapColorEntraCoche(coche);
		mapMarcaEntraCoche(coche);
		mapCocheEntraCoche(coche);
		setCoches.add(coche);
		return true;
	}

	public boolean saleCoche(Coche coche) {
		/*if(!listaDeCoches.contains(coche)) {
			return false;
		}
		si ponemos .contains le estamos preguntando si tenemos dentro uno igual en función de equals 
		es decir con el mismo color y marca
		esto impediría meter otro con el mismo color y marca*/
		boolean cocheDentro = false;
		for (int i = 0; i < listaDeCoches.size(); i++) {
			if (listaDeCoches.get(i) == coche) {
				// borramos el indice que es igual al coche que entra
				listaDeCoches.remove(i);
				cocheDentro = true;
			}
		}
		if (!cocheDentro) {
			return false;
		}
		mapColorSaleCoche(coche);
		mapMarcaSaleCoche(coche);
		if (mapCochesIguales.get(coche) == 1) {
			setCoches.remove(coche);
		}
		mapCocheSaleCoche(coche);

		return true;
	}

	/*public boolean saleCocheAleatorio() {
		if (parkingVacio()) {
			return false;
		} else {
			// int indiceAleatorio = random.nextInt(0, listaDeCoches.size());
			Coche cocheAleatorio = listaDeCoches.get(random.nextInt(0, listaDeCoches.size()));
			saleCoche(cocheAleatorio);
		}
		return true;
	}*/
	public Coche saleCocheAleatorio() {
		if (parkingVacio()) {
			return null;
		}
			// int indiceAleatorio = random.nextInt(0, listaDeCoches.size());
			Coche cocheAleatorio = listaDeCoches.get(random.nextInt(0, listaDeCoches.size()));
			saleCoche(cocheAleatorio);
		return cocheAleatorio;
		
	}

	public boolean vaciaParking() {
		if (parkingVacio()) {
			return false;
		}
		while (!parkingVacio()) {
			saleCocheAleatorio();
		}
		return true;
	}
	
	

	private void encabezadoReport(String tipoReport) {
		System.out.printf("%n%s %n", tipoReport);
		String[] letrasReport = tipoReport.split("");
		for (String letras : letrasReport) {
			System.out.printf("-");
		}
		System.out.printf("%nParking: %s%n", nombre);
		// System.out.println("-".repeat(tipoReport.length()));
	}

	public void reportParking() {
		encabezadoReport("LISTADO COCHES");
		for (Coche coche : listaDeCoches) {
			System.out.println(coche);
		}
		System.out.printf("Total de coches: %d, plazas libres: %d.%n", listaDeCoches.size(),
				totalPlazas - listaDeCoches.size());
	}

	public void reportColores() {
		encabezadoReport("REPORT DE COLORES");
		for (Color color : mapParkingColor.keySet()) {
			System.out.printf("El coche de color %s se repite %d %s.%n", color.getColor(), mapParkingColor.get(color),
					mapParkingColor.get(color) == 1 ? "vez" : "veces");

		}
		System.out.printf("Total de coches: %d%n", listaDeCoches.size());
	}

	public void reportMarcas() {
		encabezadoReport("REPORT DE MARCAS");
		for (Marca marca : mapParkingMarca.keySet()) {
			System.out.printf("El coche de marca %s se repite %d %s.%n", marca.getMarca(), mapParkingMarca.get(marca),
					mapParkingMarca.get(marca) == 1 ? "vez" : "veces");

		}
		System.out.printf("Total de coches: %d%n", listaDeCoches.size());
	}

	public void reportCochesIguales() {
		encabezadoReport("REPORT DE COCHES IGUALES");
		for (Coche coche : mapCochesIguales.keySet()) {
			System.out.printf("%s se repite %d %s.%n", coche.toString(), mapCochesIguales.get(coche),
					mapCochesIguales.get(coche) == 1 ? "vez" : "veces");

		}
		System.out.printf("Total de coches: %d%n", listaDeCoches.size());
	}

	public void reportSetCoches() {
		encabezadoReport("REPORT SET DE COCHES");
		for (Coche coche : setCoches) {
			System.out.println(coche.toString());
		}
		System.out.printf("Total items: %d%n", setCoches.size());
	}
}
