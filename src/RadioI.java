/**
 * 
 */

/**
 * @author David Valenzuela, Fernando Hengstenberg
 *
 */
public interface RadioI {
	
	/**
	 * Metodo cambia a la siguiente estacion de la radio, en caso de estar
	 * en la ultima estacion de la frecuencia, volvera al principio.
	 * @return Estacion siguiente.
	 */
    public String frecAdelante();
    
    /**
     * Metodo cambia a la estacion anterior de la radio, en caso de estar
     * en la ultima estacion de la frecuencia, volvera al principio.
     * @return Estacion anterior.
     */
    public String frecAtras();
    
    /*
     * Metodo prende la radio.
     * @return Estado de la radio (true = encendido, false = apagado).
     */
    public boolean prender();
    
    /**
     * Metodo apaga la radio
     * @return Estado de la radio (true = encendido, false = apagado).
     */
    public boolean apagar();
    
    /**
     * Cambia la frecuencia de la radio de AM a FM, o viceversa.
     * @return Frecuencia en la cual se encuentra la radio (AM o FM).
     */
    public String cambioFrecuencia();
    
    /**
     * Guarda una estacion de radio en uno de los doce botonoes que tiene la radio
     * enumerados de 0 a11.
     * @param frec Estacion de radio que se guardara
     * @param pos Numero del boton donde se guarda el boton
     */
    public void guardarFrec(float frec, int pos);
    
    /**
     * Metodo muestra la estacion actual en la cual la radio se encuentra sintonizada
     * @return Estacion actual.
     */
    public String mostrarEstacion();
}









