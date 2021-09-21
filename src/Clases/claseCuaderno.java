/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author ACER
 */
public class claseCuaderno {
    
  double TipoCuaderno,preciocuaderno,cantidad,descuento,neto;  
  
   public claseCuaderno() {
       
    }
    public claseCuaderno(double TipoCuaderno, double preciocuaderno, double cantidad, double descuento, double neto) {
        this.TipoCuaderno = TipoCuaderno;
        this.preciocuaderno = preciocuaderno;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.neto = neto;
    }

    
    public double getTipoCuaderno() {
        return TipoCuaderno;
    }


    public void setTipoCuaderno(double TipoCuaderno) {
        this.TipoCuaderno = TipoCuaderno;
    }

    public double getPreciocuaderno() {
        return preciocuaderno;
    }

    public void setPreciocuaderno(double preciocuaderno) {
        this.preciocuaderno = preciocuaderno;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }
  
  //métodos para el tipo de cuaderno y costo
    
    public double TiposdeCuadernos(){
       if (TipoCuaderno == 1) {
            preciocuaderno= 1.5;
        }
        if (TipoCuaderno == 2) {
            preciocuaderno = 1.9;
        }
        if (TipoCuaderno == 3) {
            preciocuaderno = 3.5;
        }
        if (TipoCuaderno == 4) {
            preciocuaderno = 2.5;
        }
        if (TipoCuaderno == 5) {
            preciocuaderno =3.0;
        }
        if (TipoCuaderno == 6) {
            preciocuaderno =4.5;
        }
        return preciocuaderno;
    }
    
    public double DescricionCuaderno(){
        return TipoCuaderno;
    }
    public double PreciodelCuadero(){
        return preciocuaderno;
    }
    public double Subtotal(){
       double resultad;
       resultad=TiposdeCuadernos()*cantidad;
       return resultad;
    }
    
    public double DescuentoCuadernos(){
        return Subtotal()*0.1;
    }
    
    public double SueldoNeto(){
        return Subtotal()-DescuentoCuadernos();
    }
    public double MostrarCantida(){
        return cantidad;
    }
}
