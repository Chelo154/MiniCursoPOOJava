/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Chelo
 */
public class Indicador {
    
    private int limiteSuperior;
    private int valorActual;
    private int limiteInferior;
    
    public Indicador(){
        this.limiteInferior = 0;
        this.limiteSuperior = 100;
        this.valorActual = 100; 
    }
    
    public int getValorActual(){
        return valorActual;
    }
    
    public void aumentar(int valor){
        valorActual = (valor + valorActual > limiteSuperior)? limiteSuperior : valor + valorActual;
    }
    public void reducir(int valor){
        valorActual = (valorActual - valor < limiteInferior)? limiteInferior : valorActual - valor;
    }
    
}
