package personas;
@SuppressWarnings("unused")
public class Persona {
	//Atributos
	
	private String nombre;
	private int edad;
	//Constructores
	public Persona(String nombre) {
		this.nombre = nombre;
		generarEdad();
	}
	
	//Getters
	public int getEdad() {
		return edad;
	}
	
	//Setters
	
	//Metodos
	public void generarEdad() {
		this.edad = (int) (Math.random()*51 + 20);
	}
}
