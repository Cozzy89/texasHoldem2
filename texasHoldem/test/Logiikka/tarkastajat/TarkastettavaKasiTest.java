/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka.tarkastajat;

import Logiikka.Kasi;
import Logiikka.Kortti;
import Logiikka.Poyta;
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
public class TarkastettavaKasiTest {
    
    public TarkastettavaKasiTest() {
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
     * Test of laitaKateenKaikkiKortit method, of class TarkastettavaKasi.
     */
    @Test
    public void testLaitaKateenKaikkiKortit() {
        System.out.println("laitaKateenKaikkiKortit");
        Kasi kasi = null;
        Poyta poyta = null;
        TarkastettavaKasi instance = null;
        instance.laitaKateenKaikkiKortit(kasi, poyta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKortti method, of class TarkastettavaKasi.
     */
    @Test
    public void testGetKortti() {
        System.out.println("getKortti");
        int i = 0;
        TarkastettavaKasi instance = null;
        Kortti expResult = null;
        Kortti result = instance.getKortti(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArvo method, of class TarkastettavaKasi.
     */
    @Test
    public void testSetArvo() {
        System.out.println("setArvo");
        int arvo = 0;
        TarkastettavaKasi instance = null;
        instance.setArvo(arvo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArvo method, of class TarkastettavaKasi.
     */
    @Test
    public void testGetArvo() {
        System.out.println("getArvo");
        TarkastettavaKasi instance = null;
        int expResult = 0;
        int result = instance.getArvo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jarjestaArvollaPienimmastaSuurimpaan method, of class TarkastettavaKasi.
     */
    @Test
    public void testJarjestaArvollaPienimmastaSuurimpaan_0args() {
        System.out.println("jarjestaArvollaPienimmastaSuurimpaan");
        TarkastettavaKasi instance = null;
        instance.jarjestaArvollaPienimmastaSuurimpaan();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jarjestaArvollaPienimmastaSuurimpaan method, of class TarkastettavaKasi.
     */
    @Test
    public void testJarjestaArvollaPienimmastaSuurimpaan_int() {
        System.out.println("jarjestaArvollaPienimmastaSuurimpaan");
        int alkaen = 0;
        TarkastettavaKasi instance = null;
        instance.jarjestaArvollaPienimmastaSuurimpaan(alkaen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jarjestaArvollaSuurimmastaPienimpaan method, of class TarkastettavaKasi.
     */
    @Test
    public void testJarjestaArvollaSuurimmastaPienimpaan_0args() {
        System.out.println("jarjestaArvollaSuurimmastaPienimpaan");
        TarkastettavaKasi instance = null;
        instance.jarjestaArvollaSuurimmastaPienimpaan();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jarjestaArvollaSuurimmastaPienimpaan method, of class TarkastettavaKasi.
     */
    @Test
    public void testJarjestaArvollaSuurimmastaPienimpaan_int() {
        System.out.println("jarjestaArvollaSuurimmastaPienimpaan");
        int alkaen = 0;
        TarkastettavaKasi instance = null;
        instance.jarjestaArvollaSuurimmastaPienimpaan(alkaen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vaihdaPaikat method, of class TarkastettavaKasi.
     */
    @Test
    public void testVaihdaPaikat() {
        System.out.println("vaihdaPaikat");
        int paikasta = 0;
        int paikkaan = 0;
        TarkastettavaKasi instance = null;
        instance.vaihdaPaikat(paikasta, paikkaan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of siirraAlkuun method, of class TarkastettavaKasi.
     */
    @Test
    public void testSiirraAlkuun() {
        System.out.println("siirraAlkuun");
        int paikasta = 0;
        TarkastettavaKasi instance = null;
        instance.siirraAlkuun(paikasta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of siirraLoppuun method, of class TarkastettavaKasi.
     */
    @Test
    public void testSiirraLoppuun() {
        System.out.println("siirraLoppuun");
        int paikasta = 0;
        TarkastettavaKasi instance = null;
        instance.siirraLoppuun(paikasta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of siirra method, of class TarkastettavaKasi.
     */
    @Test
    public void testSiirra() {
        System.out.println("siirra");
        int paikasta = 0;
        int paikkaan = 0;
        TarkastettavaKasi instance = null;
        instance.siirra(paikasta, paikkaan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of siirraArvollaAlkuun method, of class TarkastettavaKasi.
     */
    @Test
    public void testSiirraArvollaAlkuun() {
        System.out.println("siirraArvollaAlkuun");
        int arvo = 0;
        TarkastettavaKasi instance = null;
        instance.siirraArvollaAlkuun(arvo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaara method, of class TarkastettavaKasi.
     */
    @Test
    public void testGetMaara() {
        System.out.println("getMaara");
        TarkastettavaKasi instance = null;
        int expResult = 0;
        int result = instance.getMaara();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
