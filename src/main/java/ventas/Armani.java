package ventas;

public class Armani implements Marca {

	private double coeficiente = .65d;
	
	@Override
	public double politicaDeMarca(Articulo art) {
		return 0.65d;
	}
	
	@Override
	public double getCoeficiente(){
		return coeficiente;
	}
}
