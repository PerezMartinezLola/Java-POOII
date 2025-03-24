package arraylistnotion;

import java.util.ArrayList;
import java.util.Iterator;

public class EjercicioColores {
	
	private static void mostrarYsubrayar (String texto) {
		System.out.println();
		String guion = "-";
		System.out.println(texto);
		for (int i = 0; i < texto.length(); i++) {
			System.out.print(guion);
			
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		ArrayList <String> alColores = new ArrayList<>();
		String [] colores = {"rojo", "amarillo", "verde", "rojo", "amarillo", "azul", "naranja", 
				"marrón", "verde"};
		
		
		
		
		mostrarYsubrayar("Colores hasta llegar a 15");
		ArrayList <String> coloresEnSerie = new ArrayList <>();
		/*int posicion = 0;
		for (int i = 0; i < 20; i++) {
			if(i < colores.length) {
				alColores.add(colores [i]);
				
			}else {
			
				alColores.add(colores [posicion++] = colores [i-colores.length]);
				
		
			}
		}
		coloresEnSerie = alColores;
		System.out.println(coloresEnSerie);*/
		
		alColores.clear();
		
		for (int i = 0; i < colores.length; i++) {
			alColores.add(colores [i]);
			
		}
		mostrarYsubrayar("4. Añadir colores con bucle for");
		System.out.println(alColores);
		
		/*ArrayList <String> colores = new ArrayList<>();
		
		public void addPorEspacios(String frase){
			String[] arrayPalabras = frase.split(" ");
			for (String palabra : arrayPalabras) {
				colores.add(palabra);
			}
		}*/
		alColores.clear();
		mostrarYsubrayar("ArrayList limpio");
		
		
		for (String color : colores) {
			alColores.add(color);
		}
		mostrarYsubrayar("4. Añadir colores con bucle foreach");
		System.out.println(alColores);
		
		
		mostrarYsubrayar("5.Eliminar el segundo rojo");
		int contadorRojo = 0;
		
		for (int i = 0; i < alColores.size(); i++) {
			if(alColores.get(i).equals("rojo")) {
				contadorRojo++;
				
			}
			if(alColores.get(i).equals("rojo") && contadorRojo > 1) {
				alColores.remove(i);
			}
		}
		System.out.println(alColores);
		
		
		mostrarYsubrayar("6.Eliminar todos los amarillos");
		
		
			
		
	}
	
}
