package dispositivomigle;


	import java.util.Arrays;

	public class Dispositivo {
		
		// propiedades
		private boolean encendido;
		private int volumen;
		private int volumenNuevo;
		private String version = "V2025";
		private String[] historicoDeActualizaciones;
		
		// constructor
		public Dispositivo() {}
		
		public Dispositivo(boolean encendido, int volumen, int capacidadHistorial, String version) {
			this.encendido = encendido;
			this.volumen = volumen >= 0 && volumen <= 100 ? volumen : 0;
			historicoDeActualizaciones = new String [capacidadHistorial];
			this.version = version;
		}
		
		@Override
		public String toString() {
			return "Dispositivo [encendido=" + encendido + ", volumen=" + volumen + ", volumenNuevo=" + volumenNuevo
					+ ", version=" + version + ", historicoDeActualizaciones=" + Arrays.toString(historicoDeActualizaciones)
					+ "]";
		}
		
		
		// 0 -> actualizarVersion
		public void actualizarVersion (String nuevaVersion) {
			if (nuevaVersion != null && !nuevaVersion.isEmpty()) {
				version = nuevaVersion;
				for (int i = 1; i < historicoDeActualizaciones.length; i++) {
					historicoDeActualizaciones[i - 1] = historicoDeActualizaciones[i];
				}
				historicoDeActualizaciones[historicoDeActualizaciones.length - 1] = version;
			}
		}
		
		// mostrarHistorico
		public void mostrarHistoricoDeVersiones() {
			for (String version : historicoDeActualizaciones) {
				if (version != null) {
	                System.out.println("- " + version);
	            }
			}
		}
		
		
		// metodos
		
		// 1 -> encender
		public boolean encender() {
			if (!encendido) {
				encendido = true;
				return true;
			} else {
				return false;
			}
		}
		

		// 2 -> apagar
		public boolean apagar() {
			if (encendido) {
				encendido = false;
				return true;
			} else {
				return false;
			}
		}
		
		// 3 -> subirVolumen
		public void subirVolumen() {
			if (volumen + 10 <= 100) {
				volumenNuevo = volumen + 10;
				System.out.println("El volumen ha subido: " + volumen + " → " + volumenNuevo);
			} else {
				volumenNuevo = volumen;
				System.out.println("El volumen ya está al máximo.");
			}
		}
		
		// 4 -> bajarVolumen
		public void bajarVolumen() {
			if (volumen - 10 > 0) {
				volumenNuevo = volumen - 10;
				System.out.println("El volumen ha bajado: " + volumen + " → " + volumenNuevo);
			} else {
				volumenNuevo = volumen;
				System.out.println("El volumen no se puede bajar más");
			}
		}
		
		
		// metodo main
		public static void main(String[] args) {
			Dispositivo d1 = new Dispositivo();
			System.out.println(d1);
			Dispositivo d2 = new Dispositivo(false, 30, 5, "v");
			System.out.println(d2);
			Dispositivo d3 = new Dispositivo(true, 100, 3, "v");
			System.out.println(d3);
			
			System.out.println();
			System.out.println("Probamos método encender()");
			System.out.println(d2.encender());
			System.out.println(d3.encender());
			d2.encender(); d3.encender();
			Dispositivo[] dispositivos = {d1, d2, d3};
			for (Dispositivo d : dispositivos) {
				System.out.println(d.encender());
			}
			
			System.out.println();
			System.out.println("Probamos método apagar()");
			System.out.println(d2.apagar());
			System.out.println(d3.apagar());
			d2.apagar(); d3.apagar();
			for (Dispositivo d : dispositivos) {
				System.out.println(d.apagar());
			}
			
			System.out.println();
			System.out.println("Probamos método subirVolumen()");
			d2.subirVolumen(); d3.subirVolumen();
			for (Dispositivo d : dispositivos) {
				d.subirVolumen();
			}
			
			System.out.println();
			System.out.println("Probamos método bajarVolumen()");
			d2.bajarVolumen(); d3.bajarVolumen();
			for (Dispositivo d : dispositivos) {
				d.bajarVolumen();
			}
			
			d2.actualizarVersion("v2");
			d2.actualizarVersion("v3");
			d2.actualizarVersion("v4");
			d2.actualizarVersion("v5");
			
			d2.mostrarHistoricoDeVersiones();
			
			
			
			
			
			
			
		}




		
		

	}


