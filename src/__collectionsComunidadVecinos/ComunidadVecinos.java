package __collectionsComunidadVecinos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class ComunidadVecinos {
	private String nombre;
	private int totalPlazas;
	private List<Persona> listaPersonas;
	private Map<Profesion, Integer> mapProfesiones;
	private Map<Ciudad, Integer> mapCiudades;
	private Map<Persona, Integer> mapPersonasIguales;
	private Set<Persona> setPersonas;
	private static Random random = new Random();

	public ComunidadVecinos(String nombre, int totalPlazas) {
		this.nombre = nombre;
		this.totalPlazas = totalPlazas;
		listaPersonas = new ArrayList<Persona>();
		mapProfesiones = new HashMap<>();
		mapCiudades = new HashMap<>();
		mapPersonasIguales = new HashMap<>();
		setPersonas = new HashSet<>();
	}

	private boolean comunidadVacia() {
		return listaPersonas.isEmpty();
	}

	private boolean comunidadLlena() {
		return listaPersonas.size() == totalPlazas;
	}
	
	private boolean mapsEntraPersona (Persona persona) {
		
		Profesion profesionPersona = persona.getProfesion();
		
		if(mapProfesiones.get(profesionPersona) == null) {
			mapProfesiones.put(profesionPersona, 1);
		}else {
			mapProfesiones.put(profesionPersona, mapProfesiones.get(profesionPersona) + 1);
		}
		
		Ciudad ciudadPersona = persona.getCiudad();
		
		if(mapCiudades.get(ciudadPersona) == null) {
			mapCiudades.put(ciudadPersona, 1);
		}else {
			mapCiudades.put(ciudadPersona, mapCiudades.get(ciudadPersona) + 1);
		}
		
		if(mapPersonasIguales.get(persona) == null) {
			mapPersonasIguales.put(persona, 1);
		}else {
			mapPersonasIguales.put(persona, mapPersonasIguales.get(persona) + 1);
		}
		return true;
	}
	
	private boolean mapsSalePersona (Persona persona) {
		Profesion profesionPersona = persona.getProfesion();
		
		if(mapProfesiones.get(profesionPersona) == 1) {
			mapProfesiones.remove(profesionPersona);
		}else {
			mapProfesiones.put(profesionPersona, mapProfesiones.get(profesionPersona) - 1);
		}
		
		Ciudad ciudadPersona = persona.getCiudad();
		
		if(mapCiudades.get(ciudadPersona) == 1) {
			mapCiudades.remove(ciudadPersona);
		}else {
			mapCiudades.put(ciudadPersona, mapCiudades.get(ciudadPersona) - 1);
		}
		
		if(mapPersonasIguales.get(persona) == 1) {
			mapPersonasIguales.remove(persona);
		}else {
			mapPersonasIguales.put(persona, mapPersonasIguales.get(persona) - 1);
		}
		return true;
	}
	
	
	
	
	/*private boolean mapProfesionEntra(Persona persona) {
		Profesion profesionPersona = persona.getProfesion();

		if (mapProfesiones.get(profesionPersona) == null) {
			mapProfesiones.put(profesionPersona, 1);
		} else {
			mapProfesiones.put(profesionPersona, mapProfesiones.get(profesionPersona) + 1);
		}
		return true;
	}

	private boolean mapProfesionSale(Persona persona) {
		Profesion profesionPersona = persona.getProfesion();

		if (mapProfesiones.get(profesionPersona) <= 1) {
			mapProfesiones.remove(profesionPersona);
		} else {
			mapProfesiones.put(profesionPersona, mapProfesiones.get(profesionPersona) - 1);
		}
		return true;
	}

	private boolean mapCiudadEntra(Persona persona) {
		Ciudad ciudadPersona = persona.getCiudad();

		if (mapCiudades.get(ciudadPersona) == null) {
			mapCiudades.put(ciudadPersona, 1);
		} else {
			mapCiudades.put(ciudadPersona, mapCiudades.get(ciudadPersona) + 1);
		}
		return true;
	}

	private boolean mapCiudadSale(Persona persona) {
		Ciudad ciudadPersona = persona.getCiudad();

		if (mapCiudades.get(ciudadPersona) <= 1) {
			mapCiudades.remove(ciudadPersona);
		} else {
			mapCiudades.put(ciudadPersona, mapCiudades.get(ciudadPersona) - 1);
		}
		return true;
	}

	private boolean mapPersonasIgualesEntra(Persona persona) {

		if (mapPersonasIguales.get(persona) == null) {
			mapPersonasIguales.put(persona, 1);
		} else {
			mapPersonasIguales.put(persona, mapPersonasIguales.get(persona) + 1);
		}
		return true;
	}

	private boolean mapPersonasIgualesSale(Persona persona) {

		if (mapPersonasIguales.get(persona) <= 1) {
			mapPersonasIguales.remove(persona);
		} else {
			mapPersonasIguales.put(persona, mapPersonasIguales.get(persona) - 1);
		}
		return true;
	}*/

	public boolean entraPersona(Persona persona) {
		if (comunidadLlena()) {
			return false;
		}

		boolean personaDentro = false;
		for (Persona p : listaPersonas) {
			if (p == persona) {
				personaDentro = true;
				break;
			}
		}

		if (personaDentro) {
			return false;
		}
		listaPersonas.add(persona);
		mapsEntraPersona(persona);
		setPersonas.add(persona);
		return true;
	}

	public boolean salePersona(Persona persona) {
		if (comunidadVacia()) {
			return false;
		}

		boolean personaDentro = false;
		int indicePersona = 0;
		for (int i = 0; i < listaPersonas.size(); i++) {
			if (listaPersonas.get(i) == persona) {
				indicePersona = i;
				personaDentro = true;
				break;
			}
		}

		if (!personaDentro) {
			return false;
		}

		listaPersonas.remove(indicePersona);
		
		if (mapPersonasIguales.get(persona) <= 1) {
			setPersonas.remove(persona);
		}
		mapsSalePersona(persona);
		return true;
	}

	public boolean salePersonaAleatoria() {
		if (comunidadVacia()) {
			return false;
		}
		Persona personaAleatoria = listaPersonas.get(random.nextInt(listaPersonas.size()));
		return salePersona(personaAleatoria);

	}

	public boolean vaciaComunidad() {
		if (comunidadVacia()) {
			return false;
		}
		while (!comunidadVacia()) {
			salePersonaAleatoria();
		}
		return true;
	}

	private void encabezadoReport(String tipoReport) {
		System.out.printf("%n%s%n", tipoReport);
		String[] letras = tipoReport.split("");
		for (String letra : letras) {
			System.out.print("-");
		}
		System.out.printf("%nComunidad: %s%n", nombre);
	}

	public void reportComunidad() {
		encabezadoReport("LISTADO PERSONAS");
		for (Persona persona : listaPersonas) {
			System.out.printf("Persona: %s %s %s %n", persona.getNombre(), persona.getProfesion(), persona.getCiudad());
		}
		System.out.printf("Total de personas: %d, plazas libres: %d.%n", listaPersonas.size(),
				totalPlazas - listaPersonas.size());
	}

	public void reportProfesiones() {
		encabezadoReport("REPORT DE PROFESIONES");
		for (Profesion profesion : mapProfesiones.keySet()) {
			System.out.printf("La profesion %s se repite %d %s.%n", profesion.getProfesion(),
					mapProfesiones.get(profesion), mapProfesiones.get(profesion) == 1 ? "vez" : "veces");
		}
		System.out.printf("Total personas: %d%n", listaPersonas.size());
	}

	public void reportCiudades() {
		encabezadoReport("REPORT CIUDADES");
		for (Ciudad ciudad : mapCiudades.keySet()) {
			System.out.printf("La comunidad de vecinos tiene %d persona%s de la ciudad de %s.%n",
					mapCiudades.get(ciudad), mapCiudades.get(ciudad) == 1 ? "" : "s", ciudad.getCiudad());
		}
		System.out.printf("Total personas: %d%n", listaPersonas.size());
	}

	public void reportPersonasIguales() {
		encabezadoReport("REPORT DE PERSONAS IGUALES");
		for (Persona persona : mapPersonasIguales.keySet()) {
			System.out.printf("Persona: %s %s %s se repite %d %s.%n", persona.getNombre(), persona.getProfesion(),
					persona.getCiudad(), mapPersonasIguales.get(persona),
					mapPersonasIguales.get(persona) == 1 ? "vez" : "veces");
		}
		System.out.printf("Total de personas: %d%n", listaPersonas.size());
	}

	public void reportSetPersonas() {
		encabezadoReport("REPORT SET DE PERSONAS");
		for (Persona persona : setPersonas) {
			System.out.printf("Persona: %s %s %s%n", persona.getNombre(), persona.getProfesion(), persona.getCiudad());
		}
		System.out.printf("Total tipos de personas: %d%n", setPersonas.size());
	}

}
