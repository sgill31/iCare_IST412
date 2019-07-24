/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icaresystem.Model;

import java.util.ArrayList;

/**
 *
 * @author Shane
 */
public final class AccountList {

    private ArrayList<Account> accountList = new ArrayList<Account>();

    public AccountList() {
        populateList();
    }

    public void populateList() {
        double height = 62.00;
        int age = 18;
        String firstName = "firstName";
        String lastName = "lastName";
        String emailAddress = "test@test.com";
        String address = "555 Place Drive";

        Account Account1 = new Account(1, firstName, lastName, age, height, emailAddress, address);
        Account Account2 = new Account(2, firstName, lastName, age, height, emailAddress, address);
        Account Account3 = new Account(3, firstName, lastName, age, height, emailAddress, address);
        
        getAccountList().add(Account1);
        getAccountList().add(Account2);
        getAccountList().add(Account3);
    }

    /**
     * @return the accountList
     */
    public ArrayList<Account> getAccountList() {
        return accountList;
    }
}
