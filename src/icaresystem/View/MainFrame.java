/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icaresystem.View;

import javax.swing.*;  
import java.awt.BorderLayout;
import java.awt.FlowLayout;  

/**
 *
 * @author littl
 */
public class MainFrame {
    private JFrame frame;
    private HomePanel home;
    private AccountPanel account;
    private AppointmentPanel appointment;
    private HistoryPanel history;
    private InsurancePanel insurance;
    private PrescriptionPanel prescription;
    private JTabbedPane tab;
    
    
    public MainFrame(String title) {
       
        frame = new JFrame(title);
        tab = new JTabbedPane();
        
        // create panels
        home = new HomePanel();
        account = new AccountPanel();
        appointment = new AppointmentPanel();  
        history = new HistoryPanel(); 
        insurance = new InsurancePanel();
        prescription = new PrescriptionPanel();
        
        // list of panels
        String[] listOfPanels = new String[] {"Home", "Account", "Appointment", "History", "Insurance", "Prescription"};
        JPanel[] panels = new JPanel[]{home, account, appointment, history, insurance, prescription};
        
        // add panels
        for(int i = 0; i < panels.length; i++) {
            tab.addTab(listOfPanels[i], panels[i]);
        }
         
        for(int i = 1; i <= 5; i++) {
            tab.setEnabledAt(i, false);
        }

        frame.getContentPane().add(tab);
        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        frame.setVisible(true);
   
    }
 
    public void enableTabs(boolean loggedOn) {
        for(int i = 1; i <= 5; i++) {
            getTab().setEnabledAt(i, loggedOn);
        }
       
    }
    /**
     * @return the frame
     */
    public JFrame getFrame() {
        return frame;
    }

    /**
     * @param frame the frame to set
     */
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    /**
     * @return the home
     */
    public HomePanel getHome() {
        return home;
    }

    /**
     * @param home the home to set
     */
    public void setHome(HomePanel home) {
        this.home = home;
    }

    /**
     * @return the account
     */
    public AccountPanel getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(AccountPanel account) {
        this.account = account;
    }

    /**
     * @return the appointment
     */
    public AppointmentPanel getAppointment() {
        return appointment;
    }

    /**
     * @param appointment the appointment to set
     */
    public void setAppointment(AppointmentPanel appointment) {
        this.appointment = appointment;
    }

    /**
     * @return the history
     */
    public HistoryPanel getHistory() {
        return history;
    }

    /**
     * @param history the history to set
     */
    public void setHistory(HistoryPanel history) {
        this.history = history;
    }

    /**
     * @return the insurance
     */
    public InsurancePanel getInsurance() {
        return insurance;
    }

    /**
     * @param insurance the insurance to set
     */
    public void setInsurance(InsurancePanel insurance) {
        this.insurance = insurance;
    }

    /**
     * @return the prescription
     */
    public PrescriptionPanel getPrescription() {
        return prescription;
    }

    /**
     * @param prescription the prescription to set
     */
    public void setPrescription(PrescriptionPanel prescription) {
        this.prescription = prescription;
    }

    /**
     * @return the tab
     */
    public JTabbedPane getTab() {
        return tab;
    }

    /**
     * @param tab the tab to set
     */
    public void setTab(JTabbedPane tab) {
        this.tab = tab;
    }
    
    
}
