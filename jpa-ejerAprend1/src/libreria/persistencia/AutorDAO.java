package libreria.persistencia;

import java.util.List;
import libreria.entidad.Autor;

public class AutorDAO extends DAO<Autor> {
    
    @Override
    public void guardar(Autor autor){
        super.guardar(autor);
    }
    
    public void editar(String nombre) throws Exception {
        try {
            Autor autor = buscarPorNombre(nombre);
            super.editar(autor);
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public void eliminar(String nombre) throws Exception {
        try {
            Autor autor = buscarPorNombre(nombre);
            super.eliminar(autor);
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public List<Autor> mostrar() {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        desconectar();
        return autores;
    }

    public Autor buscarPorId(int id) throws Exception {
        Autor autor;
        try {
            conectar();
            autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id = :id")
                .setParameter("id", id).getSingleResult();
            desconectar();
            return autor;
        } catch (Exception e) {
            desconectar();
            return null;
        } 
    }
    
    public Autor buscarPorNombre(String nombre) throws Exception {
        Autor autor;
        try {
            conectar();
            autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getSingleResult();
            desconectar();
            return autor;
        } catch (Exception e) {
            desconectar();
            return null;
        }
    }
}
