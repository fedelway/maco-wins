package ventas;

public class Armani implements Marca {

	private double coeficiente;
	
	public Armani(double coef){
		coeficiente = coef;
	}

	@Override
	public double politicaDeMarca(Articulo art) {
		return art.getPrecio() * 0.65d;
	}
	
	@Override
	public double getCoeficiente(){
		return coeficiente;
	}
}
