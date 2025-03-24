package __ejercicioRobert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

public class AlmacenDeDias {
	private String nombre;
	private List<DiaDeLaSemana> listaDiasDeSemana;
	private Map<DiaDeLaSemana, Integer> mapaDiasIguales;
	private static Random random = new Random();

	public AlmacenDeDias(String nombre) {
		this.nombre = nombre;
		listaDiasDeSemana = new ArrayList<>();
		mapaDiasIguales = new HashMap<>();

		DiaDeLaSemana[] arrayDiaDeSemana = DiaDeLaSemana.values();
		for (int i = 0; i < 15; i++) {
			DiaDeLaSemana diaDeLaSemanaAleatorio = arrayDiaDeSemana[random.nextInt(arrayDiaDeSemana.length)];
			listaDiasDeSemana.add(diaDeLaSemanaAleatorio);

			if (mapaDiasIguales.get(diaDeLaSemanaAleatorio) == null) {
				mapaDiasIguales.put(diaDeLaSemanaAleatorio, 1);
			} else {
				mapaDiasIguales.put(diaDeLaSemanaAleatorio, mapaDiasIguales.get(diaDeLaSemanaAleatorio) + 1);
			}
		}
	}
	
	
	public boolean addDiaAleatorio() {
		DiaDeLaSemana [] arrayDiasSemana = DiaDeLaSemana.values();
		DiaDeLaSemana diaSemanaAleatorio = arrayDiasSemana[random.nextInt(arrayDiasSemana.length)];
		listaDiasDeSemana.add(diaSemanaAleatorio);
		
		if (mapaDiasIguales.get(diaSemanaAleatorio) == null) {
			mapaDiasIguales.put(diaSemanaAleatorio, 1);
		} else {
			mapaDiasIguales.put(diaSemanaAleatorio, mapaDiasIguales.get(diaSemanaAleatorio) + 1);
		}
		return true;
	}
	
	public void eliminarDiasSemana(DiaDeLaSemana diaParaBorrar) {
		
		  while(listaDiasDeSemana.contains(diaParaBorrar)) {
	            listaDiasDeSemana.remove(diaParaBorrar);
	        }
	        mapaDiasIguales.remove(diaParaBorrar);
	    }
	
	

	
	  private String comprobarCantidadDeDia(DiaDeLaSemana diaDeLaSemana) {
	        return String.format("%s", mapaDiasIguales.get(diaDeLaSemana) == null ? "no hay" : mapaDiasIguales.get(diaDeLaSemana));
	    }

	    @Override
	    public String toString() {
	        return String.format("Almacén de días\n"
	                + "===============\n"
	                + "Nombre: %s\n"
	                + "LUNES: %s\n"
	                + "MARTES: %s\n"
	                + "MIÉRCOLES: %s\n"
	                + "JUEVES: %s\n"
	                + "VIERNES: %s\n"
	                + "SÁBADO: %s\n"
	                + "DOMINGO: %s\n",
	                nombre,
	                comprobarCantidadDeDia(DiaDeLaSemana.LU),
	                comprobarCantidadDeDia(DiaDeLaSemana.MA),
	                comprobarCantidadDeDia(DiaDeLaSemana.MI),
	                comprobarCantidadDeDia(DiaDeLaSemana.JU),
	                comprobarCantidadDeDia(DiaDeLaSemana.VI),
	                comprobarCantidadDeDia(DiaDeLaSemana.SA),
	                comprobarCantidadDeDia(DiaDeLaSemana.DO)
	                );
	    }
	/*public void reportDias() {
		System.out.printf("Almacén días");
		System.out.printf("%n------------%n");
		System.out.printf("Nombre: %s%n", nombre);
		
		for (DiaDeLaSemana diaDeLaSemana : mapaDiasIguales.keySet()) {
			System.out.printf("%s: %s%n", diaDeLaSemana.getNombreEnMayusculas(), mapaDiasIguales.get(diaDeLaSemana), 
							 mapaDiasIguales.get(diaDeLaSemana) != null ? mapaDiasIguales.get(diaDeLaSemana) : "no hay");
		}
		
	}*/
	
	public static void main(String[] args) {
		AlmacenDeDias ad1 = new AlmacenDeDias("lista");
		System.out.println(ad1);
	}
	
}

	/*	if(!listaDiasDeSemana.contains(diaDeLaSemana)) {
			return false;
		}
		
		for (int i = 0; i < listaDiasDeSemana.size(); i++) {
			if(listaDiasDeSemana.get(i) == diaDeLaSemana) {
				listaDiasDeSemana.remove(i);
			}
		}
		
		if(mapaDiasIguales.get(diaDeLaSemana) != null) {
			mapaDiasIguales.remove(diaDeLaSemana);
		}
		
		return true;
	}*/


