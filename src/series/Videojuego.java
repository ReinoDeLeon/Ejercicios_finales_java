package series;

public class Videojuego implements Alquilable {
	//Atributos
	private  String titulo		= "";
	private int horasEstimadas	= 10;
	private boolean alquilado	= false;
	private String genero		= "";
	private String compania		= "";

	//Constructores
	public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
	}

	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}

	public Videojuego() {
	}

	//Getters
	public String getCompania() {
		return compania;
	}
	public String getTitulo() {
		return titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}
	
	//Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	//Metodos
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", alquilado=" + alquilado
				+ ", genero=" + genero + ", compania=" + compania + "]";
	}

	@Override
	public void alquilar() {
		this.alquilado = true;		
	}

	@Override
	public void devolver() {
		this.alquilado = false;		
	}

	@Override
	public boolean isAlquilado() {
		return this.alquilado;
	}
	
}
