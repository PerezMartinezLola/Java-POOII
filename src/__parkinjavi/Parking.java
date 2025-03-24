package __parkinjavi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Parking {
	private String nombre;
	private int plazasTotales;
	private int plazasLibres;

	private List<Coche> listaCoches;
	private Set<Coche> conjuntoCoches;
	// HashMap es porque verifica primero el Hash
	private Map<Coche, Integer> mapDeCoches = new HashMap<>();
	private Map<Color, Integer> mapDeColores = new HashMap<>();
	private Map<Marca, Integer> mapDeMarca = new HashMap<>();
	private static Random random = new Random();

	public Parking(String nombre, int plazasTotales) {
		this.nombre = nombre;
		this.plazasTotales = plazasTotales;
		plazasLibres = plazasTotales;
		listaCoches = new ArrayList<>();
		conjuntoCoches = new HashSet<>();
	}

	// List en un interfaz, hay una lista de métodos que debe tener ArrayList
	// List es lo generico, ArrayList es concreto
	// private List<Coche> listaCoches = new ArrayList<>();

	// es bueno poner de nombre del parámetro la palabra entera Coche
	public boolean entraCoche(Coche coche) {
		boolean cocheDentro = false;
		for (Coche c : listaCoches) {
			// == apunta al mismo objeto
			if (c == coche) {
				cocheDentro = true;
				break;
			}
		}

		if (plazasLibres > 0 && !cocheDentro) {
			plazasLibres--;
			listaCoches.add(coche);
			conjuntoCoches.add(coche);
			mapDeColores.put(coche.getColor(), mapDeColores.getOrDefault(coche.getColor(), 0) + 1);
			mapDeMarca.put(coche.getMarca(), mapDeColores.getOrDefault(coche.getMarca(), 0) + 1);
			mapDeCoches.put(coche, mapDeColores.getOrDefault(coche, 0) + 1);
			return true;
		}
		return false;
	}

	public Coche saleCoche(Coche coche) {
		boolean cocheDentro = false;
		int indiceCoche = 0;
		for (int i = 0; i < listaCoches.size(); i++) {
			if (listaCoches.get(i) == coche) {
				indiceCoche = i;
				cocheDentro = true;
				break;
			}

		}
		if (cocheDentro) {
			plazasLibres++;
			listaCoches.remove(indiceCoche);
			// conjuntoCoches.add(coche);
			mapDeColores.put(coche.getColor(), mapDeColores.get(coche.getColor()) - 1);
			if (mapDeColores.get(coche.getColor()) == 0) {
				mapDeColores.remove(coche.getColor());
			}

			mapDeMarca.put(coche.getMarca(), mapDeMarca.get(coche.getMarca()) - 1);
			if (mapDeMarca.get(coche.getMarca()) == 0) {
				mapDeMarca.remove(coche.getMarca());
			}

			mapDeCoches.put(coche, mapDeCoches.get(coche) - 1);
			if (mapDeCoches.get(coche) == 0) {
				mapDeCoches.remove(coche);
				conjuntoCoches.remove(coche);
			}

			return coche;
		}
		return null;
	}

	public Coche saleCocheAleatorio() {
		if (listaCoches.isEmpty())
			return null;

		int indiceAleatorio = random.nextInt(0, listaCoches.size());
		return saleCoche(listaCoches.get(indiceAleatorio));

	}

	/*
	 * public boolean saleCocheAleatorio(){ if(listaCoches.isEmpty()) return false;
	 * 
	 * int indiceAleatorio = random.nextInt(0, listaCoches.size());
	 * saleCoche(listaCoches.get(indiceAleatorio)); return true; }
	 */

	public boolean vaciar() {
		if (listaCoches.isEmpty())
			return false;

		while (saleCocheAleatorio() != null) {
		}
		return true;
	}
	
	public void report() {
		for (Coche coche : mapDeCoches.keySet()) {
			System.out.printf("Coche de marca %s y modelo %s se repite %d %s%n", coche.getMarca(),
							   coche.getColor(), mapDeCoches.get(coche),  
							   mapDeCoches.get(coche) == 1 ? "vez" : "veces");
		}
	}
	
	
	
	public List<Coche> getListaCoches() {
		return listaCoches;
	}

	public Set<Coche> getConjunCoches() {
		return conjuntoCoches;
	}

}
