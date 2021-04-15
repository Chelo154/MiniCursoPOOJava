/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author chelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {        
        calculoEstructurado();
        calculoHibrido();
        calculoConObjetos();
        
    }
    
    /*
        Se tienen dos cuadrados
         1 -  de lado 10
         2 -  de lado 20
         perimetro
         superficie
    */   
    
    private static void calculoConObjetos(){
        
         System.out.println("===============CALCULO CON OBJETOS==============");
         
         Cuadrado cuadrado1 = new Cuadrado(10); 
        
         Cuadrado cuadrado2 = new Cuadrado(20);
         
         System.out.println(cuadrado1.informacion());
         System.out.println(cuadrado2.informacion());
        
         System.out.println("=================================================");
    }
    
    private static void calculoHibrido()
    {
        System.out.println("===============CALCULO HIBRIDO==============");
        
        Cuadrado cuadrado1 = new Cuadrado(10); 
        
        Cuadrado cuadrado2 = new Cuadrado(20); 
        
        double perimetro1, perimetro2, superficie1, superficie2;
        
        perimetro1 = cuadrado1.getLado() * 4;
        perimetro2 = cuadrado2.getLado() * 4;
        
        superficie1 = cuadrado1.getLado() * cuadrado1.getLado();        
        superficie2 = cuadrado2.getLado() * cuadrado2.getLado();
        
        System.out.println("perimetro 1 = "+perimetro1);
        System.out.println("perimetro 2 = "+perimetro2);
        System.out.println("superficie 1 = "+superficie1);
        System.out.println("superficie 2 = "+superficie2);
        
        
        System.out.println("=================================================");
        
    }
    
    private static void calculoEstructurado(){
        
        System.out.println("===============CALCULO ESTRUCTURADO==============");
        double lado1 = 10;
        double lado2 = 20;
        double perimetro1, perimetro2, superficie1, superficie2;
        
        perimetro1 = lado1 * 4;
        perimetro2 = lado2 * 4;
        
        superficie1 = lado1 * lado1;
        superficie2 = lado2 * lado2;
        
        System.out.println("perimetro 1 = "+perimetro1);
        System.out.println("perimetro 2 = "+perimetro2);
        System.out.println("superficie 1 = "+superficie1);
        System.out.println("superficie 2 = "+superficie2);
        
        System.out.println("=================================================");
        
    }
}
