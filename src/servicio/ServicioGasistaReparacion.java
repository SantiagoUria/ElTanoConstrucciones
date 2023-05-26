package servicio;

import java.util.Date;

public class ServicioGasistaReparacion extends ServicioGasista {
	
	private double costoReparacion;

	public ServicioGasistaReparacion(String tipoServicio, int dniCliente, int numEspecialista, Date horaInicio,
			Date horaFinal, String domicilio, double importeTotal, int cantArtefactos) {
		super(tipoServicio, dniCliente, numEspecialista, horaInicio, horaFinal, domicilio, importeTotal, cantArtefactos);
		costoReparacion = 0;
		
	}
	
	public double consultarCostoReparacion() {
		return costoReparacion;
	}

}
