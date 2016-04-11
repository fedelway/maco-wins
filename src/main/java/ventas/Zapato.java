package ventas;

public class Zapato extends Articulo {
	
	private int talle;
	
	public Zapato(int num){
		talle = num;
		precioBase = 400;
	}
	
	@Override
	public double getPrecio(){
		return precioBase + talle * 5;
	}
}
