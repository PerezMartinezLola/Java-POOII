package __practicaexamen;

public class Monitor {
	private String color;
	private int horasUso;
	private int maximoHorasUso;
	private double brillo;
	private double [] historicoBrillo;
	private boolean apagado;
	
	//Constructores
	public Monitor () {
		this("NEGRO", 0, 1_000, 80);
	}
	
	public Monitor(String color, int horasUso, int maximoHorasUso, double brillo) {
		//colores validos
		String colorValido = "Blanco".equalsIgnoreCase(color) || "Gris".equalsIgnoreCase(color) ? color.toUpperCase() : "NEGRO";
		this.color = colorValido;
		
		this.horasUso = horasUso < 0 ? 0 : horasUso;
		this.maximoHorasUso = maximoHorasUso;
		historicoBrillo = new double [5];
		this.brillo = brillo < 0 ? 0 : brillo > 100 ? 100 : brillo;
		apagado = true;
	}
	
	
	public Monitor(Monitor m, double brillo) {
		this(m.color, m.horasUso, m.maximoHorasUso, brillo);
	}
	
	
	//Imprimir historico
	public void verHistorico() {
		for (double brillos : historicoBrillo) {
			if(brillos !=0) {
				System.out.printf("%.2f%% %n", brillos);
			}
			
		}
	}
	//Metodo toString
	public String toString() {
		return String.format("MONITOR [color = %s, horasUso = %d, maximoHorasUso = %d, brillo = %.2f%%]",
				color, horasUso, maximoHorasUso, brillo);
	}
	
	//metodo para incrementar el brillo lo que queramos si esta encendido
	public double aumentarBrillo (double aumentoBrillo) {
		double brilloMaximo = 100;
		boolean brilloValido = brillo > 0 || brillo < 100;
		if(!apagado && brilloValido) {
			if(brillo + aumentoBrillo <= brilloMaximo) {
				brillo += aumentoBrillo;
		   }else {
			brillo = brilloMaximo;
		   }
	    }
		//historico de brillos, todos se desplazan a la izquierda y el último valor para al último espacio del array
				for (int i = 1; i < historicoBrillo.length; i++) {
					 historicoBrillo[i-1] = historicoBrillo [i];
				}
				historicoBrillo [historicoBrillo.length -1] = brillo;
		
			return brillo;	
	}
	
	
	public boolean encender () {
		if(apagado) {
			apagado = false;
			return true;		
		}
		return false;
	}
	
	public boolean disminuirBrillo20 () {
		if(!apagado && horasUso > 0.8* maximoHorasUso) {
			brillo *= 0.2;
			return true;
		}
		return false;
	}
	
	public boolean requiereMantenimiento () {
		return horasUso >=  maximoHorasUso * 0.8;
	}
	
	public boolean apagar() {
		if(apagado) {
			return false;
		}
		apagado = true;
		return true;	
	}
	
	public boolean reiniciarUso () {
		if(apagado && horasUso == maximoHorasUso) {
			horasUso = 0;
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * Java comprueba los boolean de esta forma
	 * 
	 * if (variable) está comprobando si variable = true. Es lo mismo que hacer if variable = true. 
	 * 
	 * */
	/*public boolean test = true;
	
	public double prueba (int aumentoBrillo) {
		if(!test && brillo + aumentoBrillo <= 100) {
			brillo += aumentoBrillo;
		}
		return brillo;
		
		
	}
	
	*
	*
	* Tu declaras una variable boolean
	* 
	
	*
	*
	*/
	
}
