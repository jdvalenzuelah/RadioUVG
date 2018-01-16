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
	
	/**
	 * 
	 */
	public Radio() {
		this.frecueciaActual = "am";
		this.estacionActual = "530";
		this.power = false;
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
			if(Float.parseFloat(this.estacionActual) > 87.9) {
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardarFrecAm(int frec, int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void guardarFrecFm(float frec, int pos) {
		// TODO Auto-generated method stub
		
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
