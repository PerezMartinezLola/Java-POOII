package arraylistnotion;

import java.util.ArrayList;
import java.util.Random;

public class RandomJavi {
	
	
	
	private static void muestraYsubraya (String texto) {
		System.out.println();
		System.out.println(texto);
		String guion = "-";
		for (int i = 0; i < texto.length() ; i++) {
			System.out.print(guion);
	}
		System.out.println();
	}
	
	private static void muestraTodosLosDatos (ArrayList<Integer> lista) {

		Integer suma = 0;
		Integer maximo = lista.get(0);
		Integer minimo = lista.get(0);
		
		for (Integer num : lista) {
			suma+= num;
			maximo = num > maximo ? num : maximo;
			minimo = num < minimo ? num : minimo;
		}
		
		muestraYsubraya("Suma");
		System.out.println(suma);
		
		
		muestraYsubraya("Media");
		System.out.println(suma/lista.size());
		
		
		muestraYsubraya("Maximo");
		System.out.println(maximo);
		
		muestraYsubraya("Minimo");
		System.out.println(minimo);
		
		
	}
	
	
	
	//main es un método estatico que permite hacer run
	public static void main(String[] args) {
		ArrayList <Integer> al = new ArrayList <>();
		Random random = new Random();
		
		
		for (int i = 0; i < 5; i++) {
			al.add(random.nextInt(1, 101));
			
		}
		muestraYsubraya("Mostrar lista de numeros aleatorios");
		System.out.println(al);
		
		Integer suma = 0;
		Integer maximo = al.get(0);
		Integer minimo = al.get(0);
		
		for (Integer num : al) {
			suma+= num;
			maximo = num > maximo ? num : maximo;
			minimo = num < minimo ? num : minimo;
		}
		
		muestraYsubraya("Suma");
		System.out.println(suma);
		
		
		muestraYsubraya("Media");
		System.out.println(suma/al.size());
		
		
		muestraYsubraya("Maximo");
		System.out.println(maximo);
		
		muestraYsubraya("Minimo");
		System.out.println(minimo);
		
		
		
		//Eliminar los menores de 50
		muestraYsubraya("Eliminar los menores de 50");
		for (int i = al.size()- 1; i >= 0; i--) {
			if(al.get(i) < 50) {
				al.remove(i);
				}
			}
		System.out.println(al);
		
		}
		
	// al.removeIf(S -> s < 50);
		
	
}
