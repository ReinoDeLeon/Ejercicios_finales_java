package instituto;

public class Aula {
	//Atributos
	private static int id = 0;
	private int numeroMaximoDeEstudiantes;
	private String asignaturaAsignada;
	private int idNumerico = 0;

	//Constructores
	public Aula(int numeroMaximoDeEstudiantes, String asignaturaAsignada) {
		this.idNumerico = ++id;
		this.numeroMaximoDeEstudiantes = numeroMaximoDeEstudiantes;
		if (Asignatura.asignaturaDisponible(asignaturaAsignada)) {
			this.asignaturaAsignada = asignaturaAsignada;
		}
		else {
			throw new RuntimeException("La asignatura no es impartida en este centro");
		}
	}

	//Getters
	public int getIdNumerico() {
		return idNumerico;
	}

	public int getNumeroMaximoDeEstudiantes() {
		return numeroMaximoDeEstudiantes;
	}

	public String getAsignaturaAsignada() {
		return asignaturaAsignada;
	}
	
	//Setters
	public void setIdNumerico(int idNumerico) {
		this.idNumerico = idNumerico;
	}

	public void setNumeroMaximoDeEstudiantes(int numeroMaximoDeEstudiantes) {
		this.numeroMaximoDeEstudiantes = numeroMaximoDeEstudiantes;
	}

	public void setAsignaturaAsignada(String asignaturaAsignada) {
		if (Asignatura.asignaturaDisponible(asignaturaAsignada)) {
			this.asignaturaAsignada = asignaturaAsignada;
		}
		else {
			throw new RuntimeException("La asignatura no es impartida en este centro");
		}
	}
	
	//Metodos
	public boolean sePuedeDarClase(Estudiante[] e, Profesor p) {
		int contadorNovillos = 0;
		if (p.personaPuedeAsistir()) {
			for (Estudiante estudiante : e) {
				if (estudiante.isNovillos()) {
					contadorNovillos++;
				}
			}
			if (contadorNovillos <= (e.length/2)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	
	
}
