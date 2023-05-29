package servicio;

import java.util.Date;

import persona.Cliente;
import persona.Especialista;

public class ServicioElectricista extends RegistroServicio {

	private int cantHoras;
	private double precioHoras;

	public ServicioElectricista(String tipoServicio, Cliente cliente, Especialista especialista, Date horaInicio,
			String domicilio, int cantHoras) {
		super(tipoServicio, cliente, especialista, horaInicio, domicilio);
		this.cantHoras = cantHoras;
	}

	public int consultarCantHoras() {
		return cantHoras;
	}

	public double consultarPrecioHoras() {
		return precioHoras;
	}

}
