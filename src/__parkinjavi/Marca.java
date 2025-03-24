package __parkinjavi;

import java.util.Random;

public enum Marca {
	VW, SE, AU;
	// de este modo creamos un statico random
	private static Random random = new Random();
	
	public static Marca aleatorio () {
		return Marca.values() [random.nextInt(0, Marca.values().length)];
	}
}
