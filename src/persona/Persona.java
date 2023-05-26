package persona;

public abstract class Persona {
	protected String nombre;
	protected int telefono;
	
	public  int consultarTelefono() {
		return telefono;
	}
	
	public  String consultarNombre() {
		return nombre;
	}
	
}
