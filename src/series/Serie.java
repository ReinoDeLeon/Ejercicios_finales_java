package series;

public class Serie implements Alquilable {
	//Atributos
	private String titulo				= "";
	private int numeroDeTemporadas 	= 3;
	private boolean alquilado 		= false;
	private String genero				= "";
	private String creador			= "";
	//Constructores
	public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroDeTemporadas = Math.abs(numeroDeTemporadas);
		this.genero = genero;
		this.creador = creador;
	}
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie() {

	}
	public String getTitulo() {
		return titulo;
	}
	
	//Getters
	public int getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}
	public String getGenero() {
		return genero;
	}
	public String getCreador() {
		return creador;
	}
	
	//Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setNumeroDeTemporadas(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
	//Metodos
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroDeTemporadas=" + numeroDeTemporadas + ", alquilado=" + alquilado
				+ ", genero=" + genero + ", creador=" + creador + "]";
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
