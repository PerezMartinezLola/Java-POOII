package examenprofesionesherencia;

public class Main {
	
public static void main(String[] args) {
	Profesion [] profesionales = {
			new Doctor("Pedro", (short) 1999, "ginecología"),
			new Doctor("Juan", (short) 1970, "ginecología"),
			new Doctor("Maria", (short) 1980, "ginecología"),
			new Ingeniero("Juan", (short) 1990, "obras y puentes"),
			new Ingeniero("Pepa", (short) 1990, "puentes y Obras"),
			new Ingeniero("Juana", (short) 1990, "electronica"),
			new Profesor("nombre1", (short) 1991, "informatica"),
			new Profesor("nombre2", (short) 1991, "matematicas"),
			new Profesor("nombre3", (short) 1991, "ingles"),
			
	};
	
	for (Profesion profesional : profesionales) {
		profesional.trabajar();
		System.out.printf("Calcular edad:%d %n",profesional.calcularEdad());
		if(profesional instanceof Doctor) {
			((Doctor)profesional).recetarMedicamento("paracetamol");
			
		}else if(profesional instanceof Ingeniero) {
			((Ingeniero)profesional).calcularCostoProyecto(100, 100.43);
			
		}else if(profesional instanceof Profesor) {
			((Profesor) profesional).calificarExamenes(10);
		}else {
			System.out.println("Esto no es un profesional conocido");
		}
	}
}
}
