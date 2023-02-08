package tienda.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;

public final class FabricanteDAO extends DAO {
    
    public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }
            String sql = "INSERT INTO fabricante (nombre) " +
                    "VALUES ('" + fabricante.getNombre() + "');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un nombre de fabricante");
            }
            String sql = "UPDATE fabricante SET " +
                    "nombre = '" + fabricante.getNombre() + "' WHERE codigo = "
                    + fabricante.getCodigo();
        } catch (Exception e) {
            throw e; 
        }
    }
    
    public void eliminarFabricante(String nombre) throws ClassNotFoundException, SQLException {
        try {
            String sql = "DELETE FROM fabricante WHERE nombre = '" + nombre + "';";
            insertarModificarEliminar(sql);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
    
    public Fabricante buscarFabricantePorNombre(String nombre) throws ClassNotFoundException, SQLException {
        try {
            String sql = "SELECT * FROM fabricante " +
                    "WHERE nombre = " + nombre + ";";
            consultarBase(sql);
            
            Fabricante fabricante = null;
            while(resultado.next()){
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fabricante;
        } catch (ClassNotFoundException | SQLException e) {
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Fabricante> listarFabricantes() throws Exception {
        try {
            String sql = "SELECT nombre FROM fabricante";
            consultarBase(sql);
            
            Fabricante fabricante = null;
            Collection<Fabricante> fabricantes = new ArrayList<>();
            while(resultado.next()){
                fabricante = new Fabricante();
                fabricante.setNombre(resultado.getString(1));
                fabricantes.add(fabricante);
            }
            desconectarBase();
            return fabricantes;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}
