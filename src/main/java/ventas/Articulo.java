package ventas;

//Se mantiene esta clase para manejar casos base, como la camisa.
public abstract class Articulo {	
	public double tasaCotizacion = (0.3);
	
	protected int precioBase;
	protected boolean importado = false;
	protected Marca marca;
			
	public Articulo(){}
	
	
	public void setImportado(boolean importado) {

		this.importado = importado;
	}
	public boolean getImportado(){
		return importado;
	}
	
	public boolean esImportado(){
		return importado;
	}
	
	//Retorna double porque en algunas subclases retorna double
	public double getPrecio(){
		return precioBase;
	}
	
	public double getTasa(){
		return tasaCotizacion;
	}
	
	public Marca getMarca(){
		return marca;
	}
	
	public void setMarca(Marca marca){
		this.marca = marca;
	}
}