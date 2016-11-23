package org.ecuadorjug.model.products;

import java.io.Serializable;

/**
 * Created by Kleber Ayala on 11/20/16.
 */
public class Account implements Serializable{

    private static final long serialVersionUID = -182628540886553961L;

    private String number;
    private String type;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
