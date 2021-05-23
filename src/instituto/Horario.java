package instituto;


public class Horario {
	//Atributos
	String[][] horario = new String[5][1];
	//Constructores
	public Horario() {
		for (int i = 0; i < horario.length; i++) {
			horario[i] = Asignatura.getAsignaturasDisponibles();
		}
		
	}
	//Getters

	//Setters

	//Metodos
}
