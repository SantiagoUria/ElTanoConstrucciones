package servicio;

import java.util.Date;

import persona.Cliente;
import persona.Especialista;

public class ServicioPinturaEnAltura extends ServicioPintura{
	private double alquilerAndamios;
	private double costoSeguro;
	private int altura;

	public ServicioPinturaEnAltura(String tipoServicio, Cliente cliente, Especialista especialista, Date horaInicio, String domicilio, int mtrsCuadrados, int altura) {
		super(tipoServicio, cliente, especialista, horaInicio, domicilio, mtrsCuadrados);
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
