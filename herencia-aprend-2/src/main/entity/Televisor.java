package main.entity;

public class Televisor extends Electrodomestico{
    
    private int pulgadas;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean tdt, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
    
    public void craerTelevisor(){
        super.crearElectrodomestico();
        System.out.print("Pulgadas: ");
        this.setPulgadas(scanner.nextInt());
        System.out.print("TDT (true/false): ");
        this.setTdt(scanner.nextBoolean());
        System.out.println("\nCOLOR\tCONSUMO\tPESO\tPULGADAS\tTDT");
        System.out.println(this.toString());
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(this.getPulgadas()>40){
            this.setPrecio(this.getPrecio() * 1.3);
        }
        if(this.isTdt()){
            this.setPrecio(this.getPrecio() + 500);
        }
        System.out.println("El precio del TV es: " + this.getPrecio());
    }

    @Override
    public String toString() {
        return super.toString()+ "\t" + pulgadas + "\t" + tdt;
    }
    
    
}
