/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestHarness;

/**
 *
 * @author Joseph Hackett
 */

import icaresystem.Model.*;
import icaresystem.Controller.*;
import icaresystem.View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
        
/**
 *
 * @author Joseph Hackett
 */
public class TestController {
    private TestView testView;
    
    /**
     *
     */
    public TestController ()
    {
        testView = new TestView(); 
        testView.getRunTestBtn().addActionListener(new addRunTestBtnListener() );
        testView.getTestFeedbackPane().setText("Click Run Test to begin test");
        testView.setVisible(true);
       
    }
    
    private class addRunTestBtnListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            runTests();
        }

        
    
    }

    /**
     *
     */
    public void runTests() {
            testView.getTestFeedbackPane().setText("");
            AccountClassTests();
            AppointmentClassTests();
            CustomerClassTests();
            HistoryClassTests();
            InsuranceClassTests();
            PatientClassTests();
            PrescriptionClassTests();
            RecordClassTests();
            RegistrationClassTests();
    }
    
    // used to print test results to the view pane 

    /**
     *
     * @param testName name of the test being run
     * @param expectedResult 
     * @param result
     * @param Status a boolean representing the status of the test. true means the test passed. 
     */
    public void PrintTestResult(String testName, String expectedResult,String result, Boolean Status){
        String msg = testView.getTestFeedbackPane().getText();
         msg = msg + "\n" + testName + "\n ExpectedResult: " + expectedResult + "\n" + "result: " + result + "\n" + "Status: " + Status + "\n -----------";
         testView.getTestFeedbackPane().setText(msg);
    }
    
    /**
     *
     */
    public void AccountClassTests(){
        String testMsg = testView.getTestFeedbackPane().getText();
        testView.getTestFeedbackPane().setText(testMsg + "Beginning Account class tests");
        
        //Constructor Test 
        final int patientID = 1;
        final String firstName = "Joe";
        final String lastName = "Hackett";
        final int age = 24; 
        final double height = 6.25;
        final String EmailAddress = "jph5396@psu.edu";
        final String address = "3456 Main St, State College, PA 12345";
        
        Account JHTestAccount = new Account(patientID, firstName, lastName, age, height, EmailAddress, address);
        String result = JHTestAccount.getPatientFullDetails();
        String expectedResult = "Name: " + firstName + " " + lastName +  "Age: " + age +  "Height: " + height  + "Email Address: " + 
                EmailAddress +  "Address: " + address;
        
        int testStatus = result.compareTo(expectedResult);
        
        if (testStatus == 0){
            PrintTestResult("Account Constructor Test",expectedResult, result, TRUE);
        }
        else{
            PrintTestResult("Account Constructor Test",expectedResult, result, FALSE);
        }
        
    
        // get patient full name test
        expectedResult = firstName + " " + lastName;
        result = JHTestAccount.getPatientFullName();
        if(expectedResult.compareTo(result) == 0)
        {
            PrintTestResult("Get Patient full name test", expectedResult, result, TRUE);
        }
        else{
            PrintTestResult("Get Patient full name test", expectedResult, result, FALSE);
        }
        
        //getFirstName Test 
        expectedResult = firstName;
        result = JHTestAccount.getFirstName();
        if(expectedResult.compareTo(result) == 0)
        {
            PrintTestResult("Get Patient first name test", expectedResult, result, TRUE);
        }
        else{
            PrintTestResult("Get Patient first name test", expectedResult, result, FALSE);
        }
        
        //setFirstNameTest 
        String newFirstName = "michael";
        JHTestAccount.setFirstName(newFirstName);
        result = JHTestAccount.getFirstName();
        expectedResult = newFirstName; 
        if(expectedResult.compareTo(result) == 0)
        {
            PrintTestResult("Set Patient first name test", expectedResult, result, TRUE);
        }
        else{
            PrintTestResult("Set Patient first name test", expectedResult, result, FALSE);
        }
        JHTestAccount.setFirstName(firstName);
        
        //getLastName 
        expectedResult = lastName; 
        result = JHTestAccount.getLastName();
        if(expectedResult.compareTo(result) == 0)
        {
            PrintTestResult("Get Patient last name test", expectedResult, result, TRUE);
        }
        else{
            PrintTestResult("Get Patient last name test", expectedResult, result, FALSE);
        }
        
        //set last name 
        expectedResult = "michael";
        JHTestAccount.setLastName(expectedResult);
        result = JHTestAccount.getLastName();
        if(expectedResult.compareTo(result) == 0)
        {
            PrintTestResult("Set Patient last name test", expectedResult, result, TRUE);
        }
        else{
            PrintTestResult("Set Patient last name test", expectedResult, result, FALSE);
        }
        JHTestAccount.setLastName(lastName);
        
        //get Age 
        expectedResult = Integer.toString(age);
        result = Integer.toString(JHTestAccount.getAge());
        if(expectedResult.compareTo(result) == 0)
        {
            PrintTestResult("get Patient age test", expectedResult, result, TRUE);
        }
        else{
            PrintTestResult("get Patient age test", expectedResult, result, FALSE);
        }
        
        //set age 
        expectedResult = Integer.toString(30);
        JHTestAccount.setAge(30);
        result = Integer.toString(JHTestAccount.getAge());
        if(expectedResult.compareTo(result) == 0)
        {
            PrintTestResult("set Patient age test", expectedResult, result, TRUE);
        }
        else{
            PrintTestResult("set Patient age test", expectedResult, result, FALSE);
        }
        
        //get height 
        expectedResult = Double.toString(height);
        result = Double.toHexString(JHTestAccount.getHeight());
        if(expectedResult.compareTo(result) == 0)
        {
            PrintTestResult("Get Patient height test", expectedResult, result, TRUE);
        }
        else{
            PrintTestResult("Get Patient height test", expectedResult, result, FALSE);
        }
        
        //set height 
        expectedResult = Double.toString(7.9);
        JHTestAccount.setHeight(7.9);
        result = Double.toString(JHTestAccount.getHeight());
        if(expectedResult.compareTo(result) == 0)
        {
            PrintTestResult("Set Patient height test", expectedResult, result, TRUE);
        }
        else{
            PrintTestResult("Set Patient height test", expectedResult, result, FALSE);
        }
        JHTestAccount.setHeight(height);
           
        //getEmailAddress
        expectedResult = EmailAddress;
        result = JHTestAccount.getEmailAddress();
        if(expectedResult.compareTo(result) == 0)
        {
            PrintTestResult("get Patient Email Address test", expectedResult, result, TRUE);
        }
        else{
            PrintTestResult("get Patient Email Address test", expectedResult, result, FALSE);
        }
        
        //setEmailAddress
        expectedResult = "NewEmail@Newmail.net";
        JHTestAccount.setEmailAddress(expectedResult);
        result = JHTestAccount.getEmailAddress();
        if(expectedResult.compareTo(result) == 0)
        {
            PrintTestResult("Set Patient Email Address test", expectedResult, result, TRUE);
        }
        else{
            PrintTestResult("Set Patient Email Address test", expectedResult, result, FALSE);
        }
        JHTestAccount.setEmailAddress(EmailAddress);
        
        //getAddress
        expectedResult = address;
        result = JHTestAccount.getAddress();
        if(expectedResult.compareTo(result) == 0)
        {
            PrintTestResult("Get Patient Address test", expectedResult, result, TRUE);
        }
        else{
            PrintTestResult("Set Patient Address test", expectedResult, result, FALSE);
        }
        
        //set address
        expectedResult = "5634 noob street";
        JHTestAccount.setAddress(expectedResult);
        result = JHTestAccount.getAddress();
        if(expectedResult.compareTo(result) == 0)
        {
            PrintTestResult("Set Patient address test", expectedResult, result, TRUE);
        }
        else{
            PrintTestResult("Set Patient address test", expectedResult, result, FALSE);
        }
        JHTestAccount.setAddress(address);
        
        // get patient ID 
        expectedResult = Integer.toString(patientID);
        result = Integer.toString(JHTestAccount.getPatientId());
        if(expectedResult.compareTo(result) == 0)
        {
            PrintTestResult("get Patient ID test", expectedResult, result, TRUE);
        }
        else{
            PrintTestResult("get Patient ID test", expectedResult, result, FALSE);
        }

        // set patient ID test 
        expectedResult = Integer.toString(9999);
        JHTestAccount.setPatientId(9999);
        result = Integer.toString(JHTestAccount.getPatientId());
        if(expectedResult.compareTo(result) == 0)
        {
            PrintTestResult("Set Patient ID test", expectedResult, result, TRUE);
        }
        else{
            PrintTestResult("Set Patient ID test", expectedResult, result, FALSE);
        }
        JHTestAccount.setPatientId(patientID);
        
        testMsg = testView.getTestFeedbackPane().getText();
        testView.getTestFeedbackPane().setText(testMsg + "End of Account class tests \n");
    }
    
    /**
     *
     */
    public void AppointmentClassTests(){
    String testMsg = testView.getTestFeedbackPane().getText();
    testView.getTestFeedbackPane().setText(testMsg + "\nBeginning Appointment class tests");
    
    //TODO: CREATE APPOINTMENT CLASS TESTS HERE
        String firstName = "first";
        String lastName = "last";
        int age = 12;
        double height = 6.1;
        String emailAddress = "last@psu.edu";
        String address = "123 Birch St";
        int patientId = 8;
        
    //Constructor tests
    final int appointment = 1;
    final Patient patient = new Patient(patientId, firstName, lastName, age, height, emailAddress, address);
    final String appointmentDescription = "new";
    Appointment testAppt = new Appointment(appointment, patient, appointmentDescription);
    Integer result = testAppt.getAppointment();
    
    Integer expectedResult = 1;
    int testStatus = result.compareTo(expectedResult);
        
        if (testStatus == 0){
            PrintTestResult("Appointment Constructor Test",expectedResult.toString(), result.toString(), TRUE);
        }
        else{
            PrintTestResult("Account Constructor Test",expectedResult.toString(), result.toString(), FALSE);
        }
       Patient p_Result = testAppt.getPatient();
       String p_ExpectedResult = "Harry";
       String p_name = p_Result.getFirstName();
      
        if (p_name == p_Result.getFirstName()){
            PrintTestResult("Appointment Patient Test",p_ExpectedResult.toString(), p_Result.toString(), TRUE);
        }
        else{
            PrintTestResult("Appointment Test",p_ExpectedResult.toString(), p_Result.toString(), FALSE);
        }
    
     testMsg = testView.getTestFeedbackPane().getText();
     testView.getTestFeedbackPane().setText(testMsg + "End of class tests");
    
    }
    
    /**
     *
     */
    public void CustomerClassTests(){
        String testMsg = testView.getTestFeedbackPane().getText();
        testView.getTestFeedbackPane().setText(testMsg + "\nBeginning Customer class tests");
        
        //TODO: CREATE CUSTOMER CLASS TESTS HERE
        final String id = "id";
        final long register_id = 12334;
        Customer customerTest = new Customer(id, register_id);
        String t_id = customerTest.getId();
        long t_register = customerTest.getRegister_id();
        
       String id_Result = customerTest.getId();
       String id_ExpectedResult = "id";
       
      
        if (id.compareTo(customerTest.getId()) == 0){
            PrintTestResult("Customer Id Test", id_ExpectedResult.toString(), id_Result.toString(), TRUE);
        }
        else{
            PrintTestResult("Customer Id Test",id_ExpectedResult.toString(), id_Result.toString(), FALSE);
        }
        long t_register_result = customerTest.getRegister_id();
        long t_register_expected = 12334;
        if (t_register_result==customerTest.getRegister_id()){
            PrintTestResult("Customer Register ID Test", t_register_result + "", t_register_expected+"", TRUE);
        }
        else{
            PrintTestResult("Customer Register ID Test", t_register_result + "", t_register_expected+"", FALSE);
        }
        
        
        testMsg = testView.getTestFeedbackPane().getText();
        testView.getTestFeedbackPane().setText(testMsg + "end customer class tests");
    }
    
    /**
     *
     */
    public void HistoryClassTests(){
    String testMsg = testView.getTestFeedbackPane().getText();
    testView.getTestFeedbackPane().setText(testMsg + "\nBeginning history class tests");
    
    //TODO: CREATE HISTORY CLASS TESTS HERE
    final int id = 12;
    final String historyType = "west";
    
    
    History t_history = new History(id, historyType);
    int h_result = t_history.getId();
    int expectedID = id;
    
    if (h_result==expectedID){
            PrintTestResult("History ID Test", h_result + "", expectedID+"", TRUE);
        }
        else{
            PrintTestResult("History ID Test", h_result + "", expectedID+"", FALSE);
        }
    
    String ht_result = t_history.getHistoryType();
    String expectedResult = historyType;
    
    if (ht_result.compareTo(expectedResult) == 0){
            PrintTestResult("History type Test", ht_result + "", expectedResult+"", TRUE);
        }
        else{
            PrintTestResult("History type Test", ht_result + "", expectedResult+"", FALSE);
        }
     testMsg = testView.getTestFeedbackPane().getText();
     testView.getTestFeedbackPane().setText(testMsg + "end history class tests");
    
     testMsg = testView.getTestFeedbackPane().getText();
     testView.getTestFeedbackPane().setText(testMsg + "end history class tests");
        
    }
    
    /**
     *
     */
    public void InsuranceClassTests(){
    String testMsg = testView.getTestFeedbackPane().getText();
    testView.getTestFeedbackPane().setText(testMsg + "\nBeginning insurance class tests");
    
    //TODO: CREATE INSURANCE CLASS TESTS HERE
    final String insuranceName = "fidelity";
    final int insuranceNumber = 122;
    Insurance test_insurance = new Insurance(insuranceName,insuranceNumber);
    String ins_Nresult = test_insurance.getInsuranceName();
    String ins_Nexpected = insuranceName;
    if (ins_Nresult.compareTo(ins_Nexpected) == 0){
            PrintTestResult("Insurance name Test", ins_Nresult + "", ins_Nexpected+"", TRUE);
        }
        else{
            PrintTestResult("Insurance name Test", ins_Nresult + "", ins_Nexpected+"", FALSE);
        }
    int insNum_test = test_insurance.getInsuranceNumber();
    int ins_result = insNum_test;
    int ins_expected = insuranceNumber;
    if (ins_result==ins_expected){
            PrintTestResult("Insurance numberTest", ins_result + "", ins_expected+"", TRUE);
        }
        else{
            PrintTestResult("Insurance number Test", ins_result + "", ins_expected+"", FALSE);
        }
    
    testMsg = testView.getTestFeedbackPane().getText();
    testView.getTestFeedbackPane().setText(testMsg + "end of insurance class tests");
    
    }
    
    /**
     *
     */
    public void PatientClassTests(){
    String testMsg = testView.getTestFeedbackPane().getText();
        testView.getTestFeedbackPane().setText(testMsg + "\nBeginning patient class tests");
        
        //Constructor Test
        String firstName = "first";
        String lastName = "last";
        int age = 12;
        double height = 6.1;
        String emailAddress = "last@psu.edu";
        String address = "123 Birch St";
        int patientId = 8;
        
        Patient testPatient = new Patient(patientId, firstName, lastName, age, height, emailAddress, address);
        String result = testPatient.getPatientFullDetails();
        String expResult = "Name: " + firstName + " " + lastName + "\n" + "Age: " + age + "\n" + "Height: " + height + "\n" + "Email Address: " + emailAddress  + 
                "\n" + "Address: " + address;
        
        int testStatus = result.compareTo(expResult);
        
        if (testStatus == 0){
            PrintTestResult("Patient Constructor Test",expResult, result, TRUE);
        }
        else{
            PrintTestResult("Patient Constructor Test",expResult, result, FALSE);
        }
        
        //getPatientFullName() Test
        expResult = firstName + " " + lastName;
        result = testPatient.getPatientFullName();
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Get Patient full name test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Get Patient full name test", expResult, result, FALSE);
        }
        
        //getFirstName() Test
        expResult = firstName;
        result = testPatient.getFirstName();
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Get first name test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Get first name test", expResult, result, FALSE);
        }
        
        //setFirstName() Test
        String newFirstName = "New";
        testPatient.setFirstName(newFirstName);
        result = testPatient.getFirstName();
        expResult = newFirstName; 
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Set Patient first name test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Set Patient first name test", expResult, result, FALSE);
        }
        testPatient.setFirstName(firstName);
        
        //getLastName() Test
        expResult = lastName;
        result = testPatient.getLastName();
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Get last name test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Get last name test", expResult, result, FALSE);
        }
        
        //setLastName() Test
        String newLastName = "New";
        testPatient.setLastName(newLastName);
        result = testPatient.getLastName();
        expResult = newLastName; 
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Set Patient last name test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Set Patient last name test", expResult, result, FALSE);
        }
        testPatient.setLastName(lastName);
        
        
        //getAge() Test
        expResult = Integer.toString(age);
        result = Integer.toString(testPatient.getAge());
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Get age test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Get age test", expResult, result, FALSE);
        }
        
        //setAge() Test
        int newAge = 88;
        testPatient.setAge(newAge);
        result = Integer.toString(testPatient.getAge());
        expResult = Integer.toString(newAge); 
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Set Patient age test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Set Patient age test", expResult, result, FALSE);
        }
        testPatient.setAge(age);
        
        //getHeight() Test
        expResult = Double.toString(height);
        result = Double.toString(testPatient.getHeight());
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Get height test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Get height test", expResult, result, FALSE);
        }
        
        //setHeight() Test
        Double newHeight = 3.5;
        testPatient.setHeight(newHeight);
        result = Double.toString(testPatient.getHeight());
        expResult = Double.toString(newHeight); 
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Set height test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Set height test", expResult, result, FALSE);
        }
        testPatient.setHeight(height);
        
        //getEmail Test
        expResult = emailAddress;
        result = testPatient.getEmailAddress();
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Get email test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Get email test", expResult, result, FALSE);
        }
        
        //setFirstName() Test
        String newEmail = "New@email.com";
        testPatient.setEmailAddress(newEmail);
        result = testPatient.getEmailAddress();
        expResult = newEmail; 
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Set email test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Set email test", expResult, result, FALSE);
        }
        testPatient.setEmailAddress(emailAddress);
        
        //getAddress() Test
        expResult = address;
        result = testPatient.getAddress();
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Get address test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Get address test", expResult, result, FALSE);
        }
        
        //setFirstName() Test
        String newAddress = "New Address";
        testPatient.setAddress(newAddress);
        result = testPatient.getAddress();
        expResult = newAddress; 
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Set address test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Set address test", expResult, result, FALSE);
        }
        testPatient.setAddress(address);
        
     testMsg = testView.getTestFeedbackPane().getText();
     testView.getTestFeedbackPane().setText(testMsg + "End patient class tests");    
    }
    
    /**
     *
     */
    public void PrescriptionClassTests(){
    String testMsg = testView.getTestFeedbackPane().getText();
    testView.getTestFeedbackPane().setText(testMsg + "\nBeginning Prescription class tests"); 
    
    //TestPatient Created
    String firstName = "first";
    String lastName = "last";
    int age = 12;
    double height = 6.1;
    String emailAddress = "last@psu.edu";
    String address = "123 Birch St";
    int patientId = 8;
        
    String display = "Display";
    Patient patient = new Patient(patientId, firstName, lastName, age, height, emailAddress, address);;
    long RX = 8;
    
    Prescription testPrep = new Prescription(display, patient, RX);
    
    String expResult;
    String result;
    
        //getDisplay Test
        expResult = display;
        result = testPrep.getDisplay();
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Get display test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Get display test", expResult, result, FALSE);
        }
        
        //setDisplay Test
        String newDisplay = "New Display";
        testPrep.setDisplay(newDisplay);
        result = testPrep.getDisplay();
        expResult = newDisplay; 
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Set display test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Set display test", expResult, result, FALSE);
        }
        testPrep.setDisplay(display);
        
        //getPatient Test
        Patient expPatient = patient;
        Patient patientResult = testPrep.getPatient();
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Get patient test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Get patient test", expResult, result, FALSE);
        }
        
        //getRX Test
        expResult = Long.toString(RX);
        result = Long.toString(testPrep.getRX());
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Get RX test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Get RX test", expResult, result, FALSE);
        }
        
        //setRX() Test
        long newRX = 9;
        testPrep.setRX(newRX);
        result = Long.toString(testPrep.getRX());
        expResult = Long.toString(newRX); 
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Set RX test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Set RX test", expResult, result, FALSE);
        }
        testPrep.setRX(RX);
    
    
    testMsg = testView.getTestFeedbackPane().getText();
    testView.getTestFeedbackPane().setText(testMsg + "end of Prescription class tests");
    }
    
    /**
     *
     */
    public void RecordClassTests(){
    String testMsg = testView.getTestFeedbackPane().getText();
    testView.getTestFeedbackPane().setText(testMsg + "\nBeginning record class tests"); 
    
        //Create TestRecord
        int record_id = 5;
        String recordName = "TestRecord";
    
        Record testRecord = new Record(record_id, recordName);
    
        String result;
        String expResult;
    
        //getID Test
        expResult = Integer.toString(record_id);
        result = Integer.toString(testRecord.getRecord_id());
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Get ID test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Get ID test", expResult, result, FALSE);
        }
        
        //setID Test
        int newRecord = 9;
        testRecord.setRecord_id(newRecord);
        result = Integer.toString(testRecord.getRecord_id());
        expResult = Integer.toString(newRecord); 
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Set ID test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Set ID test", expResult, result, FALSE);
        }
        testRecord.setRecord_id(record_id);
        
        //getRecordName Test
        expResult = recordName;
        result = testRecord.getRecordName();
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Get name test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Get name test", expResult, result, FALSE);
        }
        
        //setREcord Test
        String newRecordName = "Name";
        testRecord.setRecordName(newRecordName);
        result = testRecord.getRecordName();
        expResult = newRecordName; 
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Set name test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Set name test", expResult, result, FALSE);
        }
        testRecord.setRecordName(recordName);
    
    testMsg = testView.getTestFeedbackPane().getText();
    testView.getTestFeedbackPane().setText(testMsg + "end of record class tests");
    }
    
    /**
     *
     */
    public void RegistrationClassTests(){
    String testMsg = testView.getTestFeedbackPane().getText();
    testView.getTestFeedbackPane().setText(testMsg + "\nBeginning registration class tests");
    
    //CreateTest
    long patientID = 5;
    String name = "Name";
    
    Registration testReg = new Registration(patientID, name);
    
    String result;
    String expResult;
    
    
    //getID Test
        expResult = Long.toString(patientID);
        result = Long.toString(testReg.getPatientID());
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Get ID test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Get ID test", expResult, result, FALSE);
        }
        
        //getName Test
        expResult = name;
        result = testReg.getName();
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Get name test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Get name test", expResult, result, FALSE);
        }
        
        //setID Test
        String newName = "New";
        testReg.setName(newName);
        result = testReg.getName();
        expResult = newName; 
        if(expResult.compareTo(result) == 0)
        {
            PrintTestResult("Set name test", expResult, result, TRUE);
        }
        else{
            PrintTestResult("Set name test", expResult, result, FALSE);
        }
        testReg.setName(name);
        
        
    testMsg = testView.getTestFeedbackPane().getText();
    testView.getTestFeedbackPane().setText(testMsg + "end of registration class tests");
    }
            
}
