/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejercicio3.CasaDeCambio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chelo
 */
public class Ejercicio3 {
    
    public Ejercicio3() {
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
    public void test1(){
        CasaDeCambio casa = new CasaDeCambio(149, 150, 100, 100);
        
        double expected = 100;
        
        double dolares = casa.comprarDolares(15000);
        
        Assert.assertEquals(expected, dolares, 0);
    }
    
    @Test
    public void test2(){
        CasaDeCambio casa = new CasaDeCambio(149, 150, 100, 100);
        
        double expected = 14900;
        
        double pesos = casa.venderDolares(100);
        
        Assert.assertEquals(expected,pesos, 0);
        
    }
    
    @Test
    public void test3(){
        
        CasaDeCambio casa = new CasaDeCambio(149, 150, 100, 100);
        
        double expected = 0;
        
        double dolares = casa.comprarDolares(7500);
        
        Assert.assertEquals(expected, dolares, 0);
        
    }
    
    @Test
    public void test4(){
        
        CasaDeCambio casa = new CasaDeCambio(149, 150, 100, 100);
        
        double expected = 0;
        
        double dolares = casa.venderDolares(50);
        
        Assert.assertEquals(expected, dolares, 0);
        
    }
    
    @Test
    public void test5(){
        CasaDeCambio casa = new CasaDeCambio(149, 150, 100, 100);
        
        boolean puedoComprar = casa.consultarCompra(50);
        
        Assert.assertFalse("No deberia poder comprar", puedoComprar);
        
    }
    
    @Test
    public void test6(){
        CasaDeCambio casa = new CasaDeCambio(149, 150, 100, 100);
        
        boolean puedoVender = casa.consultarVenta(50);
        
        Assert.assertFalse("No deberia poder comprar", puedoVender);
        
    }
    
    @Test
    public void test7(){
        CasaDeCambio casa = new CasaDeCambio(149, 150, 100, 100);
        
        boolean puedoVender = casa.consultarVenta(100);
        
        Assert.assertTrue("Deberia poder comprar", puedoVender);
        
    }
    
    
}
