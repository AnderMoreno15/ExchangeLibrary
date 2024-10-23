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
 * @author ander
 */
public interface Signable {
    
    public void signUp(User user);
    public User signIn(User user);
}
