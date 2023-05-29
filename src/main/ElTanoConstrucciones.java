package main;

import java.util.Date;
import java.util.HashMap;

import persona.Cliente;
import persona.Especialista;
import servicio.RegistroServicio;
import servicio.ServicioElectricista;
import servicio.ServicioGasistaReparacion;
import servicio.ServicioGasistaRevision;
import servicio.ServicioPintura;
import servicio.ServicioPinturaEnAltura;

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
	public void agregarEspecialista(Especialista especialista) {
		registroEspecialistas.put(especialista.consultarNumEspecialista(), especialista);
	}

	public void agregarCliente(String nombre, int telefono, int dni, String domicilio) {
		Cliente nuevoCliente = new Cliente(nombre, telefono, dni, domicilio);
		registroClientes.put(nuevoCliente.consultarDNI(), nuevoCliente);
	}
	
	public void agregarCliente(Cliente cliente) {
		registroClientes.put(cliente.consultarDNI(), cliente);
	}

	public void solicitarServicioPintura(Cliente cliente, Especialista especialista, Date horaInicio, String domicilio,
			int mtrsCuadrados) {

		ServicioPintura servicio = new ServicioPintura("Pintura", cliente, especialista, horaInicio, domicilio,
				mtrsCuadrados);
		registroServicios.put(cliente.consultarDNI(), servicio);
	}

	public void solicitarServicioPinturaEnAltura(Cliente cliente, Especialista especialista, Date horaInicio,
			String domicilio, int mtrsCuadrados, int altura) {
		ServicioPinturaEnAltura servicio = new ServicioPinturaEnAltura("PinturaEnAltura", cliente, especialista,
				horaInicio, domicilio, mtrsCuadrados, altura);
		registroServicios.put(cliente.consultarDNI(), servicio);
	}

	public void solicitarServicioElectricista(String tipoServicio, Cliente cliente, Especialista especialista,
			Date horaInicio, String domicilio, double importeTotal, int cantHoras) {
		ServicioElectricista servicio = new ServicioElectricista("Electricidad", cliente, especialista, horaInicio,
				domicilio, cantHoras);
		registroServicios.put(cliente.consultarDNI(), servicio);
	}

	public void solicitarServicioGasistaRevision(String tipoServicio, Cliente cliente, Especialista especialista,
			Date horaInicio, String domicilio, int cantArtefactos) {
		ServicioGasistaRevision servicio = new ServicioGasistaRevision("GasistaRevision", cliente, especialista,
				horaInicio, domicilio, cantArtefactos);
		registroServicios.put(cliente.consultarDNI(), servicio);
	}

	public void solicitarServicioGasistaReparacion(String tipoServicio, Cliente cliente, Especialista especialista,
			Date horaInicio, String domicilio, int cantArtefactos) {
		ServicioGasistaReparacion servicio = new ServicioGasistaReparacion("GasistaRevision", cliente, especialista,
				horaInicio, domicilio, cantArtefactos);
		registroServicios.put(cliente.consultarDNI(), servicio);

	}

}
