package libreria.persistencia;

import java.util.List;
import javax.persistence.NoResultException;
import libreria.entidad.Libro;

public class LibroDAO extends DAO {
    
    public void guardar(Libro libro){
        super.guardar(libro);
    }
    
    public void editar(String nombre) {
        Libro libro = buscarPorNombre(nombre);
        super.editar(libro);
    }
    
    public void eliminar(String nombre) {
        Libro libro = buscarPorNombre(nombre);
        super.eliminar(libro);
    }
    
    public List<Libro> mostrar() {
        try {
            conectar();
            List<Libro> libros = em.createQuery("SELECT l FROM Libro l").getResultList();
            desconectar();
            return libros;
        } catch (Exception e) {
            desconectar();
            throw e;
        }
        
    }

    public Libro buscarPorIsbn(long isbn) {
        try {
            conectar();
            Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn = :isbn")
                    .setParameter("isbn", isbn).getSingleResult();
            desconectar();
            return libro;
        } catch (NoResultException e) {
            desconectar();
            return null;
        }
        
    }
    
    public Libro buscarPorNombre(String titulo) {
        try {
            conectar();
            Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo")
                    .setParameter("titulo", titulo).getSingleResult();
            desconectar();
            return libro;
        } catch (Exception e) {
            desconectar();
            return null;
        }
    }
    
    public List<Libro> buscarPorAnio(Integer anio) {
        try {
            conectar();
            List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.anio = :anio")
                    .setParameter("anio", anio).getResultList();
            desconectar();
            return libros;
        } catch (Exception e) {
            desconectar();
            throw e;
        }
    }
    
    public List<Libro> buscarPorAutor(String nombreAutor) {
        try {
            conectar();
            List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre LIKE :nombreAutor")
                    .setParameter("nombreAutor", nombreAutor).getResultList();
            desconectar();
            return libros;
        } catch (Exception e) {
            desconectar();
            throw e;
        }
    }
    
    public List<Libro> buscarPorEditorial(String nombreEditorial) {
            try {
                conectar();
                List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.editorial e WHERE e.nombre LIKE :nombreEditorial")
                        .setParameter("nombreEditorial", nombreEditorial).getResultList();
                desconectar();
                return libros;
            } catch (Exception e) {
                desconectar();
                throw e;
            }
    }
}
