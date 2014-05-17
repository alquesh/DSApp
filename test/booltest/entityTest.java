/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booltest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alquesh
 */
public class entityTest {
    
    public entityTest() {
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
     * Test of generate method, of class entity.
     */
    @Test
    public void testGenerate() {
        System.out.println("generate");
        entity instance = null;
        instance.generate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printsheet method, of class entity.
     */
    @Test
    public void testPrintsheet() {
        System.out.println("printsheet");
        entity instance = null;
        instance.printsheet();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getname method, of class entity.
     */
    @Test
    public void testGetname() {
        System.out.println("getname");
        entity instance = null;
        String expResult = "";
        String result = instance.getname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getini method, of class entity.
     */
    @Test
    public void testGetini() {
        System.out.println("getini");
        entity instance = null;
        int expResult = 0;
        int result = instance.getini();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modini method, of class entity.
     */
    @Test
    public void testModini() {
        System.out.println("modini");
        int i = 0;
        entity instance = null;
        instance.modini(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getstat method, of class entity.
     */
    @Test
    public void testGetstat() {
        System.out.println("getstat");
        int i = 0;
        entity instance = null;
        int expResult = 0;
        int result = instance.getstat(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getlep method, of class entity.
     */
    @Test
    public void testGetlep() {
        System.out.println("getlep");
        entity instance = null;
        int expResult = 0;
        int result = instance.getlep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modlep method, of class entity.
     */
    @Test
    public void testModlep() {
        System.out.println("modlep");
        int i = 0;
        entity instance = null;
        instance.modlep(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gettot method, of class entity.
     */
    @Test
    public void testGettot() {
        System.out.println("gettot");
        entity instance = null;
        boolean expResult = false;
        boolean result = instance.gettot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of totcheck method, of class entity.
     */
    @Test
    public void testTotcheck() {
        System.out.println("totcheck");
        entity instance = null;
        instance.totcheck();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
