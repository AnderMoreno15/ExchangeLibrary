/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userLogicTier;

import userLogicTier.model.User;
/**
 *
 * @author inifr
 */
public interface Signable {
    
    public User signUp(String loginInput, String passwordInput, boolean activeInput, String cityInput, String streetInput, int zipCodeInput);
    public User SignIn(String loginInput, String passwordInput, boolean activeInput);
}
