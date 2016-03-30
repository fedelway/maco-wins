package ventas;

public class Articulo {	
	static double tasaCotizacion = 0.3;
	
	private int precioBase;
	private boolean importado;
	
	public Articulo(int precio){
		this.setPrecio(precio);
	}
	
	public Articulo(int precio, boolean importado){
		this.setPrecio(precio);
		this.setImportado(importado);
	}
	
	public Articulo Pantalon(){
		return new Articulo(250);
	}
	
	public Articulo Saco(){
		return new Articulo(300);
	}
	
	public Articulo Camisa(){
		return new Articulo(200);
	}
	
	public void setPrecio(int precio){
		this.precioBase = precio;
	}

	public void setImportado(boolean importado) {

		this.importado = importado;
	}
	
	public boolean esImportado(){
		return importado;
	}
	
	public int getPrecio(){
		return precioBase;
	}
	
	public double getTasa(){
		return tasaCotizacion;
	}
}