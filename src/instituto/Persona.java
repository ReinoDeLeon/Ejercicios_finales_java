package instituto;

public abstract class Persona {
	//Atributos
	private String nombre;
	private int edad;
	private char sexo;
	
	//Constructores
	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		if (sexo == 'M') {
			this.sexo = sexo;
		}
		else {
			this.sexo = 'F';
		}
	}


	//Getters
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public char getSexo() {
		return sexo;
	}

	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		if (sexo == 'M') {
			this.sexo = sexo;
		}
		else {
			this.sexo = 'F';
		}
	}
	
	//Metodos
	public abstract boolean personaPuedeAsistir();	
	
	
}
