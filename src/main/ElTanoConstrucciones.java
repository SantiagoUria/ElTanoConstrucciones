package main;

import java.util.Date;
import java.util.HashMap;

import persona.Cliente;
import persona.Especialista;
import servicio.RegistroServicio;
import servicio.ServicioPintura;

public class ElTanoConstrucciones {
	private HashMap<Integer, Especialista> registroEspecialistas;
	private HashMap<Integer, Cliente> registroClientes;
	private HashMap<Integer, RegistroServicio> registroServicios;

	ElTanoConstrucciones() {
		registroEspecialistas = new HashMap<Integer, Especialista>();
		registroClientes = new HashMap<Integer, Cliente>();
		registroServicios = new HashMap<Integer, RegistroServicio>();
	}

	public void agregarEspecialista(String nombre, int telefono, int numEspecialista, String especialidad) {
		Especialista nuevoEspecialista = new Especialista(nombre, telefono, numEspecialista, especialidad);
		registroEspecialistas.put(nuevoEspecialista.consultarNumEspecialista(), nuevoEspecialista);
	}

	public void agregarCliente(String nombre, int telefono, int dni, String domicilio) {
		Cliente nuevoCliente = new Cliente(nombre, telefono, dni, domicilio);
		registroClientes.put(nuevoCliente.consultarDNI(), nuevoCliente);

	}

	public void solicitarServicioPintura(int dniCliente, int numEspecialista, Date horaInicio, String domicilio,
			int mtrsCuadrados) {

		ServicioPintura servicio = new ServicioPintura("Pintura", dniCliente, numEspecialista, horaInicio, domicilio,
				mtrsCuadrados);
		registroServicios.put(servicio.consultarDniCliente(), servicio);
	}

	public void solicitarServicioPinturaEnAltura() {

	}

	public void solicitarServicioElectricista() {

	}

	public void solicitarServicioGasistaRevision() {

	}

	public void solicitarServicioGasistaReparacion() {

	}

}
