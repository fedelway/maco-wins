package ventas;

public class Sombrero extends Articulo {
		
	private double metrosexualidad;
	
	public Sombrero(double coef){
		metrosexualidad = coef;
		precioBase = 150;
	}

	@Override
	public double getPrecio(){
		return precioBase * (1 + metrosexualidad);
	}

	
}
