package main.entidad;

public class Libro{
    
    private String titulo;
    private String autor;
    private Integer paginas;
    private Integer anio;

    public Libro() {
    }

    public Libro(String titulo, Integer anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    public Libro(String titulo, String autor, Integer paginas, Integer anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }
    
    public Integer getAnio(){
        return anio;
    }
    
    public void setAnio(Integer anio){
        this.anio = anio;
    }
    
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + ", anio=" + anio + "}";
    }
    
}
