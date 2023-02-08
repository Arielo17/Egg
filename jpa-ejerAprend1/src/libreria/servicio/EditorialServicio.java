package libreria.servicio;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import libreria.entidad.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialServicio {
    
    private final EditorialDAO editDao;
    private final Scanner scanner; 
    
    public EditorialServicio() {
        this.editDao = new EditorialDAO();
        this.scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    }
    
    public Editorial crearEditorial() throws Exception {
        Editorial editorial = new Editorial();
        try {
            System.out.println("- DATOS DE LA EDITORIAL -");
            System.out.print("Nombre: ");
            editorial.setNombre(scanner.next());
            editorial.setAlta(true);
            return editorial;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void guardarEditorial(Editorial editorial) throws Exception {
        try {
            editDao.guardar(editorial);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void editarEditorial() throws Exception {
        try {
            System.out.print("Ingrese el nombre de le editorial a editar: ");
            String nombre = scanner.next();
            if (editDao.buscarPorNombre(nombre) == null) {
                System.out.println("La editorial no existe...");
            } else {
                editDao.editar(nombre);
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarEditorial() {
        try {
            System.out.println("Ingrese el nombre de le editorial a eliminar: ");
            String nombre = scanner.next();
            if (editDao.buscarPorNombre(nombre) == null) {
                System.out.println("La editorial no existe...");
            } else {
                editDao.eliminar(nombre);
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void mostrarTodosLasEditoriales() {
        try {
            List<Editorial> editoriales = editDao.mostrar();
            System.out.println("ID\tNOMBRE\tALTA");
            for (Editorial editorial : editoriales) {
                System.out.println(editorial.toString());
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void buscarEditorialPorId() throws Exception {
        try {
            System.out.print("Ingrese el ID: ");
            int id = scanner.nextInt();
            Editorial editorial = editDao.buscarPorId(id);
            if(editorial == null) {
                System.out.println("No hay editoriales con ese dato!");
            } else {
                System.out.println("ID\tNOMBRE\tALTA");
                System.out.println(editorial.toString());
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void buscarEditorialPorNombre() throws Exception {
        try {
            System.out.print("Ingrese el nombre de le editorial: ");
            String nombre = scanner.next();
            Editorial editorial = editDao.buscarPorNombre(nombre);
            if(editorial == null) {
                System.out.println("No hay editoriales con ese dato!");
            } else {
                System.out.println("ID\tNOMBRE\tALTA");
                System.out.println(editorial.toString());
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void altaBajaEditorial() {
        System.out.print("Ingrese el nombre dela editorial a la que quiere modificar el estado: ");
        String nombre = scanner.next();
        Editorial editorial = editDao.buscarPorNombre(nombre);
        if (editorial == null) {
            System.out.println("No hay editoriales con ese nombre!");
        } else {
            if (editorial.getAlta() == true) {
                editorial.setAlta(false);
            } else {
                editorial.setAlta(true);
            }
        }
        editDao.editar(nombre);
        System.out.println("ID\tNOMBRE\tALTA");
        System.out.println(editorial.toString());
    }
}
