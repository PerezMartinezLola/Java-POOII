package __casinopracticaexamen;

import java.util.Random;

public class Dado {
	private int lanzamiento;
	private int caras;
	private int[] historico;

	// Quiero que las caras y los elementos del historico se establezcan en el
	// momento de creación del objeto
	public Dado(int caras, int elementosDelHistorico) {
		this.caras = caras;
		historico = new int[elementosDelHistorico];
	}

	// metodo lanzar
	public int lanzar() {
		Random random = new Random();
		lanzamiento = random.nextInt(1, caras + 1);

		for (int i = 1; i < historico.length; i++) {
			historico[i - 1] = historico[i];
		}
		historico[historico.length - 1] = lanzamiento;
		return lanzamiento;
	}

	// mostrar
	public void mostrarHistorico() {
		for (int tirada : historico) {
			System.out.printf("%d ", tirada);
		}
	}

	// reset
	public void reset() {
		for (int i = 0; i < historico.length; i++) {
			historico[i] = 0;
		}
	}

	// poder lanzarse n veces y contar el numero de veces que sale una cara
	public int numVecesCara(int vecesLanzadas, int numeroDeCara) {
		int contadorDeCara = 0;
		boolean carasValidas = numeroDeCara <= caras && numeroDeCara > 0;
		if (carasValidas) {
			for (int i = 0; i < vecesLanzadas; i++) {
				if (lanzar() == numeroDeCara) {
					contadorDeCara++;
				}
			}
		}
		return contadorDeCara;
	}

	
	// Pruebas
	public static void main(String[] args) {
		Dado d1 = new Dado(6, 10);
		//Lanzamientos random en bucle
		System.out.printf("Lanzamientos %n");
		System.out.printf("============%n");
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d ", d1.lanzar());
		}
		//historico de lanzamientos
		System.out.println();
		System.out.printf("%nHistorico de lanzamientos%n");
		System.out.printf("===========================%n");
		d1.mostrarHistorico();
		
		//reset
		System.out.println();
		System.out.printf("%nReset %n");
		System.out.printf("========%n");
		d1.reset();
		d1.mostrarHistorico();
		
		//numVeces de 1 cara
		System.out.println();
		System.out.printf("%nNumero de veces de una cara%n");
		System.out.printf("=============================%n");
		System.out.println(d1.numVecesCara(10, 3));
		
		
	}

}
