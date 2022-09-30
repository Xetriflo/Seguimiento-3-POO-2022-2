/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package milo.punto10cap4;

/**
 *
 * @author camil
 */
public class calculos {
        public static double calcular_matricula(double patri, int estrato){
        double matricula=50000;
        if(patri> 2000000 && estrato>3){
        matricula=((patri*3)/100);
        return matricula;
        }else{
            return matricula;
        }
        
    } 
}

