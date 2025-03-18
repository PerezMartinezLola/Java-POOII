package vehiculoexamenpooii;

import java.util.Iterator;

public abstract class Vehiculo {
	private int velocidad;
	private int velocidadMaxima;
	private String color;
	private String[] historicoColores;

	// Constructores
	public Vehiculo(int velocidad, int velocidadMaxima, String color, int elementosHistorico) {
		this.velocidad = velocidad < 0 ? 0 : velocidad;
		this.velocidadMaxima = velocidadMaxima < 0 ? 0 : velocidadMaxima;
		this.color = validarColor(color) ? color.toUpperCase() : "NEGRO";
		historicoColores = new String[elementosHistorico <= 0 ? 1 : elementosHistorico];
		historicoColores[historicoColores.length - 1] = this.color.toUpperCase();
	}

	// métodos publicos estáticos
	public static boolean validarColor(String color) {
		if (!("amarillo".equals(color) || "verde".equals(color) || "rojo".equals(color) || "blanco".equals(color))) {
			return false;
		}
		return true;
	}

	public static boolean validarMatricula(String matricula) {
		if (matricula == null || matricula.isEmpty()) {
			return false;
		}

		if (matricula.length() < 4 || matricula.length() > 8) {
			return false;
		}

		for (int i = 0; i <= 3; i++) {
			if (!(matricula.charAt(i) >= 'a' && matricula.charAt(i) <= 'z'
					|| matricula.charAt(i) >= 'A' && matricula.charAt(i) <= 'Z')) {
				return false;
			}
		}

		for (int i = 4; i < matricula.length(); i++) {
			if (!(matricula.charAt(i) >= '0' && matricula.charAt(i) <= '9')) {
				return false;
			}
		}
		return true;
	}

	// metodo actualizar historico
	public void actualizarHistorico(String nuevoColor) {
		if (nuevoColor != null && !nuevoColor.isEmpty() && !nuevoColor.equals(color)) {
			for (int i = 1; i < historicoColores.length; i++) {
				historicoColores[i - 1] = historicoColores[i];
			}
			historicoColores[historicoColores.length - 1] = nuevoColor.toUpperCase();
		}
	}
	
	public void mostrarHistorico () {
		for (String colores : historicoColores) {
			if(colores != null) {
				System.out.printf("%s ", colores);
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
	}

}
