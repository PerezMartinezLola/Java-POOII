package colecciones;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<> ();
		System.out.println("Arraylist vacío");
		System.out.printf("================%n");
		System.out.println(al);
		
		al.add("one");
		al.add("two");
		
		System.out.printf("%nArrayList ahora lleno%n");
		System.out.printf("=======================%n");
		System.out.println(al);
		
		System.out.printf("%nArrayList añadiendo un elemento%n");
		System.out.printf("===============================%n");
		al.add(1, "caracola");
		System.out.println(al);
		
		ArrayList<Integer> al2 = new ArrayList<>();
		// para añadir .add()
		al2.add(1);
		al2.add(2);
		System.out.println();
		System.out.printf("%nArrayList integer%n");
		System.out.printf("=================%n");
		System.out.println(al2);
		
		//para añadir en un sitio especifico .add(indice, elemento)
		System.out.println();
		System.out.printf("%nArrayList añadir el numero 9 en medio%n");
		System.out.printf("=====================================%n");
		al2.add(1, 9);
		System.out.println(al2);
		
		// preguntar si contiene un elemento .contains(valor)
		System.out.println();
		System.out.printf("%nDevuelve true si contiene un elemento%n");
		System.out.printf("======================================%n");
		System.out.println(al2.contains(9));
		
		//.get(posicion) el elemento de una posicion determinada 
		System.out.println();
		System.out.printf("%nQue te de el elemento de una posicion determinada%n");
		System.out.printf("================================================%n");
		System.out.println(al2.get(0));
		
		//.size() es un metodo que devuelve el tamaño
		//.clear() es para limpiar el arrayList
		//.indexof() te devuelve la posicion del elemento, -1 es que no existe
		System.out.println();
		System.out.printf("%nQue te de la posicion del elemento que pedimos%n");
		System.out.printf("================================================%n");
		System.out.println(al2.indexOf(3));
		
		//remove permite que le pases el objeto o que le pases el índice. si está repetida borra la primera.
		//borra lo que apunta a la cosa, no la cosa
		
		//.set sobreescribir un elemento 
		//toArray
		
		
		
	}
}
