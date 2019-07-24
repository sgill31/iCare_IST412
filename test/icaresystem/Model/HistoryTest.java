/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icaresystem.Model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joseph Hackett
 */
public class HistoryTest {
    
    public HistoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of generateHistory method, of class History.
     */
    @Test
    public void testGenerateHistory() {
        System.out.println("generateHistory");
        History instance = null;
        instance.generateHistory();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class History.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        History instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class History.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        History instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHistoryType method, of class History.
     */
    @Test
    public void testGetHistoryType() {
        System.out.println("getHistoryType");
        History instance = null;
        String expResult = "";
        String result = instance.getHistoryType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHistoryType method, of class History.
     */
    @Test
    public void testSetHistoryType() {
        System.out.println("setHistoryType");
        String historyType = "";
        History instance = null;
        instance.setHistoryType(historyType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
