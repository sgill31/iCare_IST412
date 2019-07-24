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
public class Insurance {
    
    private String insuranceName;
    private int insuranceNumber;

    public Insurance(String insuranceName, int insuranceNumber) {
        this.insuranceName = insuranceName;
        this.insuranceNumber = insuranceNumber;
    }
    
    void calculateClaim(){
        String ClaimId = insuranceName + insuranceNumber;
            /**
     * calculate claim based on name and number
     */
        
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public int getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
    
}
