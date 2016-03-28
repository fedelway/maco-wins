package ventas;
import java.util.*;

public class Negocio {
	private int valorFijo;
	private Collection<Venta> ventas;
	
	public double precioFinal(Articulo articulo){
		
		if (articulo.esImportado()){
			return ( this.valorFijo + articulo.getPrecio() ) * (articulo.getTasa() + 1);
		}
		
		return this.valorFijo + articulo.getPrecio();
	}
	
	public void vender(Articulo articulo, int cant){
		Venta venta = new Venta();
		venta.setArticulo(articulo);
		venta.setCant(cant);
		venta.setFecha()
		
		
		ventas.add(venta);
	}
	
}
