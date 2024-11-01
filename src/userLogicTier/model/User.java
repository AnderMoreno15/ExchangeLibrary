/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userLogicTier.model;

/**
 *
 * @author inifr
 * @author ander
 */
public class User {

    private String name;
    private String email;
    private String password;
    private String street;
    private String city;
    private String zip;
    private boolean active;

    //Constructor for testing purposes
    public User() {
        this.name = "";
        this.email = "";
        this.password = "";
        this.street = "";
        this.city = "";
        this.zip = "";
        this.active = false;
    }

    //Constructor for SignUp
    public User(String nameInput, String emailInput, String passwordInput, String streetInput, String cityInput, String zipInput, boolean activeInput) {
        this.name = nameInput;
        this.email = emailInput;
        this.password = passwordInput;
        this.street = streetInput;
        this.city = cityInput;
        this.zip = zipInput;
        this.active = activeInput;
    }

    //Constructor for SignIn
    public User(String emailInput, String passwordInput) {
        this.email = emailInput;
        this.password = passwordInput;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public boolean isActive() {
        return active;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    

}
