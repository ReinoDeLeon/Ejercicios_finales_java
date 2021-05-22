package instituto;

public class Estudiante extends Persona {
	//Atributos
	
	private String[] asignaturasMatriculadas;
	
	//Constructores
	public Estudiante(String nombre, int edad, char sexo, String[] asignaturasMatriculadas) {
		super(nombre, edad, sexo);
		if (Asignatura.asignaturaDisponible(asignaturasMatriculadas)) {
			this.asignaturasMatriculadas = asignaturasMatriculadas;
		}
	}
	
	//Getters
	public synchronized String[] getAsignaturasMatriculadas() {
		return asignaturasMatriculadas;
	}

	//Setters
	public synchronized void setAsignaturasMatriculadas(String[] asignaturasMatriculadas) {
		if (Asignatura.asignaturaDisponible(asignaturasMatriculadas)) {
			this.asignaturasMatriculadas = asignaturasMatriculadas;
		}
		else {
			throw new RuntimeException("Una o varias asignaturas no están dadas de alta en el centro");
		}
	}
	
	//Metodos
	@Override
	public boolean personaPuedeAsistir() {
		if (Math.random()*100 <= 25) {
			return false;
		}
		else {
			return true;
		}
	}

}
