package Clases;

public class Matematica {


    protected int a, b;
    protected double x, y;
    protected double c;
    protected double h,i,k;    
    
//constructor para hallar la raiz cuadrada de un número
    public Matematica(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public static double round(double c) {
        double max=c*10;
        double residuo=max%10;
        double resul;
        if (residuo>=5) {
            resul=((max-residuo)/10)+1;
        } else {
            resul=(max-residuo)/10;
        }
        return resul;
    }
    public static double sqrt(double c) {
        double result;
        result=Math.sqrt(c);
        return result;
    }
//constructor para hallar la potencia

    public Matematica(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //construir el método potencia
    public static double pow(double x, double y) {
        double ans = 1;
        if (y != 0) {
            double absExponent = y > 0 ? y : (-1) * y;
            for (double i = 1; i <= absExponent; i++) {
                ans *= x;
            }
            if (y < 0) {
                ans = 1.0 / ans;
            }
        } else {

            ans = 1;
        }

        return ans;
    }
    //construir el método para hallar el valor maximo

    public static int max(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }
    //construir el método para hallar el valor maximo

    public static int min(int a, int b) {
        int min;
        if (a > b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }

    //constructor para hallar el valor absoluto
    public Matematica(int a, int b) {
        this.a = a;
        this.b = b;
    }
    //get es para mostrar 

    public int getA() {
        return a;
    }
    //set es para gauradar nuestro valor

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    //construir el método absoluto

    public static int abs(int a) {
        int valAbs;
        if (a >= 0) {
            valAbs = a;
        } else {
            valAbs = a * -1;
        }
        return valAbs;
    }

}
