package servicio;

import java.util.Date;

import persona.Cliente;
import persona.Especialista;

public abstract class RegistroServicio {

	private String tipoServicio;
	private Cliente cliente;
	private Especialista especialista;
	private Date horaInicio;
	private Date horaFinal;
	private String domicilio;
	private double importeTotal;

	public RegistroServicio(String tipoServicio, Cliente cliente, Especialista especialista, Date horaInicio,
			String domicilio) {
		this.tipoServicio = tipoServicio;
		this.cliente = cliente;
		this.especialista = especialista;
		this.horaInicio = horaInicio;
		this.domicilio = domicilio;
	}

	public String consultarTipoServicio() {
		return tipoServicio;
	}

	public Cliente consultarCliente() {
		return cliente;
	}

	public Especialista consultarEspecialista() {
		return especialista;
	}

	public Date consultarHoraInicio() {
		return horaInicio;
	}

	public Date consultarHoraFinal() {
		return horaFinal;
	}

	public String consultarDomicilio() {
		return domicilio;
	}

	public double consultarImporteTotal() {
		return importeTotal;
	}

}
