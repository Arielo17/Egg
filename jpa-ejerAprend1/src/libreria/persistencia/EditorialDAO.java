package libreria.persistencia;

import java.util.List;
import libreria.entidad.Editorial;

public class EditorialDAO extends DAO {
    
    public void guardar(Editorial editorial){
        super.guardar(editorial);
    }
    
    public void editar(String nombre) {
        Editorial editorial = buscarPorNombre(nombre);
        super.editar(editorial);
    }
    
    public void eliminar(String nombre) {
        Editorial editorial = buscarPorNombre(nombre);
        super.eliminar(editorial);
    }
    
    public List<Editorial> mostrar() {
        conectar();
        List<Editorial> libros = em.createQuery("SELECT e FROM Editorial e").getResultList();
        desconectar();
        return libros;
    }

    public Editorial buscarPorId(int id) {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.id = :id")
                .setParameter("id", id);
        desconectar();
        return editorial;
    }
    
    public Editorial buscarPorNombre(String nombre) {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre")
                .setParameter("nombre", nombre);
        desconectar();
        return editorial;
    }
}
