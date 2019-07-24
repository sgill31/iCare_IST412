/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icaresystem.Model;

/**
 *
 * @author ericgutierrez
 */
public class Prescription {
    
    private String display;
    private Patient patient;
    private long RX;

    public Prescription(String display, Patient patient, long RX) {
        this.display = display;
        this.patient = patient;
        this.RX = RX;
    }

    public String getDisplay() {
            /**
     * view Prescription information
     */
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public long getRX() {
        return RX;
    }

    public void setRX(long RX) {
        this.RX = RX;
    }
    
 
    
}
