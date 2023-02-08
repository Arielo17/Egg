package tienda.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

public final class ProductoDAO extends DAO{
    
    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un fabricante");
            }
            String sql = "INSERT INTO producto (codigo,nombre,precio,codigo_fabricante) " +
                    "VALUES (" + producto.getCodigo() + ", '" + producto.getNombre() + "'," +
                    producto.getPrecio() + "," + producto.getCodigoFabricante() + ");";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar un nombre de fabricante");
            }
            String sql = "UPDATE fabricante SET " +
                    "nombre = '" + producto.getNombre() + "', precio = " + producto.getPrecio()
                    + ", codigo_fabricante = " + producto.getCodigoFabricante()+ " WHERE codigo = "
                    + producto.getCodigo();
        } catch (Exception e) {
            throw e; 
        }
    }
    
    public void eliminarProductoPorNombre(String nombre) throws ClassNotFoundException, SQLException {
        try {
            String sql = "DELETE FROM fabricante WHERE nombre = '" + nombre + "';";
            insertarModificarEliminar(sql);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
    
    public Producto buscarProductoPorCodigo(int codigo) throws ClassNotFoundException, SQLException {
        try {
            String sql = "SELECT * FROM producto " +
                    "WHERE codigo = " + codigo + ";";
            consultarBase(sql);
            
            Producto producto = null;
            while(resultado.next()){
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (ClassNotFoundException | SQLException e) {
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT nombre, precio, codigo_fabricante FROM producto";
            consultarBase(sql);
            
            Producto producto = null;
            Collection<Producto> productos = new ArrayList<>();
            while(resultado.next()){
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                producto.setCodigoFabricante(resultado.getInt(3));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}
