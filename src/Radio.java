/**
 * 
 */

/**
 * @author daval
 *
 */
public class Radio implements RadioI {

	private boolean power;
	private String frecueciaActual;
	private String estacionActual;
	private String[][] estacionesGuardadas;
	
	/**
	 * 
	 */
	public Radio() {
		this.frecueciaActual = "am";
		this.estacionActual = "530";
		this.power = false;
		this.estacionesGuardadas = new String[12][2];
	}
	
	/**
	 * @param power
	 * @param frecueciaActual
	 * @param estacionActual
	 * @param estacionesGuardadas
	 */
	public Radio(boolean power, String frecueciaActual, String estacionActual, String[][] estacionesGuardadas) {
		super();
		this.power = power;
		this.frecueciaActual = frecueciaActual;
		this.estacionActual = estacionActual;
		this.estacionesGuardadas = estacionesGuardadas;
	}

	@Override
	public String frecAdelante() {
		switch(this.frecueciaActual.toLowerCase()) {
		case "am":
			if(Integer.parseInt(this.estacionActual)  < 1610) {
				this.estacionActual=  Integer.toString((Integer.parseInt(this.mostrarEstacion()) + 10));
			}else {
				this.estacionActual = Integer.toString(530);
			}
			break;
		case "fm":
			if(Double.parseDouble(this.estacionActual) < 107.9) {
				this.estacionActual = String.format("%.1f", (Double.parseDouble(this.estacionActual) + 0.2));
			}else {
				this.estacionActual = Double.toString(87.9);
			}
			break;
		}
		return this.estacionActual;
	}

	@Override
	public String frecAtras() {
		switch(this.frecueciaActual.toLowerCase()) {
		case "am":
			if(Integer.parseInt(this.estacionActual)  > 530) {
				this.estacionActual=  Integer.toString((Integer.parseInt(this.mostrarEstacion()) - 10));
			}else {
				this.estacionActual = Integer.toString(1610);
			}
			break;
		case "fm":
			if(Double.parseDouble(this.estacionActual) > 87.9) {
				this.estacionActual = String.format("%.1f", (Double.parseDouble(this.estacionActual) -0.2));
			}else {
				this.estacionActual = Double.toString(107.9);
				
				
			}
			break;
		}
		return this.estacionActual;
	}

	@Override
	public boolean prender() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean apagar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String cambioFrecuencia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardarFrec(float frec, int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String mostrarEstacion() {
		// TODO Auto-generated method stub
		return null;
	}


}
