package ventas;

public class Armani implements Marca {

	private double coeficiente;
	
	
	@Override
	public double politicaDeMarca(Articulo art) {
		coeficiente = 0.65d;
		return 0.65d;
	}
	
	@Override
	public double getCoeficiente(){
		return coeficiente;
	}
}
