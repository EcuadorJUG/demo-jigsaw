package org.ecuadorjug.model.security;

import java.io.Serializable;

/**
 * Created by Kleber Ayala on 11/20/16.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 899724194272893415L;

    private String username;
    private String password;
    private String salt;
    private String token;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
