package ventas;

public class Saco extends Articulo {
	
	private int botones;
	
	public Saco(int cant){
		botones = cant;
		precioBase = 300;
	}

	@Override
	public double getPrecio(){
		return precioBase + 10 * botones;
		}

}
