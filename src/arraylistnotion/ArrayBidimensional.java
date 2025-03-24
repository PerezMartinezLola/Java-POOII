package arraylistnotion;

import java.util.Iterator;

public class ArrayBidimensional {
	public static void main(String[] args) {

		int[][] array2D = new int[4][3];
		int [][] array2D_2 = {{3,2,5}, {1,7}};

		// array2d.length es el numero de filas
		// array2D [i].length hace referencia a las columnas de cada fila
		int indice = 1;
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				array2D[i][j] = indice++;
				System.out.printf("%d ", array2D[i][j]);

			}
			System.out.println();
		}
		System.out.printf("%nArray 2D_2");
		System.out.printf("%n-----------%n");
		for (int i = 0; i < array2D_2.length; i++) {
			for (int j = 0; j < array2D_2[i].length; j++) {
				System.out.printf("%d ", array2D_2[i][j]);

			}
			System.out.println();
		}

	}
}
