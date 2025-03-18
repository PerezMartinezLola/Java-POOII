package vehiculoexamenpooii;

public class Bicicleta extends Vehiculo {
	private boolean enCaballito;

	public Bicicleta(int velocidad, int velocidadMaxima, String color, int elementosHistorico, boolean enCaballito) {
		super(velocidad, velocidadMaxima, color, elementosHistorico);
		this.enCaballito = enCaballito;
	}
	
	
}
	














	
























/*private boolean enReposo;
	private int marchas;

	// constructores
	public Bicicleta(int velocidadMaxima, int velocidad, String color, int elementosHistorico, int marchas) {
		super(velocidadMaxima, velocidad, color, elementosHistorico);
		enReposo = true;
		int marchaMaxima = 21;
		this.marchas = marchas < 0 ? 0 : marchas > marchaMaxima ? marchaMaxima : marchas;
	}
	
	// metodos
	public boolean subirMarchas(int subidaMarcha) {
		int marchaMaxima = 21;
		if (enReposo) {
			return false;
		} else {
			if (marchas + subidaMarcha < marchaMaxima) {
				marchas += subidaMarcha;
			} else {
				marchas = marchaMaxima;
			}
		}
		return true;
	}

	public boolean bajarMarcha(int bajadaMarcha) {
		int marchaMinima = 0;
		if (enReposo) {
			return false;
		} else {
			if (marchas - bajadaMarcha < marchaMinima) {
				marchas -= bajadaMarcha;
			} else {
				marchas = marchaMinima;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return "Bicicleta" + super.toString() + ", marchas = " + marchas + "]";
	}*/
	
	


