
package milo.punto19;


public class calculos {
        public static double calcular_perimetro(double lado){
        double perimetro;
        perimetro=lado*3 ;
        return perimetro;
    } 

public static double calcular_altura (double lado) {
double altura;
altura = (lado* Math.sqrt (3))/2;
return altura;
    }
public static double calcular_area (double lado) {
double area;
area = (Math.pow(lado,2)*Math.sqrt (3))/4;
return area;
    }
}
