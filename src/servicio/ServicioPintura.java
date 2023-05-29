package servicio;

import java.util.Date;

import persona.Cliente;
import persona.Especialista;

public class ServicioPintura extends RegistroServicio {

	private int mtrsCuadrados;
	private int costoMtrCuadrado;

	public ServicioPintura(String tipoServicio, Cliente cliente, Especialista especialista, Date horaInicio,
			String domicilio, int mtrsCuadrados) {
		super(tipoServicio, cliente, especialista, horaInicio, domicilio);
		this.mtrsCuadrados = mtrsCuadrados;
	}

	public int consultarMtrsCuadrados() {
		return mtrsCuadrados;
	}

	public int consultarCostoMtrCuadrado() {
		return costoMtrCuadrado;
	}
}
