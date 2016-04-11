package ventas;

public class Sarkany implements Marca {

	private double coeficiente;
	
	public Sarkany(double coef){
		coeficiente = coef;
	}
	
	@Override
	public double politicaDeMarca(Articulo art) {
		
		if(art.getPrecio() > 500){
			return 0.35d;
		}else
			return 0.1d;
	}

	@Override
	public double getCoeficiente() {
		return coeficiente;
	}

}
