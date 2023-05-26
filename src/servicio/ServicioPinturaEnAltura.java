package servicio;

import java.util.Date;

public class ServicioPinturaEnAltura extends ServicioPintura{
	private double alquilerAndamios;
	private double costoSeguro;
	private int altura;

	public ServicioPinturaEnAltura(String tipoServicio, int dniCliente, int numEspecialista, Date horaInicio,
			Date horaFinal, String domicilio, double importeTotal, int mtrsCuadrados, int altura) {
		super(tipoServicio, dniCliente, numEspecialista, horaInicio, domicilio, mtrsCuadrados);
		alquilerAndamios = 0;
		costoSeguro = 0;
		this.altura = altura;
	}
	
	public double consultarAlguilerAndamios() {
		return alquilerAndamios;
	}
	
	public double consultarCostoSeguro() {
		return costoSeguro;
	}
	
	public int consultarAltura() {
		return altura;
	}

}
