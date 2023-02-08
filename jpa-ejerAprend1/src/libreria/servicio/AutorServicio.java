package libreria.servicio;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import libreria.entidad.Autor;
import libreria.persistencia.AutorDAO;

public class AutorServicio {
    
    private final AutorDAO autDao;
    private final Scanner scanner; 
    
    public AutorServicio() {
        this.autDao = new AutorDAO();
        this.scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    }
    
    public Autor crearAutor() throws Exception {
        Autor autor = new Autor();
        try {
            System.out.println("- DATOS DEL AUTOR -");
            System.out.print("Ingrese el nombre del autor: ");
            autor.setNombre(scanner.next());
            autor.setAlta(true);
            return autor;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void guardarAutor(Autor autor) throws Exception {
        try {
            autDao.guardar(autor);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void editarAutor() throws Exception {
        try {
            System.out.print("Ingrese el nombre del autor a editar: ");
            String nombre = scanner.next();
            if (autDao.buscarPorNombre(nombre) == null) {
                System.out.println("El autor no existe...");
            } else {
                autDao.editar(nombre);
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarAutor() throws Exception {
        try {
            System.out.println("Ingrese el nombre del autor a eliminar: ");
            String nombre = scanner.next();
            if (autDao.buscarPorNombre(nombre) == null) {
                System.out.println("El autor no existe...");
            } else {
                autDao.eliminar(nombre);
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void mostrarTodosLosAutores() {
        try {
            List<Autor> autores = autDao.mostrar();
            System.out.println("ID\tNOMBRE\tALTA");
            for (Autor autor : autores) {
                System.out.println(autores.toString());
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void buscarAutorPorId() throws Exception {
        try {
            System.out.print("Ingrese el ID: ");
            int id = scanner.nextInt();
            Autor autor = autDao.buscarPorId(id);
            if(autor == null) {
                System.out.println("No hay autores con ese dato!");
            } else {
                System.out.println("\"ID\\tNOMBRE\\tALTA\"");
                System.out.println(autor.toString());
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void buscarAutorPorNombre() throws Exception {
        try {
            System.out.print("Ingrese el nombre del autor: ");
            String nombre = scanner.next();
            Autor autor = autDao.buscarPorNombre(nombre);
            if(autor == null) {
                System.out.println("No hay autores con ese dato!");
            } else {
                System.out.println("\"ID\\tNOMBRE\\tALTA\"");
                System.out.println(autor.toString());
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void altaBajaAutor() throws Exception {
        System.out.print("Ingrese el nombre del autor al que quiere modificar el estado: ");
        String nombre = scanner.next();
        Autor autor = autDao.buscarPorNombre(nombre);
        if (autor == null) {
            System.out.println("No hay autores con ese nombre!");
        } else {
            if (autor.getAlta() == true) {
                autor.setAlta(false);
            } else {
                autor.setAlta(true);
            }
        }
        autDao.editar(nombre);
        System.out.println("ID\tNOMBRE\tALTA");
        System.out.println(autor.toString());
    }
}

