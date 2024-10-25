/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userLogicTier;

import java.io.Serializable;
import userLogicTier.model.User;

/**
 *
 * @author Usuario
 */
public class Message implements Serializable{
   private User User;
   private MessageType MessageType;

    public Message(User User, MessageType MessageType) {
        this.User = User;
        this.MessageType = MessageType;
    }

    public User getUser() {
        return User;
    }

    public void setUser(User User) {
        this.User = User;
    }
    
    public MessageType getMessageType() {
        return MessageType;
    }
    
    public void setMessageType(MessageType MessageType) {
        this.MessageType = MessageType;
    }
}