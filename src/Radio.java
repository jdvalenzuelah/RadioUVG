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
	private int[] estacionesGuardadasAm;
	private float[] estacionesGuardadasFm;
	
	/**
	 * 
	 */
	public Radio() {
		this.frecueciaActual = "am";
		this.estacionActual = "530";
		this.power = false;
		this.estacionesGuardadasAm = new int[12];
		this.estacionesGuardadasFm = new float[12];
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
			if(Float.parseFloat(this.estacionActual) < 107.9) {
				this.estacionActual = Float.toString(Float.parseFloat(this.mostrarEstacion()) + (float) 0.2);
			}else {
				this.estacionActual = Float.toString((float) 87.9);
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
			if(Float.parseFloat(this.estacionActual) > 87.8) {
				this.estacionActual = Float.toString(Float.parseFloat(this.mostrarEstacion()) - (float) 0.2);
			}else {
				this.estacionActual = Float.toString((float) 107.9);
			}
			break;
		}
		return this.estacionActual;
	}

	@Override
	public boolean prender() {
		this.setPower(true);
		return true;
	}

	@Override
	public boolean apagar() {
		this.setPower(false);
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
			this.estacionesGuardadasAm[pos] = frec;
		}
	}

	@Override
	public void guardarFrecFm(float frec, int pos) {
		if((double) frec <= 107.9 && (double) frec >= 87.9 &&  pos >= 0 && pos <= 12) {
			this.estacionesGuardadasFm[pos] = frec;
		}
		
	}

	@Override
	public String mostrarEstacion() {
		
		return this.estacionActual;
	}

	/**
	 * @return the power
	 */
	public boolean isPower() {
		return power;
	}

	/**
	 * @param power the power to set
	 */
	public void setPower(boolean power) {
		this.power = power;
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

}
