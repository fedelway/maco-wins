package ventas;
import java.time.*;;

public class Venta{
	private Articulo articulo;
	private int cantidad;
	private double precioFinal;
	private LocalDateTime fecha;

	public void precioFinal(Negocio negocio){
		/*
		 * Obtiene el precio final de un articulo de acuerdo al negocio y a si es o no importado
		 */
		if (articulo.esImportado()){
			precioFinal = ( negocio.getValorFijo() + articulo.getPrecio() ) * (1 + Articulo.getTasa()) * cantidad;
		}
		else {
		
		precioFinal = (negocio.getValorFijo() + articulo.getPrecio() ) * cantidad;
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
	
	/* getters */
	public LocalDateTime getFecha(){
		return fecha;
	}
	
	public double getPrecioFinal(){
		return precioFinal;
	}
}
