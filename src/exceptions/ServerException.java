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
public class ServerException extends Exception{
    
    public ServerException(){
    }
    public ServerException(String msg){
        super(msg);
    }
}
