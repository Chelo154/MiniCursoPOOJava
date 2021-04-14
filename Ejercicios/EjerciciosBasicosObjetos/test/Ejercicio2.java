/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejercicio2.Sim;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chelo
 */
public class Ejercicio2 {
    
    public Ejercicio2() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void TestSim(){
         Sim fiso = new Sim("Fiso");
         int esperado[] ={100,60,80,100}; 
         
         fiso.correr();
         fiso.correr();
         
         int real [] = {
             fiso.getSalud(),
             fiso.getHambre(),
             fiso.getHigiene(),
             fiso.getDiversion()
         };
         
         Assert.assertArrayEquals(esperado, real);
    }
    
    @Test
    public void TestSim2(){
        Sim lucia = new Sim("Lucia");
        
        int esperado[] = {90,100,100,100};         
       
        lucia.correr();
        lucia.comer();
        lucia.duchar();
        
        int real[] ={
            lucia.getSalud(),
            lucia.getHambre(),
            lucia.getHigiene(),
            lucia.getDiversion()
        };
        
        Assert.assertArrayEquals(esperado, real);
    }
    
    @Test
    public void TestSim3(){
        Sim fiso = new Sim("Fiso");
        
        int esperado[] = {100,60,100,80};  
        
        fiso.correr();
        fiso.dormir();
        fiso.dormir();
        fiso.duchar();        
        
         int real [] = {
             fiso.getSalud(),
             fiso.getHambre(),
             fiso.getHigiene(),
             fiso.getDiversion()
         };
         
         Assert.assertArrayEquals(esperado, real);
        
    }
}
