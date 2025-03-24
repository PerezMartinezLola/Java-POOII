
package casino;

import java.util.Arrays;
import java.util.Random;

public class Dado {
	private int lanzamiento;
	private int[] historicoLanzamientos;
	private int caras;

	public Dado(int caras, int elementosHistorico) {
		this.caras = caras < 1 ? 1 : caras > 6 ? 6 : caras;
		historicoLanzamientos = new int[elementosHistorico <= 0 ? 1 : elementosHistorico];
	}
	
	private boolean carasValidas () {
		return caras >= 1 && caras <= 6;
	}
	
	public int lanzar() {
		Random random = new Random();
		lanzamiento = random.nextInt(1, caras + 1);
		
		for (int i = 1; i < historicoLanzamientos.length; i++) {
			historicoLanzamientos[i - 1] = historicoLanzamientos[i];
		}
		historicoLanzamientos[historicoLanzamientos.length - 1] = lanzamiento;
		return lanzamiento;
	}

	public void mostrarHistorico () {
		for (int tirada : historicoLanzamientos) {
			if(tirada != 0) {
				System.out.printf("%d ",tirada);
			}
		}
	}
	
	public int numeroVecesMismaCara (int lanzamientos, int cara) {
		int contadorMismaCara = 0;
		if(carasValidas()) {
			for (int i = 0; i < lanzamientos; i++) {
				if(lanzar () == cara) {
					contadorMismaCara++;
				}
			}
		}
		return contadorMismaCara;
	}
	
	public int numeroVecesMismaCaraEnHistorico (int cara) {
		int contadorMismaCara = 0;
		if(carasValidas()) {
			for (int i = 0; i < historicoLanzamientos.length; i++) {
				if(historicoLanzamientos[i] == cara) {
					contadorMismaCara++;
				}
			}
		}
		return contadorMismaCara;
	}
	
	
	public int [] reset () {
		for (int i = 0; i < historicoLanzamientos.length; i++) {
			 historicoLanzamientos[i] = 0;
		}
		return historicoLanzamientos;
	}
	
	
	public static void main(String[] args) {
		Dado d1 = new Dado(6, 5);
		
		System.out.printf("Lanzamientos %n");
		System.out.printf("============%n");
		for (int i = 0; i < 10; i++) {
			System.out.println(d1.lanzar());
		}
		
		System.out.println();
		System.out.printf("%nMostrar historico %n");
		System.out.printf("=================%n");
		d1.mostrarHistorico();
		
		
		System.out.println();
		System.out.printf("%nNumero veces misma cara historico%n");
		System.out.printf("===================================%n");
		System.out.println(d1.numeroVecesMismaCaraEnHistorico(4));
		
		
		System.out.println();
		System.out.printf("%nNumero veces de la misma cara %n");
		System.out.printf("==============================%n");
		System.out.println(d1.numeroVecesMismaCara(10, 5));
		
		System.out.println();
		System.out.printf("%nReset historico %n");
		System.out.printf("=================%n");
		System.out.println(Arrays.toString(d1.reset()));
	}
}





















/*
 * package casino;
 * 
 * import java.util.Arrays; import java.util.Random;
 * 
 * public class Dado { private int lanzamiento; private int caras; private int[]
 * historicoDeLanzamientos;
 * 
 * public Dado(int caras, int elementosDelHistorico) { this.caras = caras;
 * historicoDeLanzamientos = new int[elementosDelHistorico]; }
 * 
 * // mostrar histórico public void mostrarHistorico() { for (int tirada :
 * historicoDeLanzamientos) { if (tirada != 0) { System.out.printf("%d ",
 * tirada); } } }
 * 
 * // lanzar dado public int lanzar() { Random random = new Random();
 * lanzamiento = random.nextInt(caras);
 * 
 * for (int i = 1; i < historicoDeLanzamientos.length; i++) {
 * historicoDeLanzamientos[i - 1] = historicoDeLanzamientos[i]; }
 * historicoDeLanzamientos[historicoDeLanzamientos.length - 1] = lanzamiento;
 * return lanzamiento; }
 * 
 * // reset el historico public int[] reseteoHistorico() { for (int i = 0; i <
 * historicoDeLanzamientos.length; i++) { historicoDeLanzamientos[i] = 0; }
 * return historicoDeLanzamientos; }
 * 
 * // poder lanzarse n veces public int[] lanzarNumeroVeces(int n) { int[]
 * vecesLanzadas = new int[n]; for (int i = 0; i < n; i++) { Random random = new
 * Random(); vecesLanzadas[i] = random.nextInt(caras); } return vecesLanzadas; }
 * 
 * // numero de veces que sale el valor de una cara public int vecesUnaCara(int
 * numeroRepetido) { int contadorNumeroRepetido = 0; for (int tirada :
 * historicoDeLanzamientos) { if (tirada == numeroRepetido) {
 * contadorNumeroRepetido++; }
 * 
 * } return contadorNumeroRepetido; }
 * 
 * // Pruebas public static void main(String[] args) { Dado d1 = new Dado(6,
 * 10); System.out.printf("Comprobaciones de lanzamientos%n");
 * System.out.printf("==============================%n"); for (int i = 0; i < 5;
 * i++) { System.out.printf("%d ", d1.lanzar()); } System.out.println();
 * System.out.printf("%nHistorico de lanzamientos%n");
 * System.out.printf("===========================%n"); d1.mostrarHistorico();
 * 
 * System.out.println(); System.out.printf("%nReseteo del historico%n");
 * System.out.printf("=======================%n");
 * System.out.println(Arrays.toString(d1.reseteoHistorico()));
 * 
 * System.out.println(); System.out.printf("%nLanzar 7 veces%n");
 * System.out.printf("================%n");
 * System.out.println(Arrays.toString(d1.lanzarNumeroVeces(7)));
 * 
 * System.out.println(); System.out.printf("%nContador numero repetido%n");
 * System.out.printf("==========================%n"); System.out.printf("%d ",
 * d1.vecesUnaCara(3)); }
 * 
 * }
 */
