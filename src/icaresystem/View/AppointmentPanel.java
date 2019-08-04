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
        initializeComboBoxes();    
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

    private void initializeComboBoxes() {
        String[] comBoxA = new String[] {"New Appointment", "View Appointment", "Edit Appointment"};
        String[] comBoxB = new String[] {"Patient", "Medical Staff", "Adminstration"};
        String[] comBoxC = new String[] {"is", "not", "with"};
        String[] comBoxD = new String[] {"iCare", "3rd Party", "New Entry"};
        
        comboBoxA = new JComboBox();
        comboBoxB = new JComboBox();
        comboBoxC = new JComboBox();
        comboBoxD = new JComboBox();
        
        for(String str : comBoxA) {
            comboBoxA.addItem(str);
        }
        
        for(String str : comBoxB) {
            comboBoxB.addItem(str);
        }
        
        for(String str : comBoxC) {
            comboBoxC.addItem(str);
        }
        
        for(String str : comBoxD) {
            comboBoxD.addItem(str);
        }
     
        this.add(comboBoxA);
        labelA = new JLabel(" with condition?");
        this.add(labelA);
        this.add(comboBoxB);
        this.add(comboBoxC);
        this.add(comboBoxD);
        
        submitButton = new JButton("Submit");
        this.add(submitButton);
    }

}
