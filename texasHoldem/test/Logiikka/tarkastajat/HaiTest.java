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
public class HaiTest {
    
    public HaiTest() {
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
     * Test of tarkista method, of class Hai.
     */
    @Test
    public void testTarkista() {
        System.out.println("tarkista");
        int[] maarat = null;
        TarkastettavaKasi kasi = null;
        Hai instance = new Hai();
        int expResult = 0;
        int result = instance.tarkista(maarat, kasi);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jarjesta method, of class Hai.
     */
    @Test
    public void testJarjesta() {
        System.out.println("jarjesta");
        TarkastettavaKasi kasi = null;
        Hai.jarjesta(kasi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
