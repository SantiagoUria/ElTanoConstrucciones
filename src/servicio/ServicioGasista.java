package servicio;

import java.util.Date;

public class ServicioGasista extends RegistroServicio {

	private int cantArtefactos;

	public ServicioGasista(String tipoServicio, int dniCliente, int numEspecialista, Date horaInicio, Date horaFinal,
			String domicilio, double importeTotal, int cantArtefactos) {
		super(tipoServicio, dniCliente, numEspecialista, horaInicio, domicilio);
		this.cantArtefactos = cantArtefactos;
	}

	public int consultarCantArtefactos() {
		return cantArtefactos;
	}

}
