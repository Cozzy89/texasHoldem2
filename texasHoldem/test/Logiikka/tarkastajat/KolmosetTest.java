/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.tarkastajat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Teemu
 */
public class KolmosetTest {
    
    public KolmosetTest() {
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

    /**
     * Test of tarkista method, of class Kolmoset.
     */
    @Test
    public void testTarkista() {
        System.out.println("tarkista");
        int[] maarat = null;
        TarkastettavaKasi kasi = null;
        Kolmoset instance = new Kolmoset();
        int expResult = 0;
        int result = instance.tarkista(maarat, kasi);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jarjesta method, of class Kolmoset.
     */
    @Test
    public void testJarjesta() {
        System.out.println("jarjesta");
        int kolmoset = 0;
        TarkastettavaKasi kasi = null;
        Kolmoset.jarjesta(kolmoset, kasi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
