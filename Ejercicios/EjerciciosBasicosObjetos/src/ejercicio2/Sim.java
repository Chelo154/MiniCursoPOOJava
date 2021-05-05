/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author chelo
 */
public class Sim {
    
    private String nombre;
    private Indicador salud;
    private Indicador higiene;
    private Indicador hambre;
    private Indicador diversion;
    
    public Sim (String nombre){
        this.nombre = nombre;
        this.salud = new Indicador();
        this.higiene = new Indicador();
        this.diversion = new Indicador();
        this.hambre = new Indicador();
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud.getValorActual();
    }

    public int getHigiene() {
        return higiene.getValorActual();
    }

    public int getHambre() {
        return hambre.getValorActual();
    }

    public int getDiversion() {
        return diversion.getValorActual();
    }
    
    public void comer(){        
        hambre.aumentar(20);
        salud.reducir(10);
        higiene.reducir(20);      
    }
    
    public void duchar(){
        higiene.aumentar(30);
    }
    
    public void correr(){
        salud.aumentar(10);
        diversion.aumentar(10);
        hambre.reducir(20);
        higiene.reducir(10);
    }
    
    public void dormir(){
        salud.aumentar(10);
        diversion.reducir(10);
        hambre.reducir(10);
        higiene.reducir(10);
    }
    
    
    
}
