package Clases;

public class Pension {
//declaramos los atributos de categoría y promedio con visibilidad o alcance privado
 protected int categoria;
 protected double promedio;
// método constructor Empleado
    public Pension(int categoria, double promedio) {//se envían los valores obtenidos desde los controles cboCategoria y txtPromedio a 
//los parámetros implementados en el método constructor Pensión
        this.categoria = categoria;
        this.promedio = promedio;
    }

 public int getCategoria() {
 return categoria;
 }
 public void setCategoria(int categoria) {
 this.categoria = categoria;
 }
 //7
 public double getPromedio() {
 return promedio;
 }
 public void setPromedio(double promedio) {
 this.promedio = promedio;
 }
    
 public double determinaPension(){
 switch(getCategoria()){
 case 0: return 550;
 case 1: return 500;
 case 2: return 460;
 default: return 400;
 }
 }
 //4
 public double calculaDescuento(){
 if(getPromedio()<=13.99)
 return 0;
 else if(getPromedio()<=15.99)
 return 0.1*determinaPension();
 else if(getPromedio()<=17.99)
 return 0.12*determinaPension();
 else
 return 0.15*determinaPension();
 }
 //5
 public double determinaNuevaPension(){
 return determinaPension()-calculaDescuento();
 }

 
}
