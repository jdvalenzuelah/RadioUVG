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
	private String[] estacionesGuardadas;
	
	/**
	 * 
	 */
	public Radio() {
		this.frecueciaActual = "am";
		this.estacionActual = "530";
		this.power = false;
		this.estacionesGuardadas = new String[12];
	}
	
	/**
	 * @param power
	 * @param frecueciaActual
	 * @param estacionActual
	 * @param estacionesGuardadas
	 */
	public Radio(boolean power, String frecueciaActual, String estacionActual, String[] estacionesGuardadas) {
		super();
		this.power = power;
		this.frecueciaActual = frecueciaActual;
		this.estacionActual = estacionActual;
		this.estacionesGuardadas = estacionesGuardadas;
	}


	/* (non-Javadoc)
	 * @see RadioI#frecAdelante()
	 */
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

	/* (non-Javadoc)
	 * @see RadioI#frecAtras()
	 */
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

	/* (non-Javadoc)
	 * @see RadioI#prender()
	 */
	@Override
	public boolean prender() {
		this.power = true;
		return power;
	}

	/* (non-Javadoc)
	 * @see RadioI#apagar()
	 */
	@Override
	public boolean apagar() {
		this.power = false;
		return power;
	}

	/* (non-Javadoc)
	 * @see RadioI#cambioFrecuencia()
	 */
	@Override
	public String cambioFrecuencia() {
		if(this.frecueciaActual.toLowerCase().equals("am")){
			this.frecueciaActual = "fm";
			this.estacionActual = "87.9";
		}else if(this.frecueciaActual.toLowerCase().equals("fm")) {
			this.frecueciaActual = "am";
			this.estacionActual = "530";
		}else {
			this.frecueciaActual = "fm";
			this.estacionActual = "87.9";
		}
		return this.frecueciaActual;
	}

	/* (non-Javadoc)
	 * @see RadioI#guardarFrec(float, int)
	 */
	@Override
	public void guardarFrec(float frec, int pos) {
		// Ajustamos a las posiciones del vector
		frec = frec -1; 
		if(pos>=0 && pos <= 11) {	
			this.estacionesGuardadas[pos] = Float.toString(frec);
		}
		
	}

	/* (non-Javadoc)
	 * @see RadioI#mostrarEstacion()
	 */
	@Override
	public String mostrarEstacion() {
		return this.estacionActual;
	}


}
