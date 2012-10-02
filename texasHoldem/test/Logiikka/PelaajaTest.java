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
public class PelaajaTest {
    
    public PelaajaTest() {
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
     * Test of addKortti method, of class Pelaaja.
     */
    @Test
    public void testAddKortti() {
        System.out.println("addKortti");
        Kortti kortti = null;
        Pelaaja instance = null;
        instance.addKortti(kortti);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKortti method, of class Pelaaja.
     */
    @Test
    public void testGetKortti() {
        System.out.println("getKortti");
        int i = 0;
        Pelaaja instance = null;
        Kortti expResult = null;
        Kortti result = instance.getKortti(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vahennaRaha method, of class Pelaaja.
     */
    @Test
    public void testVahennaRaha() {
        System.out.println("vahennaRaha");
        int maara = 0;
        Pelaaja instance = null;
        int expResult = 0;
        int result = instance.vahennaRaha(maara);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of korotus method, of class Pelaaja.
     */
    @Test
    public void testKorotus() {
        System.out.println("korotus");
        int maara = 0;
        Pelaaja instance = null;
        boolean expResult = false;
        boolean result = instance.korotus(maara);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRaha method, of class Pelaaja.
     */
    @Test
    public void testGetRaha() {
        System.out.println("getRaha");
        Pelaaja instance = null;
        int expResult = 0;
        int result = instance.getRaha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKasi method, of class Pelaaja.
     */
    @Test
    public void testGetKasi() {
        System.out.println("getKasi");
        Pelaaja instance = null;
        Kasi expResult = null;
        Kasi result = instance.getKasi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of voitto method, of class Pelaaja.
     */
    @Test
    public void testVoitto() {
        System.out.println("voitto");
        int maara = 0;
        Pelaaja instance = null;
        int expResult = 0;
        int result = instance.voitto(maara);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLuovuta method, of class Pelaaja.
     */
    @Test
    public void testSetLuovuta() {
        System.out.println("setLuovuta");
        boolean arvo = false;
        Pelaaja instance = null;
        instance.setLuovuta(arvo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLuovuta method, of class Pelaaja.
     */
    @Test
    public void testGetLuovuta() {
        System.out.println("getLuovuta");
        Pelaaja instance = null;
        boolean expResult = false;
        boolean result = instance.getLuovuta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNimi method, of class Pelaaja.
     */
    @Test
    public void testGetNimi() {
        System.out.println("getNimi");
        Pelaaja instance = null;
        String expResult = "";
        String result = instance.getNimi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nollaaKasi method, of class Pelaaja.
     */
    @Test
    public void testNollaaKasi() {
        System.out.println("nollaaKasi");
        Pelaaja instance = null;
        instance.nollaaKasi();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lisaaVoitto method, of class Pelaaja.
     */
    @Test
    public void testLisaaVoitto() {
        System.out.println("lisaaVoitto");
        int maara = 0;
        Pelaaja instance = null;
        instance.lisaaVoitto(maara);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKorotus method, of class Pelaaja.
     */
    @Test
    public void testGetKorotus() {
        System.out.println("getKorotus");
        Pelaaja instance = null;
        int expResult = 0;
        int result = instance.getKorotus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nollaaKorotus method, of class Pelaaja.
     */
    @Test
    public void testNollaaKorotus() {
        System.out.println("nollaaKorotus");
        Pelaaja instance = null;
        instance.nollaaKorotus();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nollaaToiminto method, of class Pelaaja.
     */
    @Test
    public void testNollaaToiminto() {
        System.out.println("nollaaToiminto");
        Pelaaja instance = null;
        instance.nollaaToiminto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toimi method, of class Pelaaja.
     */
    @Test
    public void testToimi() {
        System.out.println("toimi");
        Pelaaja instance = null;
        instance.toimi();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getToimi method, of class Pelaaja.
     */
    @Test
    public void testGetToimi() {
        System.out.println("getToimi");
        Pelaaja instance = null;
        boolean expResult = false;
        boolean result = instance.getToimi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
