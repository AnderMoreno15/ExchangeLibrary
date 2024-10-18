/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userLogicTier.model;

import userLogicTier.Signable;

/**
 *
 * @author inifr
 */
public class User implements Signable {
    private String login;
    private String password;
    private boolean active;
    private String city;
    private String street;
    private int zipCode;
    
    public User(String loginInput, String passwordInput, boolean activeInput) {
        this.login = loginInput;
        this.password = passwordInput;
        this.active = activeInput;
        this.city = "";
        this.street = "";
        this.zipCode = 0;
    }

    public User(String loginInput, String passwordInput, boolean activeInput, String cityInput, String streetInput, int zipCodeInput) {
        this.login = loginInput;
        this.password = passwordInput;
        this.active = activeInput;
        this.city = cityInput;
        this.street = streetInput;
        this.zipCode = zipCodeInput;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public User signUp(String loginInput, String passwordInput, boolean activeInput, String cityInput,
            String streetInput, int zipCodeInput) {
        //TODO meter código del método
        User user = new User(loginInput, passwordInput, activeInput, cityInput, streetInput, zipCodeInput);

        return user;
    }

    @Override
    public User SignIn(String loginInput, String passwordInput, boolean activeInput) {
        //TODO meter código del método
        User user = new User(loginInput, passwordInput, activeInput);

        return user;
    }

    
}