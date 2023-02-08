package main.entity;

public final class Lavadora extends Electrodomestico{
    
    private int carga;

    public Lavadora() {
    }
    

    public Lavadora(int carga, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    @Override
    public void crearElectrodomestico(){
        super.crearElectrodomestico();
        System.out.print("Carga: ");
        this.setCarga(scanner.nextInt());
        System.out.println("\nCOLOR\tCONSUMO\tPESO\tCARGA");
        System.out.println(this.toString());
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(this.getCarga()>30){
            this.setPrecio(this.getPrecio() + 500d);
        }
        System.out.println("El precio de la lavadora es: " + this.getPrecio());
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + carga;
    }
}
