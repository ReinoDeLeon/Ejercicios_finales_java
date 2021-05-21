package instituto;

public class Profesor extends Persona {
	//Atributos
	private String[] asignaturasDisponibles = {"Matematicas", "Fisica", "Fisica y quimica", "Filosofia", "Lengua castellana", "Ingles", "Historia", "Tecnologias de la informacion y la comunicacion"};
	private String asignaturaImpartida;
	
	//Constructores
	public Profesor(String nombre, int edad, char sexo, String asignatura) {
		super(nombre, edad, sexo);
		for (String s : asignaturasDisponibles) {
			if (asignatura.equalsIgnoreCase(s)) {
				this.asignaturaImpartida = s;
			}
		}
	}

	//Getters
	public String getAsignaturaImpartida() {
		return asignaturaImpartida;
	}
	public String[] getAsignaturasDisponibles() {
		return asignaturasDisponibles;
	}

	//Setters
	public void setAsignaturaImpartida(String asignaturaImpartida) {
		this.asignaturaImpartida = asignaturaImpartida;
	}
	
	//Metodos
	@Override
	public boolean personaPuedeAsistir() {
		if (Math.random()*100 <= 20) {
			return false;
		}
		else {
			return true;
		}
	}

	
}
