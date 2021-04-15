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
public class Cuadrado {
    
    /*
        1- Encapsulamiento :
             - Los atributos de un objeto SOLAMENTE deben ser administrados por el propio objeto
             - Las acciones que definan al objeto y puedan llevarse a cabo por el objeto deben definirse en el objeto 
             
    */    
    private double lado;
    
    // Constructor
    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    //Getter
    public double getLado(){
        return lado;
    }
    
    //Setter
    public void setLado(double nuevoLado){   
        
        if(nuevoLado <= 0 );
        else lado = nuevoLado;
        
    }
    
    public double perimetro(){
        return lado * 4;
    }
    
    public double superficie(){
        return lado * lado;
    }
    
    public String informacion(){
        return String.format("Cuadrado\n lado = %.2f\n perimetro = %.2f\n Superficie = %.2f ",lado,perimetro(),superficie());
    }
    
}
