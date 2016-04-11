package ventas;
import java.time.*;;

public class Venta{
	private Articulo articulo;
	private int cantidad;
	private double precioFinal;
	private LocalDateTime fecha;
	private Negocio negocio;

	public void calcularPrecioFinal(){
		/*
		 * Obtiene el precio final de un articulo de acuerdo al negocio y a si es o no importado
		 */
		if (articulo.esImportado()){
			precioFinal = ( negocio.getValorFijo() + articulo.getPrecio() ) * (1 + Articulo.getTasa()) * cantidad * articulo.getMarca().getCoeficiente()
			+ articulo.getMarca().politicaDeMarca(articulo);
		}
		else {
		
		precioFinal = (negocio.getValorFijo() + articulo.getPrecio() ) * cantidad * articulo.getMarca().getCoeficiente() 
			+ articulo.getMarca().politicaDeMarca(articulo);
		}
	}
	
	public boolean mismoDia(LocalDateTime dia){
		return ( fecha.getYear() == dia.getYear() && fecha.getDayOfYear() == dia.getDayOfYear());
	}
	
	/* setters */
	public void setFecha(LocalDateTime f){
		fecha = f;
	}
	
	public void setCantidad(int cant){
		cantidad = cant;
	}
	
	public void setArticulo (Articulo art){
		articulo = art;
	}
	
	public void setNegocio(Negocio neg){
		negocio = neg;
	}
	
	/* getters */
	public LocalDateTime getFecha(){
		return fecha;
	}
	
	public double getPrecioFinal(){
		return precioFinal;
	}
}
