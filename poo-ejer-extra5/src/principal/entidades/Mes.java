
package principal.entidades;

public class Mes {
    
    private String[] MESES = {"enero", "febrero", "marzo", "abril", "mayo",
                                "junio", "julio", "agosto", "septiembre",
                                "octubre", "noviembre", "diciembre"};

    public Mes() {
    }

    public void setMESES(String[] MESES) {
        this.MESES = MESES;
    }

    public String[] getMESES() {
        return MESES;
    }

    @Override
    public String toString() {
        return "Mes{" + "MESES=" + MESES + '}';
    }
    
    
    
}
