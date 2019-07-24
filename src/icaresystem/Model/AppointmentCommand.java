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

//command pattern for Appointments
public interface AppointmentCommand {
   
  public void newAppoinment();
  public void undoAppoinment();
  public void loadAppointment();
    
}
