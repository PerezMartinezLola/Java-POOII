package _interfaces.interfacesfuncionales;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Operaciones implements OperacionEntraEnteroSaleEntero {
	
	public int cuadrado(int x) {
		return x*x;
	}
	public int cubo(int x) {
		return x*x*x;
	}
	public int doble(int x) {
		return x*2;
	}
	public int triple(int x) {
		return x*3;
	}
	public int polinomio(int x) {
		return polinomioVariable(x, 5, 7, 9);
	}
	public int polinomioVariable(int x, int a, int b, int c) {
		return (a * (x*x*x)) + (b * (x*x)) + c;
	}
	public List <Integer> filtra (int [] numeros, FiltroEnteros f) {
		List <Integer> listaFiltrada = new ArrayList<>();
		for (int num : numeros) {
			if(f.filtrar(num)) {
				listaFiltrada.add(num);
			}
		}
		return listaFiltrada;
		
	}
	public static void main(String[] args) {
		Operaciones operaciones = new Operaciones();
		//esta x es una variable local y no choca con los parámetros anteriores
		int num = 2;
		System.out.println(operaciones.cuadrado(num));
		System.out.println(operaciones.cubo(num));
		System.out.println(operaciones.doble(num));
		System.out.println(operaciones.triple(num));
		System.out.println(operaciones.polinomio(num));
		System.out.println(operaciones.polinomioVariable(num, 5, 7, 9));
		
		OperacionEntraEnteroSaleEntero cuadrado = s -> s * s;
		//Es lo mismo que poner esto
		//OperacionEntraEnteroSaleEntero cuadrado = (int s) -> {
		//														return s * s;
		//};
		OperacionEntraEnteroSaleEntero cubo = s -> s * s * s;
		OperacionEntraEnteroSaleEntero doble = s -> s * 2;
		OperacionEntraEnteroSaleEntero triple = s -> s * 3;
		OperacionEntraEnteroSaleEntero polinomio = s -> (5 * (s*s*s)) + (7 * (s*s)) + 9;;
		OperacionEntran4EnterosSaleEntero polinomioVariable = (a, b, c, x) -> (a * (x*x*x)) + (b * (x*x)) + c;
		
		OperacionEntraEnteroSaleEntero mitad = s -> s / 2;
		OperacionEntraEnteroSaleEntero cuartaParte = s -> s / 4;
		OperacionEntraEnteroSaleEntero decimaParte = s -> s / 10;
		OperacionNsimaParte nSimaParte = (x, p) -> x / p;
		
		
		
		System.out.println(cuadrado.dale(num));
		System.out.println(cubo.dale(num));
		System.out.println(doble.dale(num));
		System.out.println(triple.dale(num));
		System.out.println(polinomio.dale(num));
		System.out.println(polinomioVariable.dale(5, 7, 9, num));
		
		System.out.println(mitad.dale(num));
		System.out.println(cuartaParte.dale(num));
		System.out.println(decimaParte.dale(num));
		System.out.println(nSimaParte.dale(num, 20));
		System.out.println(operaciones.filtra(new int [] {2, 3, -7, -5}, s -> s < 0));
		
		Function <Integer, Double> f = s -> s* 2.0;
		f.apply(4);
		
	}
	@Override
	public int dale(int i) {
		//podría hacer cuadrado, cubo, etc.
		return 0;
	}
}
