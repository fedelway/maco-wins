package tests;

import java.time.LocalDateTime;

import ventas.*;

public class Test2  {	

	public static void main(String[] args) {
		Negocio negocio = new Negocio();
		Articulo saco = Articulo.Saco();
		Articulo camisa = Articulo.Camisa();
		Articulo pantalon = Articulo.Pantalon();
		negocio.setValorFijo(200);
		camisa.setImportado(true);
		negocio.vender(camisa, 2);
		negocio.vender(pantalon, 1);
		negocio.vender(saco, 1);
		System.out.println(negocio.getVentas().stream().filter(v -> v.mismoDia(LocalDateTime.now())).mapToDouble(v -> v.getPrecioFinal()).sum()) ;
		System.out.println(Articulo.getTasa());
		System.out.println(camisa.esImportado());
	}
}
