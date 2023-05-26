package servicio;

import java.util.Date;

public class ServicioGasistaRevision extends ServicioGasista {
	
	private double costoRevision;

	public ServicioGasistaRevision(String tipoServicio, int dniCliente, int numEspecialista, Date horaInicio,
			Date horaFinal, String domicilio, double importeTotal, int cantArtefactos) {
		super(tipoServicio, dniCliente, numEspecialista, horaInicio, horaFinal, domicilio, importeTotal, cantArtefactos);
		costoRevision = 0;
	}

	public double consultarCostoRevision() {
		return costoRevision;
	}
}
