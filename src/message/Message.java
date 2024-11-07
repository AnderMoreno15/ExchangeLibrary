/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

import java.io.Serializable;
import userLogicTier.model.User;

/**
 * Represents a message exchanged between the client and server, containing a user and a message type.
 * This class is used to facilitate communication by encapsulating user data and message type details.
 * 
 * @see userLogicTier.model.User
 * @see MessageType
 * 
 * Usage Example:
 * Message message = new Message(user, MessageType.LOGIN_REQUEST);
 * 
 * @author Pebble
 */
public class Message implements Serializable {
   private static final long serialVersionUID = 1L;

   private User user;
   private MessageType messageType;

   /**
    * Constructs a new Message with the specified user and message type.
    *
    * @param user the user associated with this message
    * @param messageType the type of message being sent
    */
    public Message(User user, MessageType messageType) {
        this.user = user;
        this.messageType = messageType;
    }

    /**
     * Returns the user associated with this message.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the user for this message.
     *
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Returns the type of this message.
     *
     * @return the message type
     */
    public MessageType getMessageType() {
        return messageType;
    }

    /**
     * Sets the type of this message.
     *
     * @param messageType the message type to set
     */
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }
}
