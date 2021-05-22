package instituto;

public class Profesor extends Persona {
	//Atributos
	
	private String asignaturaImpartida;
	
	//Constructores
	public Profesor(String nombre, int edad, char sexo, String asignatura) {
		super(nombre, edad, sexo);
		if (Asignatura.asignaturaDisponible(asignatura)) {
			this.asignaturaImpartida = asignatura;
		}
		else {
			throw new RuntimeException("La asignatura no es impartida en este centro");
		}
		
	}

	//Getters
	public String getAsignaturaImpartida() {
		return asignaturaImpartida;
	}

	//Setters
	public void setAsignaturaImpartida(String asignaturaImpartida) {
		if (Asignatura.asignaturaDisponible(asignaturaImpartida)) {
			this.asignaturaImpartida = asignaturaImpartida;
		}
		else {
			throw new RuntimeException("La asignatura no es impartida en este centro");
		}
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
