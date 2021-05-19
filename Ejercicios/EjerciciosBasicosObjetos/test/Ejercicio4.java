/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejercicio1.*;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chelo
 */
public class Ejercicio4 {
    
    public Ejercicio4() {
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
        double superficiesEsperadas[] = new double[]{100,78.53981633974483,3,20};
        double perimetrosEsperados[] = new double[]{40,31.41592653589793,6,18};
        double superficies[]= new double[4];
        double perimetros[] = new double[4];
        int i = 0;
        
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        
        figuras.add(new Cuadrado(10));
        figuras.add(new Circulo(5));
        figuras.add(new Triangulo(2,3));
        figuras.add(new Rectangulo(4,5));
        
        for(FiguraGeometrica figura : figuras){
            superficies[i] = figura.superficie();
            perimetros[i] = figura.perimetro();
            i++;
        }
        
        assertArrayEquals(perimetrosEsperados, perimetros, 0);
        assertArrayEquals(superficiesEsperadas, superficies, 0);
    }
}
