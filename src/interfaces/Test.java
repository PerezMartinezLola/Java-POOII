package interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Mosca m = new Mosca();
		Animal ma = new Mosca();
		Perro p = new Perro();
		Animal pa = new Perro();
		//en un array de animales si puedo tener animales de todo tipo juntos
		
		Animal [] animales = {ma, pa, p, m};
		List <Animal> listAnimales = new ArrayList<>(Arrays.asList(animales));
		
		Mosca m1 = new Mosca();
		Avion a1 = new Avion();
		Volador mv1 = new Mosca();
		Volador av1 = new Avion();
		
		Volador [] voladores = {mv1, av1, m1, a1};
		for (Volador volador : voladores) {
			volador.planear();
		}
		
		//si el volador es animal que respire
		System.err.printf("%nVoladores que respiran");
		System.err.printf("%n----------------------%n");
		for (Volador volador : voladores) {
			if(volador instanceof Animal) {
				((Animal) volador).respirar();
			}
			
		}
	}
}
