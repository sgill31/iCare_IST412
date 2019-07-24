/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icaresystem.View;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Eric Gutierrez
 */

//RuleB Builder Design Pattern
public class AppointmentPanel extends JPanel {
    private JComboBox comboBoxA, comboBoxB, comboBoxC, comboBoxD;
    private JLabel labelA;
    private FlowLayout fl;
    private JButton submitButton;
  
    public AppointmentPanel() {
        fl = new FlowLayout();
        setLayout(fl);
        
        comboBoxA = new JComboBox();
        comboBoxA.addItem("New Appointment");
        comboBoxA.addItem("View Appointment");
        comboBoxA.addItem("Edit Appointment");
        this.add(comboBoxA);
        
        labelA = new JLabel(" with condition?");
        this.add(labelA);
        
        comboBoxB = new JComboBox();
        comboBoxB.addItem("Patient");
        comboBoxB.addItem("Medical Staff");
        comboBoxB.addItem("Administration");
        this.add(comboBoxB);
        
        comboBoxC = new JComboBox();
        comboBoxC.addItem("is");
        comboBoxC.addItem("not");
        comboBoxC.addItem("with");
        this.add(comboBoxC);
        
        comboBoxD = new JComboBox();
        comboBoxD.addItem("ICare ");
        comboBoxD.addItem("3rd Party");
        comboBoxD.addItem("New Entry");
        this.add(comboBoxD);
        
        submitButton = new JButton("Submit");
        this.add(submitButton);
       
    }

    /**
     * @return the comboBoxA
     */
    public JComboBox getComboBoxA() {
        return comboBoxA;
    }

    /**
     * @param comboBoxA the comboBoxA to set
     */
    public void setComboBoxA(JComboBox comboBoxA) {
        this.comboBoxA = comboBoxA;
    }

    /**
     * @return the comboBoxB
     */
    public JComboBox getComboBoxB() {
        return comboBoxB;
    }

    /**
     * @param comboBoxB the comboBoxB to set
     */
    public void setComboBoxB(JComboBox comboBoxB) {
        this.comboBoxB = comboBoxB;
    }

    /**
     * @return the comboBoxC
     */
    public JComboBox getComboBoxC() {
        return comboBoxC;
    }

    /**
     * @param comboBoxC the comboBoxC to set
     */
    public void setComboBoxC(JComboBox comboBoxC) {
        this.comboBoxC = comboBoxC;
    }

    /**
     * @return the comboBoxD
     */
    public JComboBox getComboBoxD() {
        return comboBoxD;
    }

    /**
     * @param comboBoxD the comboBoxD to set
     */
    public void setComboBoxD(JComboBox comboBoxD) {
        this.comboBoxD = comboBoxD;
    }

    /**
     * @return the buttonA
     */
    public JButton getSubmitButton() {
        return submitButton;
    }

    /**
     * @param buttonA the buttonA to set
     */
    public void setSubmitButton(JButton buttonA) {
        this.submitButton = buttonA;
    }

}
