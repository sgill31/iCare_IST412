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
public class Registration {

    
    private long patientID;
    private String name;

    public Registration(long patientID, String name) {
        this.patientID = patientID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
     public long getPatientID() {
            /**
     * @ID current patient ID
     */
        return patientID;
    }
    
}


