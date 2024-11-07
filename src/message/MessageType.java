/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

/**
 * Enum representing the types of messages exchanged between the client and server.
 * Each constant in this enum defines a specific request or response type for server communication.
 * 
 * Usage Example:
 * MessageType messageType = MessageType.SERVER_SIGN_IN_REQUEST;
 * 
 * @see Message
 * 
 * @author Pablo
 * @author Aitziber
 */
public enum MessageType {
    SERVER_SIGN_IN_REQUEST,
    SERVER_SIGN_UP_REQUEST,
    SERVER_RESPONSE_DENIED,
    SERVER_RESPONSE_OK,
    SERVER_USER_CAP_REACHED,
    SERVER_USER_ALREADY_EXISTS,
    SERVER_USER_CREDENTIAL_ERROR,
    SERVER_CONNECTION_ERROR,
    SERVER_USER_INACTIVE
}
