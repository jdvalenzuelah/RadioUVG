/**
 * 
 */

/**
 * @author daval
 *
 */
public class Radio implements InterfazRadio {

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
		this.frecGuardadas = new String[12];
	}
	
	@Override
	public String frecAdelante() {
		switch(this.getFrecueciaActual().toLowerCase()) {
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
		switch(this.getFrecueciaActual().toLowerCase()) {
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
		this.power = true;
		return true;
	}

	@Override
	public boolean apagar() {
		this.power = false;
		return true;
	}

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

	@Override
	public void guardarFrecAm(int frec, int pos) {
		if(frec <= 1610 && frec >= 530 && frec % 10 == 0 && pos >= 0 && pos <= 12) {
			this.estacionesGuardadas[pos] = Integer.toString(frec);
		}
	}

	@Override
	public void guardarFrecFm(float frec, int pos) {
		if((double) frec <= 107.9 && (double) frec >= 87.9 &&  pos >= 0 && pos <= 12) {
			this.estacionesGuardadas[pos] = String.format("%.1f", frec);
		}
		
	}

	@Override
	public String mostrarEstacion() {
		return this.estacionActual;
	}

	
	/**
	 * @return the frecueciaActual
	 */
	public String getFrecueciaActual() {
		return frecueciaActual;
	}

	/**
	 * @param frecueciaActual the frecueciaActual to set
	 */
	public void setFrecueciaActual(String frecueciaActual) {
		this.frecueciaActual = frecueciaActual;
	}

	@Override
	public boolean estaPrendido() {
		return power;
	}

	@Override
	public String obtenerEstacion(int pos) {
		
	}


}
