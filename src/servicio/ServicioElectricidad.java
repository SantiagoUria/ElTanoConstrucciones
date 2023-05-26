package servicio;

import java.util.Date;

public class ServicioElectricidad extends RegistroServicio {

	private int cantHoras;
	private double precioHoras;

	public ServicioElectricidad(String tipoServicio, int dniCliente, int numEspecialista, Date horaInicio,
			Date horaFinal, String domicilio, double importeTotal, int cantHoras) {
		super(tipoServicio, dniCliente, numEspecialista, horaInicio, domicilio);
		this.cantHoras = cantHoras;
	}
	
	public int consultarCantHoras() {
		return cantHoras;
	}
	
	public double consultarPrecioHoras() {
		return precioHoras;
	}

}
