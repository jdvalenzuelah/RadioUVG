import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PruebaRadio {

	public RadioI radio = new Radio();
	
	/**
	 * Codigo a ejecutar antes de cada prueba
	 */
	@Before
	public void before() {
		// Estado inicial AM 530
		radio.prender();
		
	}
	
	/**
	 * Prueba cambiar una emisora a FM
	 */
	@Test
	public  void  pruebaCambioFrecuenciaAFM() {
		// Cambio a FM
		String frecuencia = radio.cambioFrecuencia();
		assertEquals("fm", frecuencia);
	}
	
	/**
	 * Prueba cambiar una emisora a AM
	 */
	@Test
	public void pruebaCambioFrecuenciaAAM() {
		// Cambia a AM
		String frecuencia = radio.cambioFrecuencia();
		frecuencia = radio.cambioFrecuencia();
		assertEquals("am", frecuencia);
	}
	
	@Test
	public void pruebaGuardarEstacion() {
		for(int i = 1; i < 13; i++) {
			radio.guardarEstacionActual((i));
		}
		
		for(int x = 1; x < 13; x++) {
			assertEquals("87.9",radio.obtenerEstacion(x));
			System.out.println(radio.obtenerEstacion(x));
		}
		
	}
	
	
}
