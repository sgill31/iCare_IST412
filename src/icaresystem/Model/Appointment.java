    /**
     * @param args the command line arguments
     *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icaresystem.Model;

/**
 *
 * @author ericgutierrez
 */
public class Appointment implements AppointmentCommand{
    
    private int appointment;
    private Patient patient;
    private String appointmentDescription;
    
    public Appointment(int App, Patient inPatient, String inDesc) {
        this.appointment = App;
        this.patient = inPatient;
        this.appointmentDescription = inDesc;
    }
    void requestCheckup(){
          /**
     * method to request checkup from appointment
     */  
    }

    public int getAppointment() {
        return appointment;
    }

    public void setAppointment(int appointment) {
        this.appointment = appointment;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getAppointmentDescription() {
        return appointmentDescription;
    }

    public void setAppointmentDescription(String appointmentDescription) {
        this.appointmentDescription = appointmentDescription;
    }

    @Override
    public void newAppoinment() {
        
        //set Command to create a new appoinment based on Appointment combo box index
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void undoAppoinment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void loadAppointment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
