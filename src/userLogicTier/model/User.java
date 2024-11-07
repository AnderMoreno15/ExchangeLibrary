/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userLogicTier.model;

import java.io.Serializable;

/**
 * Represents a user with properties such as name, email, password, address, city, ZIP code, and active status.
 * This class is used for both registration and authentication purposes, and it implements Serializable for data transfer.
 * 
 * Constructors allow different initialization for testing, sign-up, and sign-in scenarios.
 * 
 * @see Serializable
 * 
 * Usage Example:
 * User newUser = new User("John Doe", "johndoe@example.com", "password123", "123 Main St", "New York", "10001", true);
 * 
 * @author inifr
 * @author Ander
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    /** The user's name */
    private String name;
    
    /** The user's email */
    private String email;
    
    /** The user's password */
    private String password;
    
    /** The user's street address */
    private String street;
    
    /** The user's city */
    private String city;
    
    /** The user's ZIP code */
    private String zip;
    
    /** The user's active status (true if active, false if inactive) */
    private boolean active;

    /**
     * Default constructor for testing purposes, initializes fields with default values.
     */
    public User() {
        this.name = "";
        this.email = "";
        this.password = "";
        this.street = "";
        this.city = "";
        this.zip = "";
        this.active = false;
    }

    /**
     * Constructor for user registration (SignUp).
     *
     * @param nameInput user's name
     * @param emailInput user's email
     * @param passwordInput user's password
     * @param streetInput user's street address
     * @param cityInput user's city
     * @param zipInput user's ZIP code
     * @param activeInput user's active status (true if active, false if inactive)
     */
    public User(String nameInput, String emailInput, String passwordInput, String streetInput, String cityInput, String zipInput, boolean activeInput) {
        this.name = nameInput;
        this.email = emailInput;
        this.password = passwordInput;
        this.street = streetInput;
        this.city = cityInput;
        this.zip = zipInput;
        this.active = activeInput;
    }

    /**
     * Constructor for user authentication (SignIn).
     *
     * @param emailInput user's email
     * @param passwordInput user's password
     */
    public User(String emailInput, String passwordInput) {
        this.email = emailInput;
        this.password = passwordInput;
    }

     /**
     * Gets the user's name.
     * 
     * @return the user's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the user's name.
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the user's email.
     * 
     * @return the user's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the user's email.
     * 
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the user's password.
     * 
     * @return the user's password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the user's password.
     * 
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the user's street address.
     * 
     * @return the user's street address
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the user's street address.
     * 
     * @param street the street address to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets the user's city.
     * 
     * @return the user's city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the user's city.
     * 
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the user's ZIP code.
     * 
     * @return the user's ZIP code
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the user's ZIP code.
     * 
     * @param zip the ZIP code to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * Gets the user's active status.
     * 
     * @return true if the user is active, false otherwise
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the user's active status.
     * 
     * @param active true to set the user as active, false otherwise
     */
    public void setActive(boolean active) {
        this.active = active;
    }
}