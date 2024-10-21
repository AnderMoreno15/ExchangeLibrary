/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userLogicTier.model;

/**
 *
 * @author inifr
 */
public class User{
    private String name;
    private String email;
    private String password;
    private String street;
    private String city;
    private String zip;
    private boolean active;
    private int company_id;
    private String notification_type;

    //Constructor for testing purposes
    public User() {
        this.name = "";
        this.email = "";
        this.password = "";
        this.street = "";
        this.city = "";
        this.zip = "";
        this.active = false;
        this.company_id = 1;
        this.notification_type = "email";
    }

    //Constructor for SignUp
    public User(String nameInput, String emailInput, String passwordInput, String streetInput, String cityInput, String zipInput, boolean activeInput, int company_idInput, String notification_typeInput) {
        this.name = nameInput;
        this.email = emailInput;
        this.password = passwordInput;
        this.street = streetInput;
        this.city = cityInput;
        this.zip = zipInput;
        this.active = activeInput;
        this.company_id = company_idInput;
        this.notification_type = notification_typeInput;
    }

    //Constructor for SignIn
    public User(String emailInput, String passwordInput) {
        this.email = emailInput;
        this.password = passwordInput;
    }
}