package servicio;

import java.util.Date;

public abstract class RegistroServicio {

	private String tipoServicio;
	private int dniCliente;
	private int numEspecialista;
	private Date horaInicio;
	private Date horaFinal;
	private String domicilio;
	private double importeTotal;

	public RegistroServicio(String tipoServicio, int dniCliente, int numEspecialista, Date horaInicio,
			String domicilio) {
		this.tipoServicio = tipoServicio;
		this.dniCliente = dniCliente;
		this.numEspecialista = numEspecialista;
		this.horaInicio = horaInicio;
		this.domicilio = domicilio;
	}

	public String consultarTipoServicio() {
		return tipoServicio;
	}

	public int consultarDniCliente() {
		return dniCliente;
	}

	public int consultarNumEspecialista() {
		return numEspecialista;
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
