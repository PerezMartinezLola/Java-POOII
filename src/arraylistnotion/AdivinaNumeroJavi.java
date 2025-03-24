package arraylistnotion;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class AdivinaNumeroJavi {
	private int numeroMaximo;
	private int numeroIntentos = 5;
	private ArrayList <String> historico = new ArrayList <>();

	
	public void jugar() {
		int numeroOculto = new Random().nextInt(1, numeroMaximo);
		int intento = 0;
		historico.clear();
		System.out.printf("%nEmpezamos un nuevo juego");
		System.out.printf("%n========================");
		System.out.printf("%d", numeroOculto);
		
		//para meter los datos por la consola
		Scanner scanner = new Scanner(System.in);
		
		
			//intentos++
		while(++intento <= numeroIntentos) {
		System.out.printf("[%d de %d] Introduce un número del 1 al %d: ", intento, numeroIntentos, numeroMaximo);
		int numeroPropuesto = scanner.nextInt();
		
		
		if(numeroPropuesto == numeroOculto ) {
			System.out.printf("Acertaste!!%n");
			historico.add("😍" + numeroPropuesto);
			System.out.println(historico);
			break;
		}else if(numeroPropuesto > numeroOculto) {
			System.out.printf("%d es mayor que el número oculto%n", numeroPropuesto);
			historico.add("🙄" + numeroPropuesto);
		}else {
			System.out.printf("%d es menor que el número oculto%n", numeroPropuesto);
			historico.add("🙄" + numeroPropuesto);
		}
		//genero el historico
		System.out.println(historico);
		}
		
		System.out.printf("%nGracias por jugar%n");
	}
	
	
	
	public AdivinaNumeroJavi(int numeroMaximo, int numeroIntentos) {
		this.numeroMaximo = numeroMaximo;
		this.numeroIntentos = numeroIntentos;
		
	}

	public static void main(String[] args) {
		AdivinaNumeroJavi j1 = new AdivinaNumeroJavi(10,3);
		j1.jugar();
		AdivinaNumeroJavi j2 = new AdivinaNumeroJavi(5,2);
		j2.jugar();
		
		
		
	}
		
}

/*public class AdivinaNumeroJavi {
	
	
	public static void main(String[] args) {
		
		int numeroMaximo = 10;
		int intento = 0;
		int numeroIntentos = 3;
		int numeroOculto = new Random().nextInt(1, numeroMaximo);
		ArrayList <String> historico = new ArrayList <>();
		
		
		System.out.println(numeroOculto);
		//para meter los datos por la consola
		Scanner scanner = new Scanner(System.in);
		
			
		System.out.printf("Introduce un número del 1 al %d: ", numeroMaximo);
		int numeroPropuesto = scanner.nextInt();
		
		
		//genero el historico
		System.out.println(historico);
		while(++intento < numeroIntentos) {	
			System.out.printf("[%d de %d]Introduce un número del 1 al %d: ",
							  intento, numeroIntentos, numeroMaximo);
			// no se puede poner switch porque en los casos no se puede poner mayor o menor
			if(numeroPropuesto == numeroOculto) {
				System.out.printf("Acertaste!!%n");
				System.out.println(historico);
				break;
				
				historico.add(numeroPropuesto + "😍");
			}else if(numeroPropuesto > numeroOculto) {
				System.out.printf("%d es mayor que el número oculto%n", numeroPropuesto);
				historico.add(numeroPropuesto + "🙄");
			}else {
				System.out.printf("%d es menor que el número oculto%n", numeroPropuesto);
				historico.add(numeroPropuesto + "🙄");
			}
			
			
		}
		System.out.println("Gracias por participar");
	}
}*/
