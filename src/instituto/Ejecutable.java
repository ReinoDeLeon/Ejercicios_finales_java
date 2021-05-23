package instituto;

public class Ejecutable {

	public static void main(String[] args) {
		Estudiante[] estudiantesColegio = new Estudiante[116];
		Profesor[] profesoresColegio = new Profesor[7];
		profesoresColegio[0] = new Profesor("Ramon", 40, 'M', "Fisica");
		profesoresColegio[1] = new Profesor("Luisa", 41, '0', "Matematicas");
		profesoresColegio[2] = new Profesor("Ramona", 35, 'f', "Fisica y quimica") ;
		profesoresColegio[3] = new Profesor("Pedro", 38, 'M', "Lengua castellana") ;
		profesoresColegio[4] = new Profesor("Penélope", 37, 'F', "Ingles") ;
		profesoresColegio[5] = new Profesor("Raúl", 28, 'M', "Tecnologias de la informacion y la comunicacion") ;
		profesoresColegio[6] = new Profesor("Pepe", 50, 'M', "Historia") ;
		for (int i = 0; i < 116; i++) {
			estudiantesColegio[i] = Utilidades.generarEstudiante();
		}
		Aula aulaDeMatematicas 		= new Aula(30, "Matematicas");
		Aula aulaDeFisica 			= new Aula(28, "Fisica");
		Aula aulaDeLengua 			= new Aula(35, "Lengua castellana");
		Aula aulaDeFisicaYQuimica 	= new Aula(35, "Fisica y quimica");
		Aula aulaDeIngles 			= new Aula(25, "Ingles");
		Aula aulaDeTIC 				= new Aula(19, "Tecnologias de la informacion y la comunicacion");
		Aula aulaDeHistoria			= new Aula(70, "Historia");
		
		//Dar clases
		String[] diasDeLaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
		for (int i = 0; i < 5; i++) {
			System.out.println("---------------------------------------------");
			System.out.println("El " + diasDeLaSemana[i] + " se da clase de:");
				System.out.println("Matematicas: " + aulaDeMatematicas.sePuedeDarClase(Utilidades.generarAlumnosParaClase(aulaDeMatematicas.getNumeroMaximoDeEstudiantes(), estudiantesColegio), profesoresColegio[0]));
				System.out.println("Fisica: " + aulaDeFisica.sePuedeDarClase(Utilidades.generarAlumnosParaClase(aulaDeFisica.getNumeroMaximoDeEstudiantes(), estudiantesColegio), profesoresColegio[1]));
				System.out.println("Lengua: " + aulaDeLengua.sePuedeDarClase(Utilidades.generarAlumnosParaClase(aulaDeLengua.getNumeroMaximoDeEstudiantes(), estudiantesColegio), profesoresColegio[0]));
				System.out.println("Fisica y quimica: " + aulaDeFisicaYQuimica.sePuedeDarClase(Utilidades.generarAlumnosParaClase(aulaDeFisicaYQuimica.getNumeroMaximoDeEstudiantes(), estudiantesColegio), profesoresColegio[0]));
				System.out.println("Ingles: " + aulaDeIngles.sePuedeDarClase(Utilidades.generarAlumnosParaClase(aulaDeIngles.getNumeroMaximoDeEstudiantes(), estudiantesColegio), profesoresColegio[0]));
				System.out.println("TIC: " + aulaDeTIC.sePuedeDarClase(Utilidades.generarAlumnosParaClase(aulaDeTIC.getNumeroMaximoDeEstudiantes(), estudiantesColegio), profesoresColegio[0]));
				System.out.println("Historia: " + aulaDeHistoria.sePuedeDarClase(Utilidades.generarAlumnosParaClase(aulaDeHistoria.getNumeroMaximoDeEstudiantes(), estudiantesColegio), profesoresColegio[0]));
				System.out.println("---------------------------------------------");
		}
		
	}
	//Atributos

	//Constructores

	//Getters

	//Setters

	//Metodos
}
