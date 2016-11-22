package org.ecuadorjug.model.person;

import java.io.Serializable;
import java.util.List;

/**
 * Created by kleber on 11/20/16.
 */
public class Contact implements Serializable {

    private static final long serialVersionUID = 7729881127774315241L;

    private List<String> emailList;
    private List<String> phoneList;
    private List<String> addressList;


    public List<String> getEmailList() {
        return emailList;
    }

    public void setEmailList(List<String> emailList) {
        this.emailList = emailList;
    }

    public List<String> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<String> phoneList) {
        this.phoneList = phoneList;
    }

    public List<String> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<String> addressList) {
        this.addressList = addressList;
    }
}
