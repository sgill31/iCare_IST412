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
public class Appointment {
    
    private int appointment;
    private Account patient;
    private String appointmentDescription;
    
    public Appointment(int App, Account inPatient, String inDesc) {
        this.appointment = App;
        this.patient = inPatient;
        this.appointmentDescription = inDesc;
    }

    public int getAppointment() {
        return appointment;
    }

    public void setAppointment(int appointment) {
        this.appointment = appointment;
    }

    public Account getPatient() {
        return patient;
    }

    public void setPatient(Account patient) {
        this.patient = patient;
    }

    public String getAppointmentDescription() {
        return appointmentDescription;
    }

    public void setAppointmentDescription(String appointmentDescription) {
        this.appointmentDescription = appointmentDescription;
    }
  
}
