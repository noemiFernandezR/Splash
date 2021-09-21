package Clases;

public class porcentaje {
   protected int cantidad; 
   protected double precio;

    public porcentaje(int cantidad, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public porcentaje() {
    }

    public int getCantidadCamisas() {
        return cantidad;
    }

    public void setCantidadCamisas(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   

    public double importecompra(){
    
    double ic;
    ic=cantidad * precio;
    return ic ;
    
    }
   
    public double primerdes() {
    double primer;
    primer = importecompra()*0.7;
    return primer; 
    }
    
    public double segundodes() {
    double segundo;
    segundo = (importecompra()- primerdes ()) * 0.7;
    return segundo; 
    }
    
    public double desctotal() {
    double total;
    total = primerdes () - segundodes ();
    return total; 
    }
     
    public double preciofinal() {
    double finalprecio;
    finalprecio = importecompra() - desctotal ();
    return finalprecio; 
    }

    
 
}
