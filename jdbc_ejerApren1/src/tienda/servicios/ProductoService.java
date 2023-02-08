package tienda.servicios;

import java.util.Scanner;
import tienda.persistencia.ProductoDAO;

public class ProductoService {
    
    private ProductoDAO prodDao;

    public ProductoService() {
        this.prodDao = new ProductoDAO();
    }
    
    public void crearProducto() throws Exception{
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        try {
            String nombre;
            Double precio;
            int codigoFabricante;
            String opc = "s";
            do {                
                System.out.print("Ingrese el nombre del producto: ");
                nombre = scanner.next();
                if (nombre == null || nombre.trim().isEmpty()) {
                    throw new Exception("Debe indicar un nombre del producto");
                }
                if(buscarProductoPorNombre(nombre) != null) {
                    System.out.println("El producto ya existe!");
                    do {                    
                        System.out.print("Desea ingresar otro producto? (s/n): ");
                        opc = scanner.next();
                    } while (!(opc.equalsIgnoreCase("s") || opc.equalsIgnoreCase("n")));
                }
            } while (opc.equalsIgnoreCase("s"));
            precio = scanner.nextDouble();
            insertarFabricante(nombre);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void insertarFabricante(String nombre) throws Exception {
        try {
            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nombre);
            fabDao.guardarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarFabricante(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del fabricante");
            }
            Fabricante fabricante = buscarFabricantePorNombre(nombre);
            fabDao.modificarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarFabricante(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del fabricante");
            }
            fabDao.eliminarFabricante(nombre);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Fabricante buscarProductoPorNombre(String nombre) throws Exception{
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del fabricante");
            }
            Fabricante fabricante = fabDao.buscarFabricantePorNombre(nombre);
            return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Collection<Fabricante> listarFabricantes() throws Exception{
        try {
            Collection<Fabricante> fabricantes = fabDao.listarFabricantes();
            return fabricantes;
        } catch (Exception e) {
            throw e;
        }
    }
    
   public void mostrarFabricantes() throws Exception {
       try {
           Collection<Fabricante> fabricantes = listarFabricantes();
           
           if (fabricantes.isEmpty()) {
               throw new Exception("No hay fabricantes para mostrar");
           } else {
               System.out.println("Código\tNombre");
               for (Fabricante aux : fabricantes) {
                   System.out.println(aux.toString());
               }
           }
       } catch (Exception e) {
           throw e;
       }
   }
}
