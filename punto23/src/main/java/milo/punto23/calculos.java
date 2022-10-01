/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package milo.punto23;

/**
 *
 * @author camil
 */
public class calculos {
    public static double solu1(double a, double b, double c){
        double solucion1;
        double solucion2;
        solucion2=(-c/b);
        if(a !=0){
            solucion1=(-b + Math.sqrt((b*b)-(4*a*c)))/2*a;
        return solucion1;
        }else{
            return solucion2;
        }
        
    }
     public static double solu2(double a, double b, double c){
        double solucion2;
        if(a !=0){
            solucion2=(-b - Math.sqrt((b*b)-(4*a*c)))/2*a;
        return solucion2;
        }
     return 0;
    }
}
