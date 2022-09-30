
package milo.ejmplo18;


public class Salario {
    public static double salario_bruto(double hora, double valor_hora){
        double salariobruto;
        salariobruto=hora*valor_hora;
        return salariobruto;
    }
       public static double porcentaje_retencion(double hora, double valor_hora, double retencion){
        double retenido;
            retenido =((hora*valor_hora)*retencion)/100;
        return retenido;
    } public static double salario_neto(double hora, double valor_hora, double retencion){
        double salafinal;
        salafinal = (hora*valor_hora)-(((hora*valor_hora)*retencion)/100);
        return salafinal;
    }
}
  