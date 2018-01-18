import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PruebaRadio {

	public RadioI radio;
	
	@Before
	public void before() {
		radio = new Radio();
		// Estado inicial AM 530
		radio.prender();
		
	}
	
	@Test
	public  void  pruebaFrecuencia() {
		// Estado inicial AM 530
		
		// Cambio a FM
		String frecuencia = radio.cambioFrecuencia();
		assertEquals("FM", frecuencia);
		
		// Cambia a AM
		frecuencia = radio.cambioFrecuencia();
		assertEquals("AM", frecuencia);
	}
	
}
