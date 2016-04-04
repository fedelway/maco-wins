package tests;

import java.time.LocalDateTime;

import ventas.*;
// import junit tests. Tengo errores con el maven. 
//jvbjldbvjsdvbdjsvbsj
public class Test1 {
	
	private Negocio negocio = new Negocio();
	private Articulo saco = Articulo.Saco();
	private Articulo camisa = Articulo.Camisa();
	private Articulo pantalon = Articulo.Pantalon();
	
	@Before
	public void setup(){
		negocio.setValorFijo(200);
		camisa.setImportado(true);
	}
	
	@Test
	public void calculoVentas(){
		negocio.vender(camisa, 2);
		negocio.vender(pantalon, 1);
		negocio.vender(saco, 1);
		
		Assert.assertEquals(negocio.gananciaDelDia(LocalDateTime.now()) , 1990.0d , 0);
	}
	
}
