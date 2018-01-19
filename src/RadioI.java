/**
 * 
 */

/**
 * @author David Valenzuela 171001
 * @author Fernando Hengstenberd 17699
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
     * enumerados de 1 a 12.
     * @param frec Estacion de radio que se guardara
     * @param pos Numero del boton donde se guarda el boton
     */
    public void guardarFrec(float frec, int pos);
    
    /**
     * Metodo muestra la estacion actual en la cual la radio se encuentra sintonizada
     * @return Estacion actual.
     */
    public String mostrarEstacion();
    
    /**
     * Metodo para obtener una de las estaciones guardadas
     * @param pos Posicion del boton donde la estacion esta guardada
     * @return Estacion donde esta guardada
     */
    public String obtenerEstacion(int pos);
    
    /**
     * Metodo para ver el estado de la radio
     * @return true si esta encendido, false si esta apagado
     */
    public boolean estaPrendido();
    
    /**
     * Metodo para observar la frecuencia de la radio
     * @return AM o FM
     */
    public String obtenerEstado();

    /**
     * Guardar la estacion que esta escuchando actualmente
     * @param pos posicion a guardar
     */
	void guardarEstacionActual(int pos);
}









