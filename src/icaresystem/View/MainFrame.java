/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icaresystem.View;

import javax.swing.*;  
import icaresystem.View.MainPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;  

/**
 *
 * @author littl
 */
public class MainFrame {
    private JFrame frame;
    private MainPanel panel;
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
        
        // add panels
        tab.addTab("Home", home);
        tab.addTab("Account", account);
        tab.addTab("Appointment", appointment);
        tab.addTab("History", history);
        tab.addTab("Insurance", insurance);
        tab.addTab("Prescription", prescription);
        
        tab.setEnabledAt(1, false);
        tab.setEnabledAt(2, false);
        tab.setEnabledAt(3, false);
        tab.setEnabledAt(4, false);
        tab.setEnabledAt(5, false);
        

        frame.getContentPane().add(tab);
        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        frame.setVisible(true);
        
        
    }
 
    public void enableTabs(boolean loggedOn) {
        getTab().setEnabledAt(1, loggedOn);
        getTab().setEnabledAt(2, loggedOn);
        getTab().setEnabledAt(3, loggedOn);
        getTab().setEnabledAt(4, loggedOn);
        getTab().setEnabledAt(5, loggedOn);
        
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
     * @return the panel
     */
    public MainPanel getPanel() {
        return panel;
    }

    /**
     * @param panel the panel to set
     */
    public void setPanel(MainPanel panel) {
        this.panel = panel;
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
