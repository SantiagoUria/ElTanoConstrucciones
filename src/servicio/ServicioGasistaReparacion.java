package servicio;

import java.util.Date;

import persona.Cliente;
import persona.Especialista;

public class ServicioGasistaReparacion extends ServicioGasista {

	private double costoReparacion;

	public ServicioGasistaReparacion(String tipoServicio, Cliente cliente, Especialista especialista, Date horaInicio,
			String domicilio, int cantArtefactos) {
		super(tipoServicio, cliente, especialista, horaInicio, horaInicio, domicilio, cantArtefactos, cantArtefactos);
		costoReparacion = 0;

	}

	public double consultarCostoReparacion() {
		return costoReparacion;
	}

}
