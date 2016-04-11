package tests;

import org.junit.*;

import java.time.LocalDateTime;

import ventas.*;
// import junit tests. Tengo errores con el maven. 
//jvbjldbvjsdvbdjsvbsj
//prueba igna

public class TestNegocio {
	
	private Negocio negocio = new Negocio();
	public Saco saco = new Saco(5);
	public Camisa camisa = new Camisa();
	public Pantalon pantalon = new Pantalon(100);
	public Zapato zapato = new Zapato(40);
	public Sombrero sombrero = new Sombrero(0.7);
	public Armani armani = new Armani();
	public Sarkany sarkany = new Sarkany();
	
		
	@Before
	public void setup() {
		negocio.setValorFijo(200);
		camisa.setImportado(true);
		camisa.setMarca(armani);
		saco.setMarca(armani);
		pantalon.setMarca(armani);
		zapato.setMarca(sarkany);
		sombrero.setMarca(sarkany);
		
	}
	@Test
	public void calculoVentas(){
		negocio.vender(camisa, 2);
		negocio.vender(pantalon, 1);
		negocio.vender(saco, 1);
		negocio.vender(zapato, 2);
		negocio.vender(sombrero, 1);
				
		Assert.assertEquals(6191.5d , negocio.gananciaDelDia(LocalDateTime.now()) , 0.0);
	}
	
}
