/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icaresystem.View;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Terry
 */
public class AccountPanel extends JPanel {
    private JButton submitButton;
    private JTextField field;
    public AccountPanel() {
        submitButton = new JButton("Submit");
        field = new JTextField(20);
        this.add(new JLabel("Account"));
        this.add(field); 
        this.add(submitButton);
    }

    /**
     * @return the submitButton
     */
    public JButton getSubmitButton() {
        return submitButton;
    }

    /**
     * @param submitButton the submitButton to set
     */
    public void setSubmitButton(JButton submitButton) {
        this.submitButton = submitButton;
    }

    /**
     * @return the field
     */
    public JTextField getField() {
        return field;
    }

    /**
     * @param field the field to set
     */
    public void setField(JTextField field) {
        this.field = field;
    }
    
    
    
}
