/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka;

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
public class PakkaTest {
    
    public PakkaTest() {
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
     * Test of Sekoita method, of class Pakka.
     */
    @Test
    public void testSekoita() {
        System.out.println("Sekoita");
        Pakka instance = new Pakka();
        instance.Sekoita();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Jaa method, of class Pakka.
     */
    @Test
    public void testJaa() {
        System.out.println("Jaa");
        Pakka instance = new Pakka();
        Kortti expResult = null;
        Kortti result = instance.Jaa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
