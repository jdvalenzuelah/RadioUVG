/**
 * 
 */

/**
 * @author David Valenzuela 171001
 * @author Fernando Hengstenberd 17699
 *
 */
public class Radio implements RadioI {

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

	/**
	 * @return the estacionActual
	 */
	public String getEstacionActual() {
		return estacionActual;
	}

	/**
	 * @param estacionActual the estacionActual to set
	 */
	public void setEstacionActual(String estacionActual) {
		this.estacionActual = estacionActual;
	}

	/**
	 * @return the estacionesGuardadas
	 */
	public String[][] getEstacionesGuardadas() {
		return estacionesGuardadas;
	}

	/**
	 * @param estacionesGuardadas the estacionesGuardadas to set
	 */
	public void setEstacionesGuardadas(String[][] estacionesGuardadas) {
		this.estacionesGuardadas = estacionesGuardadas;
	}

	private boolean power;
	private String frecueciaActual;
	private String estacionActual;
	private String[][] estacionesGuardadas;
	
	/**
	 * Constructor del obejeto
	 */
	public Radio() {
		this.frecueciaActual = "am";
		this.estacionActual = "530";
		this.power = false;
		this.estacionesGuardadas = new String[12][2];
		
	}
	
	/**
	 * Constructor utilizando parametros
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
				this.estacionActual = Double.toString((Double.parseDouble(this.estacionActual) + 0.2));
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
				this.estacionActual = Double.toString((Double.parseDouble(this.estacionActual) -0.2));
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
		
		for(int x = 0; x < 12; x++) {
			this.estacionesGuardadas[x][0] = "530";
			this.estacionesGuardadas[x][1] = "am";
		}
		
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
	 * @see RadioI#mostrarEstacion()
	 */
	@Override
	public String mostrarEstacion() {
		return this.estacionActual;
	}

	/* (non-Javadoc)
	 * @see RadioI#mostrarEstacionBoton(int)
	 */
	@Override
	public String obtenerEstacion(int pos) {
		pos = pos -1;
		if(pos>=0 && pos <= 11) {
			this.estacionActual = this.estacionesGuardadas[pos][0];
			this.frecueciaActual = this.estacionesGuardadas[pos][1];
		}
		return this.estacionActual;
	}

	/* (non-Javadoc)
	 * @see RadioI#estaPrendido()
	 */
	@Override
	public boolean estaPrendido() {
		return power;
	}

	/* (non-Javadoc)
	 * @see RadioI#obtenerEstado()
	 */
	@Override
	public String obtenerEstado() {
		return this.frecueciaActual;
	}

	/* (non-Javadoc)
	 * @see RadioI#guardarEstacionActual(int)
	 */
	@Override
	public void guardarEstacionActual(int pos) {
		// Ajustamos a las posiciones del vector
				pos = pos -1;
				Float est = Float.parseFloat(this.estacionActual);
				if(pos>=0 && pos <= 11) {	
					if(est < 530) {
						this.estacionesGuardadas[pos][0] = this.estacionActual;
						this.estacionesGuardadas[pos][1] = "fm";
					}else {
						this.estacionesGuardadas[pos][0] = this.estacionActual;
						this.estacionesGuardadas[pos][1] = "am";
					}
				}
		
	}


}
