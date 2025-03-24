package arraylistnotion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class NumerosRandom <T>{
	
	public static void main(String[] args) {
		// Random sin ArrayList
		/*Random random = new Random();
		
		System.out.printf("Lista de 20 numeros Random del 1 al 100%n");
		System.out.printf("=======================================%n");
		for (int i = 0; i < 20; i++) {
			 int numRandom = random.nextInt(1, 101);
			System.out.printf("%d ", numRandom);
		}*/
		
		
			int min = 1;
			int max = 100;
			
			ArrayList<Integer> a1 = new ArrayList<>();
			
			for (int i = 0; i < 20; i++) {
				int aleatorio = (int)(Math.random() * (max - min + 1) + min);
				a1.add(aleatorio);
				
			}
			System.out.printf("1. Arraylist con 20 numeros de 1 a 100%n");
			System.out.printf("====================================%n");
			System.out.println(a1);
			
			System.out.println();
			System.out.printf("2. Arraylist suma de numeros%n");
			System.out.printf("============================%n");
			int suma = 0;
			for (int i = 0; i < a1.size(); i++) {
				suma += a1.get(i);
			}
			
			System.out.println(suma);
			
			System.out.println();
			System.out.printf("2. Arraylist media de numeros%n");
			System.out.printf("=============================%n");
			int media = 0;
			for (int i = 0; i < a1.size(); i++) {
				media += a1.get(i);
			}
			media =  media / a1.size();
			System.out.println(media);
			
			System.out.println();
			System.out.printf("2. Valor máximo de Arraylist %n");
			System.out.printf("=============================%n");
			int valorMaximo = Integer.MIN_VALUE;
			
			for (Integer numeros : a1) {
				if(numeros > valorMaximo) {
					valorMaximo = numeros;
				}
			}
			System.out.println(valorMaximo);
			
			System.out.println();
			System.out.printf("2. Valor minimo de Arraylist %n");
			System.out.printf("=============================%n");
			int valorMinimo = Integer.MAX_VALUE;
			
			for (Integer numeros : a1) {
				if(numeros < valorMinimo) {
					valorMinimo = numeros;
				}
			}
			System.out.println(valorMinimo);
			
	}
}
