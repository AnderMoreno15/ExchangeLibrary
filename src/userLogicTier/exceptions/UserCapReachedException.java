/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userLogicTier.exceptions;

/**
 *
 * @author inifr
 */
public class UserCapReachedException extends Exception {
    
    public UserCapReachedException(String msg){
        super(msg);
    }
}
