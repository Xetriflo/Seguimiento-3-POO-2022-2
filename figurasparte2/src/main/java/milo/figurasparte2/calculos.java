
package milo.figurasparte2;


public class calculos {
        public static double areacirculo(double radio){
        double area=Math.PI*Math.pow(radio,2);
       return area;
        
    }
     public static double perimetrocirculo(double radio){
        double perimetro=2*Math.PI*radio;
        
     return perimetro;
    }
        public static double areacuadrado(int lado){
        int area=lado*lado;
       return area;
        
    }   public static double perimetrocuadrado(int lado){
        int perimetro=4*lado;
       return perimetro;
        
    }
       public static double arearectangulo(int base, int altura){
           int area =base*altura; 
       
       return area;
        
    }  public static double perimetrorectangulo(int base, int altura){
           int perimetro =(2*base)+(2*altura); 
       
       return perimetro;
        
    }  public static double areatriangulo(int base, int altura){
           int area =(base*altura)/2; 
       
       return area;
        
    }
       public static double hipotenusatriangulo(int base, int altura){
           double  hipo=Math.sqrt(((base*base)+(altura*altura)));
       
       return hipo;
        
    }  public static double perimetrotriangulo(int base, int altura){
           double peri=base+altura+calculos.hipotenusatriangulo(base, altura); 
       
       return peri;
        
    }  public static double tipodetriangulo(int base, int altura){
           int area =base*altura; 
           if((base==altura)&&(base==calculos.hipotenusatriangulo(base, altura))&&(altura==calculos.hipotenusatriangulo(base, altura))){
               return 1; //siendo 1 triangulo equilatero
           }else if((base !=altura)&&(base !=calculos.hipotenusatriangulo(base, altura))&&(altura!=calculos.hipotenusatriangulo(base, altura))){
               return 2; //siendo 2 triangulo escaleno
           }else{
               return 3;//siendo 3 triagulo isosceles
           }
       
        
    }
}


