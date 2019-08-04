
package icaresystem.Controller;

import icaresystem.View.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JButton;

/**
 *
 * @author Joseph Hackett
 */
public class MainController {
    Connection conn;
    Statement stat;
    public MainController(String title) {
        // create main frame
        MainFrame frame = new MainFrame(title);
        
        // Connect to databasee
        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/icare", "littlejkim", "4johnkim");
            System.out.println("Connection successful");
            stat = conn.createStatement(); 
        } catch (Exception e) {
            System.out.println("Exception : " + e.toString());
        }
        
        
        // make new account
        frame.getAccount().getSubmitButton().addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                String text = "'" + frame.getAccount().getField().getText() + "'";
                String query = "INSERT INTO ACCOUNT (NAME) values (" + text + ")";
                System.out.println(text);
                try {
                    stat.executeUpdate(query);
                    System.out.println("Successfully inserted");
                    stat.close();
                } catch (Exception ex) {
                    System.out.println("Exception caught" + ex.toString());
                }
            }
        }); 
        
        // authenticate id and password from database
        frame.getHome().getSubmit().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pwd = String.valueOf(frame.getHome().getPassword().getPassword());
                if(frame.getHome().getId().getText().equals("littlejkim")) {
                    if(pwd.equals("4johnkim")) {
                        frame.getHome().getLoggedOn().setText("User is logged on"); 
                        frame.enableTabs(true);
                    } else {
                        frame.getHome().getLoggedOn().setText("Password is incorrect");
                        frame.enableTabs(false);
                    }
                } else {
                    frame.getHome().getLoggedOn().setText("Username is incorrect");
                    frame.enableTabs(false);
                }
            }
        });
        
        // make new appointment
        frame.getAppointment().getSubmitButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JButton b = (JButton)e.getSource();
               b.isSelected();
               //get combo box index value to execute Appointment command
            }
        }
        
        );
        
                
                
    }
}
