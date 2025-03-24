package __practicaexamen;

public class Test {
	public static void main(String[] args) {
		Monitor [] monitores = new Monitor [5];
		
		monitores [0] = new Monitor();
		monitores [1] = new Monitor("gris", 1_000, 20_000, 60);
		monitores [2] = new Monitor(monitores [1], 80);
		monitores [3] = new Monitor("blanco", 500, 15_000, 70);
		monitores [4] = new Monitor("amarillo", 2_000, 30_000, 50);
		
		
		System.out.printf("Monitores%n");
		System.out.printf("========%n");
		for (Monitor monitor : monitores) {
			System.out.println(monitor.toString());
		}
		
		System.out.println();
		System.out.printf("Historico de colores%n");
		System.out.printf("====================%n");
		for (Monitor monitor : monitores) {
			monitor.verHistorico();
		}
		
		
		System.out.println();
		System.out.printf("%nEncender %n");
		System.out.printf("===========%n");
		for (Monitor monitor : monitores) {
			System.out.println(monitor.encender());
		}
		

		System.out.println();
		System.out.printf("%nAumentar Brillo 30%% %n");
		System.out.printf("=====================%n");
		for (Monitor monitor : monitores) {
			System.out.println(monitor.aumentarBrillo(30));
		}
		System.out.println();
		System.out.printf("%nApagar %n");
		System.out.printf("========%n");
		for (Monitor monitor : monitores) {
			System.out.println(monitor.apagar());
		}
		
		System.out.println();
		System.out.printf("%nReset %n");
		System.out.printf("========%n");
		for (Monitor monitor : monitores) {
			System.out.println(monitor.reiniciarUso());
		}
	}
	
	
	
}