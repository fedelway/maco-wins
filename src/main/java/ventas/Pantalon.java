package ventas;

public class Pantalon extends Articulo {
	
	private int cm2;
	
	public Pantalon(int centimetros){
		cm2 = centimetros;
		precioBase = 250;
	}
	
	@Override
	public double getPrecio(){
		return precioBase + cm2;
	}
}
