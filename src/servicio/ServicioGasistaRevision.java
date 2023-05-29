package servicio;

import java.util.Date;

import persona.Cliente;
import persona.Especialista;

public class ServicioGasistaRevision extends ServicioGasista {

	private double costoRevision;

	public ServicioGasistaRevision(String tipoServicio, Cliente cliente, Especialista especialista, Date horaInicio,
			String domicilio, int cantArtefactos) {
		super(tipoServicio, cliente, especialista, horaInicio, horaInicio, domicilio, cantArtefactos, cantArtefactos);
		costoRevision = 0;
	}

	public double consultarCostoRevision() {
		return costoRevision;
	}
}
