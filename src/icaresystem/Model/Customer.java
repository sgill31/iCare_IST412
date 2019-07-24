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
public class Customer {
    
    private String id;
    private long register_id;

    public Customer(String id, long register_id) {
        this.id = id;
        this.register_id = register_id;
    }
    
    
    int createTransaction(){
        int transaction = 0;
        return transaction;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getRegister_id() {
        return register_id;
    }

    public void setRegister_id(long register_id) {
        this.register_id = register_id;
    }
    

  
    
}
