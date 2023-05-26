package persona;

public  class Cliente extends Persona{
	private int dni;
	private String domicilio;
	
	public Cliente(String nombre, int telefono, int dni, String domicilio){
		super.nombre = nombre;
		super.telefono = telefono;
		this.dni = dni;
		this.domicilio = domicilio;
	};
	

	public int consultarDNI() {
		return dni;
	}
	
	public String consultarDomicilio() {
		return domicilio;
	}
}
