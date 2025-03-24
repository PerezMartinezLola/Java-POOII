package arraylistnotion;

public class BatallaNaval {
	public static void main(String[] args) {
		
		int [] [] array2D =  new int [4][3];
		int [] [] array2D_2 = {{0,1,2,3,4,5}, {6,7,8,9,0}};
		
		int indice = 1;
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				array2D [i] [j] = indice++;
				System.out.printf("%d ", array2D [i] [j]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < array2D_2.length; i++) {
			for (int j = 0; j < array2D_2[i].length; j++) {
				System.out.printf("%d ", array2D_2 [i][j]);
			}
			System.out.println();
		}
	}
}
