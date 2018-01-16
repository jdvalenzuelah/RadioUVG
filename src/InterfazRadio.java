/**
 * 
 */

/**
 * @author daval
 *
 */
public interface InterfazRadio {

	public String frecAdelante();
	public String frecAtras();
	public boolean prender();
	public boolean apagar();
	public String cambioFrecuencia();
	public void guardarFrecAm(int frec, int pos);
	public void guardarFrecFm(float frec, int pos);
	public String mostrarEstacion(); 
}
