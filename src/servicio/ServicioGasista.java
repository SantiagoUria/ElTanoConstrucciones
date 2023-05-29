package servicio;

import java.util.Date;

import persona.Cliente;
import persona.Especialista;

public class ServicioGasista extends RegistroServicio {

	private int cantArtefactos;

	public ServicioGasista(String tipoServicio, Cliente cliente, Especialista especialista, Date horaInicio, Date horaFinal,
			String domicilio, double importeTotal, int cantArtefactos) {
		super(tipoServicio, cliente, especialista, horaInicio, domicilio);
		this.cantArtefactos = cantArtefactos;
	}

	public int consultarCantArtefactos() {
		return cantArtefactos;
	}

}
