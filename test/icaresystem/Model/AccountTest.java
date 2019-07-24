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
public class AccountTest {
    
    private static double height = 62.00;
    private static int age = 18; 
    private static String firstName = "firstName";
    private static  String lastName = "lastName";
    private static String emailAddress = "test@test.com";
    private static String address = "555 Place Drive";
    
    private int count = 0;
    
    private static Account mAccount;
    
    public AccountTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        mAccount = new Account(1, firstName, lastName, age, height, emailAddress, address); 
    }
        
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getPatientFullDetails method, of class Account.
     */
    @Test
    public void testGetPatientFullDetails() {
        //Arrange
        String expResult = "Name: " + firstName+ " " + lastName+ "Age: " + age + "Height: " + height+ "Email Address: "+ emailAddress + "Address: " + address;
        
        //Act
        String result = mAccount.getPatientFullDetails();
        
        //Assert
        assertEquals(expResult, result);
    
    }

    /**
     * Test of getPatientFullName method, of class Account.
     */
    @Test
    public void testGetPatientFullName() {
        System.out.println("getPatientFullName");
        Account instance = null;
        String expResult = "";
        String result = instance.getPatientFullName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Account.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Account instance = null;
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Account.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Account instance = null;
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Account.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Account instance = null;
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Account.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Account instance = null;
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Account.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Account instance = null;
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Account.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        Account instance = null;
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class Account.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Account instance = null;
        double expResult = 0.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class Account.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        double height = 0.0;
        Account instance = null;
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailAddress method, of class Account.
     */
    @Test
    public void testGetEmailAddress() {
        System.out.println("getEmailAddress");
        Account instance = null;
        String expResult = "";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmailAddress method, of class Account.
     */
    @Test
    public void testSetEmailAddress() {
        System.out.println("setEmailAddress");
        String emailAddress = "";
        Account instance = null;
        instance.setEmailAddress(emailAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Account.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Account instance = null;
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class Account.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Account instance = null;
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientId method, of class Account.
     */
    @Test
    public void testGetPatientId() {
        System.out.println("getPatientId");
        Account instance = null;
        int expResult = 0;
        int result = instance.getPatientId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatientId method, of class Account.
     */
    @Test
    public void testSetPatientId() {
        System.out.println("setPatientId");
        int patientId = 0;
        Account instance = null;
        instance.setPatientId(patientId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
