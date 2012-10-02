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
public class KorttiTest {
    
    public KorttiTest() {
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
     * Test of getArvo method, of class Kortti.
     */
    @Test
    public void testGetArvo() {
        System.out.println("getArvo");
        Kortti instance = null;
        int expResult = 0;
        int result = instance.getArvo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaa method, of class Kortti.
     */
    @Test
    public void testGetMaa_0args() {
        System.out.println("getMaa");
        Kortti instance = null;
        int expResult = 0;
        int result = instance.getMaa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaa method, of class Kortti.
     */
    @Test
    public void testGetMaa_boolean() {
        System.out.println("getMaa");
        boolean lyh = false;
        Kortti instance = null;
        String expResult = "";
        String result = instance.getMaa(lyh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
