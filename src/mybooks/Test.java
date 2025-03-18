package mybooks;

public class Test {

	public static void main(String[] args) {

		Libro lib0 = new Libro("Cien años de Soledad", "Gabriel García Márquez", 735, 3, false, 20.99);
		Libro lib1 = new Libro("El señor de los Anillos", "J. R. R. Tolkien", 429, 5, false, 22.99);
		Libro lib2 = new Libro("1984", "George Orwell", 122, 9, false, 40.99);
		Libro lib3 = new Libro("Un mundo feliz", "Aldous Huxley", 270, 1, false, 25.99);
		Libro lib4 = new Libro("Orgullo y prejuicio", "Jane Austen", 340, 2, true, 12.99);
		Libro lib5 = new Libro("Crimen y castigo", "Fiódor Dostoyevski", 259, 3, false, 60.99);
		Libro lib6 = new Libro("Lolita", "Vladimir Nabokov", 300, 5, false, 27.99);
		Libro lib7 = new Libro("Ulises", "James Joyce", 400, 4, false, 42.99);
		Libro lib8 = new Libro("Madame Bovary", "Gustave Flaubert", 723, 9, true, 9.99);
		Libro lib9 = new Libro("En busca del tiempo perdido", "Marcel Proust", 374, 2, true, 9.99);

		Libro[] libros = {lib0, lib1, lib2, lib3, lib4, lib5, lib6, lib7, lib8, lib9};

		for (Libro libro : libros) {
			libro.show();
		}

		Revista rev0 = new Revista("Muy interesante", 127, false, 24.99);
		Revista rev1 = new Revista("National Geographic", 150, false, 35.60);
		Revista rev2 = new Revista("CuerpoMente", 130, false, 19.99);
		Revista rev3 = new Revista("Mongolia", 90, false, 8.99);
		Revista rev4 = new Revista("Historia NG", 132, false, 31.99);

		// 14.c. Array libros y revistas
		Publicacion[] publicaciones = { lib0, lib1, lib2, lib3, lib4, lib5, lib6, lib7, lib8, lib9, rev0, rev1, rev2,
				rev3, rev4 };

		System.err.printf("%nArray Libros y Revistas%n");
		System.err.printf("-----------------------%n");
		for (Publicacion publicacion : publicaciones) {
			publicacion.show();
		}

		// 14.d.a. Todas las publicaciones del array publicaciones con título y ID
		System.err.printf("%nTodas las publicaciones con títulos e IDs%n");
		System.err.printf("------------------------------------------");
		for (Publicacion publicacion : publicaciones) {
			System.out.printf("%nID: %d. Titulo: %s", publicacion.getId(), publicacion.getTitulo());
		}
		// 14.d.b. Solo libros del array publicaciones con ID y título (usar instanceof
		// para discriminar).
		System.out.println();
		System.err.printf("%nTodos los libros e IDs%n");
		System.err.printf("-----------------------");
		for (Publicacion pub : publicaciones) {
			if (pub instanceof Libro) {
				System.out.printf("%nID: %d. Titulo: %s", pub.getId(), pub.getTitulo());
			}
		}
		// 14.d.c. Solo revistas del array publicaciones con ID y título (usar
		// instanceof para discriminar).
		System.out.println();
		System.out.printf("%nTodas las revistas e IDs%n");
		System.out.printf("-------------------------");
		for (Publicacion pub : publicaciones) {
			if (pub instanceof Revista) {
				System.out.printf("%nID: %d. Titulo: %s", pub.getId(), pub.getTitulo());
			}
		}
		// 14.d.d.Todas las publicaciones del array publicaciones con ID, título y
		// precio pero filtrando aquellas que tienen un precio mayor de 20 euros.
		System.out.println();
		System.out.printf("%nTodas las publicaciones de más de 20 euros%n");
		System.out.printf("--------------------------------------------");
		for (Publicacion pub : publicaciones) {
			if (pub.getPrecio() > 20) {
				System.out.printf("%nID: %d. Titulo: %s. Precio: %.2f euros", pub.getId(), pub.getTitulo(),
						pub.getPrecio());
			}
		}
		// 14.d.e. Solo libros del array publicaciones con ID y título y precio pero
		// filtrando aquellas que tienen un precio mayor de
		// 20 euros. (usar instanceof para discriminar).
		System.out.println();
		System.out.printf("%nTodos los libros de más de 20 euros%n");
		System.out.printf("-------------------------------------");
		for (Publicacion pub : publicaciones) {
			if (pub instanceof Libro && pub.getPrecio() > 20) {
				System.out.printf("%nID: %d. Titulo: %s. Precio: %.2f euros", pub.getId(), pub.getTitulo(),
						pub.getPrecio());
			}
		}
		// 14.d.f. Solo revistas del array publicaciones con ID y título y precio pero
		// filtrando aquellas que tienen un precio mayor
		// de 3 euros (usar instanceof para discriminar).
		System.out.println();
		System.out.printf("%nTodas las revistas de más de 3 euros%n");
		System.out.printf("-------------------------------------");
		for (Publicacion pub : publicaciones) {
			if (pub instanceof Revista && pub.getPrecio() > 3) {
				System.out.printf("%nID: %d. Titulo: %s. Precio: %.2f euros", pub.getId(), pub.getTitulo(),
						pub.getPrecio());
			}
		}
		
		// 14.e. Libro ulises
		System.out.println();
		System.out.printf("%nLibro Ulises%n");
		System.out.printf("------------");
		System.out.printf("%n--Leer 295 páginas de forma silenciosa--%n");
		
		for (Publicacion pub : publicaciones) {
			if (pub.getTitulo() == "Ulises") {
				pub.show();
				for (int i = 0; i < 295; i++) {
					pub.leePagina(true);

				}
				System.out.printf("Estamos en la página %d%n", pub.getPagActual());
			}
		}
		
		System.out.printf("%n--Leer 5 páginas de forma NO silenciosa--%n");
		for (Publicacion pub : publicaciones) {
			if(pub.getTitulo() == "Ulises") {
				for (int i = 0; i < 5; i++) {
					pub.leePagina(false);	
				}
				System.out.printf("%nEstamos en la página %d%n", pub.getPagActual());
			}
			
		}
		
		Publicacion.leePaginaStatic(rev4, true);
		
	}
}