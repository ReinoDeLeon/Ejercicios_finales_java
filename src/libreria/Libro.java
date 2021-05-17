package libreria;

public class Libro {
	
	//Atributos
	private String ISBN 		= "";
	private String titulo		= "";
	private String autor 		= "";
	private int numeroDePaginas;
	
	//Constructores
	public Libro(String ISBN, String titulo, String autor, int numeroDePaginas) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
	}
	public Libro() {

	}
	
	//Getters
	public String getISBN() {
		return ISBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	//Setters
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	
	
	//Metodos
	@Override
	public String toString() {
		return "El libro " + titulo + " con ISBN " + ISBN + " creado por el autor " + autor + " tiene " + numeroDePaginas +" páginas";
	}
	
}
