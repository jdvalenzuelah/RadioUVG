import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PruebaRadio {

	public RadioI radio = new Radio();
	
	@Before
	public void before() {
		// Estado inicial AM 530
		radio.prender();
		
	}
	
	@Test
	public  void  pruebaCambioFrecuenciaAFM() {
		// Cambio a FM
		String frecuencia = radio.cambioFrecuencia();
		assertEquals("fm", frecuencia);
	}
	
	@Test
	public void pruebaCambioFrecuenciaAAM() {
		// Cambia a AM
		String frecuencia = radio.cambioFrecuencia();
		assertEquals("am", frecuencia);
	}
	
	
	
}
