/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Chelo
 */
public class CasaDeCambio {
    
    private double precioCompra;
    private double precioVenta;
    private double cantidadMinimaCompra;
    private double cantidadMinimaVenta;
    
    public CasaDeCambio(double precioCompra, double precioVenta, double cantidadMinimaCompra, double cantidadMinimaVenta){
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantidadMinimaCompra = cantidadMinimaCompra;
        this.cantidadMinimaVenta = cantidadMinimaVenta;
    }
    
    public double comprarDolares(double montoEnPesos){
        double montoEnDolares = pasarADolares(montoEnPesos);
        
        return (consultarCompra(montoEnDolares))? montoEnDolares : 0;
    }
    
    public double venderDolares(double montoEnDolares){
        return (consultarVenta(montoEnDolares))? pasarAPesos(montoEnDolares) : 0;
    }
    
    public boolean consultarCompra(double montoEnDolares){
        return montoEnDolares >= cantidadMinimaCompra;
    }
    
    public boolean consultarVenta(double montoEnDolares){
        return montoEnDolares >= cantidadMinimaVenta;
    }
    
    
    //Internos de la casa de cambio
    private double pasarADolares(double montoEnPesos){
        return montoEnPesos / precioVenta;
    }
    
    private double pasarAPesos(double montoEnDolares){
        return montoEnDolares * precioCompra;
    }
    
}
