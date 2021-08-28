/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp270821bernalv2;

/**
 *
 * @author Usuario
 */
public class JavaApp270821BERNALV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenidos al capitulo 2");
        
        double base=12;
        double altura=6;
        
        double area=determianrAreaRectangulo(base,altura);
        
        System.out.println("area del rectagulo "+ area);
        
        
        
        double perimetro=determinarPerimetroRectangulo(base,altura);
        
        System.out.println("perimetro del rectangulo es "+ perimetro);
    }

    private static double determianrAreaRectangulo(double base,double altura) {
    return base*altura;
    }
    
    private static double determinarPerimetroRectangulo(double base,double altura) {
    return 2*(base+altura);
    }
     
}
