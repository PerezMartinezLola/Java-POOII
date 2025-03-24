package enumerados;

public class Run {
	public static void main(String[] args) {
		// 3.a.Dado un mes, indica su nombre en inglés, en español y su número de mes.

		String mesIntroducido = "julio";

		for (Mes mes : Mes.values()) {
			if (mes.equals(mesIntroducido)) {
				System.out.println(mes.show());
			}

		}

		// 3.b. mostrar meses en funcion del numero que le pones
		int numero = 8;

		for (Mes mes : Mes.values()) {
			if (numero == mes.getNumeroMes()) {
				System.out.println(mes.show());
			}
		}
		
		

	}

}
