package ventas;
import java.time.*;
import java.util.*;

public class Negocio {
	private int valorFijo;
	private List<Venta> ventas;
	
	public double precioFinal(Articulo articulo){
		/*
		 * Obtiene el precio final de un articulo de acuerdo al negocio y a si es o no importado
		 */
		if (articulo.esImportado()){
			return ( this.valorFijo + articulo.getPrecio() ) * (articulo.getTasa() + 1);
		}
		
		return this.valorFijo + articulo.getPrecio();
	}
	
	public void vender(Articulo articulo, int cant){
		/*
		 * crea el objeto venta, le asigna sus atributos y lo añade a la lista de ventas
		 */
		Venta venta = new Venta();
		venta.setArticulo(articulo);
		venta.setCantidad(cant);
		venta.setFecha(LocalDateTime.now());
		venta.setPrecioFinal(this.precioFinal(articulo) );
		ventas.add(venta);
	}
	
	public double gananciaDelDia(LocalDateTime dia){
	
		return this.ventas.stream()
				.filter(v -> v.mismoDia(dia) )
				.mapToDouble(v -> v.getPrecioFinal())
				.sum();
	}
}
