package persona;

/**
 * @author Iván Antón
 *
 */
public class Persona {

	//Atributos
	private String nombre 		= "";
	private int edad;
	private String DNI;
	private final char SEXO;
	private double peso;
	private double altura;
	private final char HOMBRE 	= 'H';
	private final char MUJER  	= 'M';
	private final int PESO_INFERIOR_AL_IDEAL = -1;
	private final int PESO_IDEAL			 = 0;
	private final int SOBREPESO				 = 1;

	//Constructores
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		if (nombre != null) {
			this.nombre = nombre;
		}
		this.edad = edad;
		this.DNI = generaDNI();
		this.SEXO = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}

	public Persona(String nombre, int edad, char sexo) {
		if (nombre != null) {
			this.nombre = nombre;
		}
		this.edad = edad;
		this.SEXO = comprobarSexo(sexo);
		this.DNI = generaDNI();
	}

	public Persona() {
		this.SEXO = HOMBRE;
		this.DNI = generaDNI();
	}

	//Getters

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getDNI() {
		return DNI;
	}

	public char getSexo() {
		return SEXO;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	//Setters

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	//Metodos

	public int calcularImc() {
		if (peso/(Math.pow(altura, 2)) < 20) {
			return PESO_INFERIOR_AL_IDEAL;
		}
		else if (peso/(Math.pow(altura, 2)) >= 20 && (peso/(Math.pow(altura, 2)) < 26)) {
			return PESO_IDEAL;
		}
		else {
			return SOBREPESO;
		}		
	}
	
	public void pesoIdeal() {
		int imc = calcularImc();
		if (imc == -1) {
			System.out.println("La persona tiene un peso inferior a su peso ideal");
		}
		else if (imc == 0) {
			System.out.println("La persona está en su peso ideal");
		}
		else if (peso == 0.0) {
			System.out.println("El usuario no tiene peso registrado");
		}
		else if (imc == 1) {
			System.out.println("La persona tiene sobrepeso");
		}
	}

	private char comprobarSexo(char sexo) {
		if (sexo == 'M' || sexo == 'm') {
			return MUJER;
		}
		else {
			return HOMBRE;
		}
	}

	public boolean esMayorDeEdad() {
		return edad > 17;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + SEXO + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	private String generaDNI() {
		String DNI = "";
		while (DNI.length() < 8) {
			DNI	+= (int) Math.round(Math.random()*9);
		}
		DNI 	+= letraDNI(Integer.parseInt(DNI));
		return DNI;
	}
	
	private char letraDNI(int numeroDNI) {
		char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		return letra[(numeroDNI%23)];
	}
}