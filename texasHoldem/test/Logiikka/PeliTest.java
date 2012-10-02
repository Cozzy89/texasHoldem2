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
public class PeliTest {
    
    public PeliTest() {
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
     * Test of pelaa method, of class Peli.
     */
    @Test
    public void testPelaa() {
        System.out.println("pelaa");
        Peli instance = null;
        instance.pelaa();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tulostaKasi method, of class Peli.
     */
    @Test
    public void testTulostaKasi() {
        System.out.println("tulostaKasi");
        Pelaaja pelaaja = null;
        Peli instance = null;

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of uusiPakka method, of class Peli.
     */
    @Test
    public void testUusiPakka() {
        System.out.println("uusiPakka");
        Peli instance = null;
        instance.uusiPakka();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
