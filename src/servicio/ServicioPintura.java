package servicio;

import java.util.Date;

public class ServicioPintura extends RegistroServicio {

	private int mtrsCuadrados;
	private int costoMtrCuadrado;

	public ServicioPintura(String tipoServicio, int dniCliente, int numEspecialista, Date horaInicio,
			String domicilio, int mtrsCuadrados) {
		super(tipoServicio, dniCliente, numEspecialista, horaInicio, domicilio);
		this.mtrsCuadrados = mtrsCuadrados;
	}

	public int consultarMtrsCuadrados() {
		return mtrsCuadrados;
	}

	public int consultarCostoMtrCuadrado() {
		return costoMtrCuadrado;
	}
}
