package ventas;

//Se mantiene esta clase para manejar casos base, como la camisa.
public class Articulo {	
	static double tasaCotizacion = (0.3);
	
	protected int precioBase;
	protected boolean importado = false;
	protected Marca marca;
	
	static public Articulo Camisa(){
		return new Articulo(200);
	}
	
	public Articulo(int precio){
		this.setPrecio(precio);
	}
	
	public Articulo(){}
	
	public Articulo(int precio, boolean importado){
		this.setPrecio(precio);
		this.setImportado(importado);
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
	
	//Retorna double porque en algunas subclases retorna double
	public double getPrecio(){
		return precioBase;
	}
	
	public static double getTasa(){
		return tasaCotizacion;
	}
	
	public Marca getMarca(){
		return marca;
	}
}