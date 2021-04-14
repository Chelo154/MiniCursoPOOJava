/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejercicio1.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author chelo
 */
public class Ejercicio1 {
    
    public Ejercicio1() {
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
    public void TestCuadrado()
    {
        double superficie,perimetro;
        double esperados[] = new double[]{40,100};
        double reales[] = new double[2];
        
        Cuadrado cuadrado = new Cuadrado(10);         
        
        superficie = cuadrado.superficie();
        perimetro = cuadrado.perimetro();
        
        reales[0] = perimetro;
        reales[1] = superficie;
        
        Assert.assertArrayEquals(esperados, reales, 0);
    }
    
     @Test
    public void TestTriangulo()
    {
        double superficie,perimetro;
        double esperados[] = new double[]{6,3};
        double reales[] = new double[2];
        
        Triangulo triangulo = new Triangulo(2,3);         
        
        superficie = triangulo.superficie();
        perimetro = triangulo.perimetro();
        
        reales[0] = perimetro;
        reales[1] = superficie;
        
        Assert.assertArrayEquals(esperados, reales, 0);
    }
    
    @Test
    public void TestCirculo(){
        
        double superficie,perimetro;
        double superficieEsperada = 78.53981633974483;
        double perimetroEsperado = 31.41592653589793;
        double esperados[] = new double[]{perimetroEsperado,superficieEsperada};
        double reales[] = new double[2];
        
        Circulo circulo = new Circulo(5);         
        
        superficie = circulo.superficie();
        perimetro = circulo.perimetro();
        
        reales[0] = perimetro;
        reales[1] = superficie;
        
        Assert.assertArrayEquals(esperados, reales, 0);
    }
    
    @Test
    public void TestRectangulo()
    {
        double superficie,perimetro;
        double esperados[] = new double[]{18,20};
        double reales[] = new double[2];
        
        Rectangulo rectangulo = new Rectangulo(4,5);         
        
        superficie = rectangulo.superficie();
        perimetro  = rectangulo.perimetro();
        
        reales[0] = perimetro;
        reales[1] = superficie;
        
        Assert.assertArrayEquals(esperados, reales, 0);
    }
    
    
}
