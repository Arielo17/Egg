
package Entidad;


public class Libro {
    
    public int isbn;
    public String titulo;
    public String autor;
    public int paginas;
    
    public Libro(){
        
    }

    public Libro(int isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public void setIsbn(int isbn){
        this.isbn = isbn;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }
    
    public int getIsbn(){
        return isbn;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getPaginas(){
        return paginas;
    }
}
