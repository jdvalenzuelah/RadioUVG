/**
 * 
 */

/**
 * @author David Valenzuela, Fernando Hengstenberg
 *
 */
public interface RadioI {
    public String frecAdelante();
    public String frecAtras();
    public boolean prender();
    public boolean apagar();
    public String cambioFrecuencia();
    public void guardarFrec(float frec, int pos);
    public String mostrarEstacion();
}
