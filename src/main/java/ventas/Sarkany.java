package ventas;

public class Sarkany implements Marca {

	private double coeficiente;
	
	@Override
	public double politicaDeMarca(Venta venta) {
		
		if(venta.getPrecioFinal() > 500){
			return venta.getPrecioFinal() * 0.35d;
		}else
			return venta.getPrecioFinal() * 0.1d;
	}

	@Override
	public double getCoeficiente() {
		return coeficiente;
	}

}
