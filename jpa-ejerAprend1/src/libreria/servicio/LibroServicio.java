package libreria.servicio;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import libreria.entidad.Autor;
import libreria.entidad.Editorial;
import libreria.entidad.Libro;
import libreria.persistencia.AutorDAO;
import libreria.persistencia.LibroDAO;

public class LibroServicio {
    
    private final LibroDAO libDao;
    private final Scanner scanner;
    private final AutorServicio autorSer;
    private final EditorialServicio editSer;
    private final AutorDAO autDao;

    public LibroServicio() {
        this.libDao = new LibroDAO();
        this.scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        this.autorSer = new AutorServicio();
        this.editSer = new EditorialServicio();
        this.autDao = new AutorDAO();
    }
    
    public Libro crearLibro() throws Exception {
        Libro libro = new Libro();
        String  opcion = "s";
        
        try {
            do {
                System.out.println("--- INGRESO DATOS DEL LIBRO ---");
                System.out.print("ISBN: ");
                libro.setIsbn(scanner.nextLong());
                while (libDao.buscarPorIsbn(libro.getIsbn()) != null) {
                    System.out.print("El ISBN ya existe, por favor ingrese otro: ");
                    libro.setIsbn(scanner.nextLong());
                }
                System.out.print("Título: ");
                libro.setTitulo(scanner.next());
                while (libDao.buscarPorNombre(libro.getTitulo()) != null) {
                    System.out.print("El nombre ya existe!\nIngrese otro ejemplar: ");
                    libro.setTitulo(scanner.next());
                }
                System.out.print("Año: ");
                libro.setAnio(scanner.nextInt());
                System.out.print("Cantidad de Ejemplares: ");
                libro.setEjemplares(scanner.nextInt());
                
                libro.setAutor(autorSer.crearAutor());
                if (autDao.buscarPorNombre(libro.getAutor().getNombre()) == null) {
                    autorSer.guardarAutor(libro.getAutor());
                    }
                
                libro.setEditorial(editSer.crearEditorial());
                if (libDao.buscarPorEditorial(libro.getEditorial().getNombre()) == null){
                    editSer.guardarEditorial(libro.getEditorial());
                }
                libro.setEjemplaresPrestados(0);
                libro.setEjemplaresRestantes(libro.getEjemplares());
                libro.setAlta(true);
                do {                    
                        System.out.print("Desea ingrsar otro libro? (s/n): ");
                        opcion = scanner.next();
                    } while (!(opcion.equalsIgnoreCase("s") || opcion.equalsIgnoreCase("n")));
            } while (opcion.equalsIgnoreCase("s"));
            
            return libro;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void guardarLibro(Libro libro) throws Exception {
        try {
            libDao.guardar(libro);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void editarLibro() throws Exception {
        try {
            System.out.print("Ingrese el nombre del libro a editar: ");
            String nombre = scanner.next();
            if (libDao.buscarPorNombre(nombre) == null) {
                System.out.println("El libro no existe...");
            } else {
                libDao.editar(nombre);
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarLibro() {
        try {
            System.out.println("Ingrese el nombre del libro a eliminar: ");
            String nombre = scanner.next();
            if (libDao.buscarPorNombre(nombre) == null) {
                System.out.println("El libro no existe...");
            } else {
                libDao.eliminar(nombre);
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void mostrarTodosLosLibros() {
        try {
            List<Libro> libros = libDao.mostrar();
            System.out.println("ISBN\tTITULO\tAÑO\tEJEMPLARES\tPRESTADOS\tRESTANTES\tALTA\tAUTOR\tEDITORIAL");
            for (Libro libro : libros) {
                System.out.println(libro.toString(libro));
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void buscarLibroPorIsbn() throws Exception {
        try {
            System.out.print("Ingrese el ISBN: ");
            long isbn = scanner.nextLong();
            Libro libro = libDao.buscarPorIsbn(isbn);
            if(libro == null) {
                System.out.println("No hay libros con ese dato!");
            } else {
                System.out.println("ISBN\tTITULO\tAÑO\tEJEMPLARES\tPRESTADOS\tRESTANTES\tALTA\tAUTOR\tEDITORIAL");
                System.out.println(libro.toString(libro));
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void buscarLibroPorNombre() throws Exception {
        try {
            System.out.print("Ingrese el nombre del libro: ");
            String nombre = scanner.next();
            Libro libro = libDao.buscarPorNombre(nombre);
            if(libro == null) {
                System.out.println("No hay libros con ese dato!");
            } else {
                System.out.println("ISBN\tTITULO\tAÑO\tEJEMPLARES\tPRESTADOS\tRESTANTES\tALTA\tAUTOR\tEDITORIAL");
                System.out.println(libro.toString(libro));
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void buscarLibrosPorAnio() {
        try {
            System.out.print("Ingrese el año: ");
            int anio = scanner.nextInt();
            List<Libro> libros = libDao.buscarPorAnio(anio);
            if(libros == null) {
                System.out.println("No hay libros con ese dato!");
            } else {
                System.out.println("ISBN\tTITULO\tAÑO\tEJEMPLARES\tPRESTADOS\tRESTANTES\tALTA\tAUTOR\tEDITORIAL");
                for (Libro libro : libros) {
                    System.out.println(libro.toString(libro));
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void buscarLibrosPorAutor() {
        try {
            System.out.print("Ingrese el nombre del autor: ");
            String nombre = scanner.next();
            List<Libro> libros = libDao.buscarPorAutor(nombre);
            if(libros == null) {
                System.out.println("No hay libros con ese dato!");
            } else {
                System.out.println("ISBN\tTITULO\tAÑO\tEJEMPLARES\tPRESTADOS\tRESTANTES\tALTA\tAUTOR\tEDITORIAL");
                for (Libro libro : libros) {
                    System.out.println(libro.toString(libro));
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void buscarLibrosPorEditorial() {
        try {
            System.out.print("Ingrese el nombre de la editorial: ");
            String nombre = scanner.next();
            List<Libro> libros = libDao.buscarPorEditorial(nombre);
            if(libros == null) {
                System.out.println("No hay libros con ese dato!");
            } else {
                System.out.println("ISBN\tTITULO\tAÑO\tEJEMPLARES\tPRESTADOS\tRESTANTES\tALTA\tAUTOR\tEDITORIAL");
                for (Libro libro : libros) {
                    System.out.println(libro.toString(libro));
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void altaBajaLibro() {
        System.out.print("Ingrese el nombre del libro al que quiere modificar el estado: ");
        String nombre = scanner.next();
        Libro libro = libDao.buscarPorNombre(nombre);
        if (libro == null) {
            System.out.println("No hay libros con ese nombre!");
        } else {
            if (libro.getAlta() == true) {
                libro.setAlta(false);
            } else {
                libro.setAlta(true);
            }
        }
        libDao.editar(nombre);
        System.out.println("ISBN\tTITULO\tAÑO\tEJEMPLARES\tPRESTADOS\tRESTANTES\tALTA\tAUTOR\tEDITORIAL");
        System.out.println(libro.toString(libro));
    }
}
