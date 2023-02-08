package main.entity;

import main.service.ServiceEdificioDeOficinas;

public class EdificioDeOficinas extends Edificio {
    
    private int numeroOficinas;
    private int cantPersonasPorOficina;
    private int numeroPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numeroOficinas, int cantPersonasPorOficina, int numeroPisos, double alto, double ancho, double largo) {
        super(alto, ancho, largo);
        this.numeroOficinas = numeroOficinas;
        this.cantPersonasPorOficina = cantPersonasPorOficina;
        this.numeroPisos = numeroPisos;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public int getCantPersonasPorOficina() {
        return cantPersonasPorOficina;
    }

    public void setCantPersonasPorOficina(int cantPersonasPorOficina) {
        this.cantPersonasPorOficina = cantPersonasPorOficina;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }
    
    @Override
    public void crearEdificio() {
        System.out.println("Cantidad de oficinas: ");
        this.setNumeroOficinas(scanner.nextInt());
        System.out.println("Personas por oficina: ");
        this.setCantPersonasPorOficina(scanner.nextInt());
        System.out.println("Número de pisos: ");
        this.setNumeroPisos(scanner.nextInt());
        super.crearEdificio();
    }
    
    public void cantPersonas(EdificioDeOficinas edificioDeOficinas) {
        int oficinasPorPiso = (int) edificioDeOficinas.getNumeroOficinas()/edificioDeOficinas.getNumeroPisos();
        int oficinasSobrantes = edificioDeOficinas.getNumeroOficinas()%edificioDeOficinas.getNumeroPisos();
        
        if(oficinasSobrantes == 0){
            System.out.println("\nPodría haber " + (edificioDeOficinas.getCantPersonasPorOficina() * oficinasPorPiso) + 
                " personas por piso");
        } else {
            System.out.println("\nPodría haber " + (edificioDeOficinas.getCantPersonasPorOficina() * oficinasPorPiso) + 
                    " personas en " + (edificioDeOficinas.getNumeroPisos() - oficinasSobrantes) + " pisos y " + 
                    (edificioDeOficinas.getCantPersonasPorOficina() * (oficinasPorPiso + 1)) +
                    " personas en " + oficinasSobrantes + " pisos");
        }
        System.out.println("\nEn todo el edificio podría haber " + 
                edificioDeOficinas.getNumeroOficinas() * edificioDeOficinas.getCantPersonasPorOficina() +
                " personas");
        
    }
    
    @Override
    public double calcularSuperficie() {
        return super.getAncho() * super.getLargo();
    }

    @Override
    public double calcularVolumen() {
        return calcularSuperficie() * super.getAlto();
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numeroOficinas=" + numeroOficinas + ", cantPersonasPorOficina=" + cantPersonasPorOficina + ", numeroPisos=" + numeroPisos + '}';
    }
}
