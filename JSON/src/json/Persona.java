package json;

public class Persona {
	
	String nombre;
	String apellidos;
	int edad;
	int carnet;
	
	public Persona() {
		this.nombre = " ";
		this.apellidos = " ";
		this.edad = 0;
		this.carnet = 0;
	}

	public void llenar(String nombre, String apellidos, int edad, int carnet) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.carnet = carnet;
	}
	
}
