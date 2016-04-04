package ventas;
import java.time.*;
import java.util.*;

public class Negocio {
	private int valorFijo;
	private List<Venta> ventas;
	
	public void vender(Articulo articulo, int cant){
		/*
		 * crea el objeto venta, le asigna sus atributos y lo añade a la lista de ventas
		 */
		Venta venta = new Venta();
		venta.setArticulo(articulo);
		venta.setCantidad(cant);
		venta.setFecha(LocalDateTime.now());
		venta.precioFinal(this);
		ventas.add(venta);
	}
	
	public double gananciaDelDia(LocalDateTime dia){
	
		return this.ventas.stream()
				.filter(v -> v.mismoDia(dia) )
				.mapToDouble(v -> v.getPrecioFinal())
				.sum();
	}

	public void setValorFijo(int valorFijo) {
		this.valorFijo = valorFijo;
	}
	
	public int getValorFijo(){
		return valorFijo;
	}
}
