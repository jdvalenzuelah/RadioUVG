/**
 * 
 */

/**
 * @author daval
 *
 */
public interface InterfazRadio {
	/**
	 * 
	 * @return
	 */
	public String frecAdelante();
	
	/**
	 * 
	 * @return
	 */
	public String frecAtras();
	
	/**
	 * 
	 * @return
	 */
	public boolean prender();
	
	/**
	 * 
	 * @return
	 */
	public boolean apagar();
	
	/**
	 * 
	 * @return
	 */
	public String cambioFrecuencia();
	
	/**
	 * 
	 * @param frec
	 * @param pos
	 */
	public void guardarFrecAm(int frec, int pos);
	
	/**
	 * 
	 * @param frec
	 * @param pos
	 */
	public void guardarFrecFm(float frec, int pos);
	
	/**
	 * 
	 * @return
	 */
	public String mostrarEstacion(); 
}
