package ventas;

public class Armani implements Marca {

	private double coeficiente = .65d;
	
	@Override
	public double politicaDeMarca(Venta venta) {
		return venta.getPrecioFinal() * 0.65d;
	}
	
	@Override
	public double getCoeficiente(){
		return coeficiente;
	}
}
