package org.ecuadorjug.model.person;

import org.ecuadorjug.model.products.Account;

import java.io.Serializable;
import java.util.List;

/**
 * Created by kleber on 11/20/16.
 */
public class Person implements Serializable {

    private static final long serialVersionUID = -3354821795223128983L;

    private String id;
    private String firstName;
    private String lastName;
    private List<Contact> contactList;
    private List<Account> accountList;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }
}
