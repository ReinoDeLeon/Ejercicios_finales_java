package libreria;

public class Ejecutable {

	public static void main(String[] args) {
		Libro libroPrimero = new Libro("123673", "El señor de los anillos", "Tolkien", 200);
		Libro libroSegundo = new Libro("392842", "Los miserables", "Elliot ness", 7);
		
		if (libroPrimero.getNumeroDePaginas()>libroSegundo.getNumeroDePaginas()) {
			System.out.println("El libro " + libroPrimero.getTitulo() + " tiene más páginas que el libro " + libroSegundo.getTitulo() + "\n" + libroPrimero.toString());
		}
		else {
			System.out.println("El libro " + libroSegundo.getTitulo() + " tiene más páginas que el libro " + libroPrimero.getTitulo() + "\n" + libroSegundo.toString());
			
		}
		
	}
	
}
