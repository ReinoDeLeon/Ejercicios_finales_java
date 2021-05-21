package instituto;

public class Estudiante extends Persona {
	//Atributos
	
	private String[] asignaturasMatriculadas;
	
	//Constructores
	public Estudiante(String nombre, int edad, char sexo) {
		super(nombre, edad, sexo);
		// TODO Auto-generated constructor stub
	}
	//Getters

	//Setters

	//Metodos
	@Override
	public boolean personaPuedeAsistir() {
		// TODO Auto-generated method stub
		return false;
	}
}
