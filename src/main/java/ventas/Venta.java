package ventas;
import java.time.*;;

public class Venta{
	private Articulo articulo;
	private int cantidad;
	private double precioFinal;
	private LocalDateTime fecha;
	
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
	
	public void setPrecioFinal(double precio){
		precioFinal = precio;
	}
	
	/* getters */
	public LocalDateTime getFecha(){
		return fecha;
	}
	
	public double getPrecioFinal(){
		return precioFinal;
	}
}
