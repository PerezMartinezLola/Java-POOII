package vehiculonavidadjavi;

public class Test {
	public static void main(String[] args) {
		Coche c1 = new Coche(160, 4, 1_300, "SE2520AX");
		Motocicleta m1 = new Motocicleta(160, 2, 230, "SE2520AX");
		Bicicleta b1 = new Bicicleta(40, 2, 20);
		
		c1.abrirPuertas();
		System.out.println(c1);
		c1.cerrarPuertas();
		c1.acelerar();
		c1.frenar();
		c1.arrancarMotor();
		c1.detenerMotor();
		m1.arrancarMotor();
		System.out.println(m1);
		System.out.println(b1);
		
	}
}
