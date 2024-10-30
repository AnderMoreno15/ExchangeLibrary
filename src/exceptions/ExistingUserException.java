/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Aitziber
 */
public class ExistingUserException extends Exception{
    
    public ExistingUserException(){
    }
    public ExistingUserException(String msg){
        super(msg);
    }
}
