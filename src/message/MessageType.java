/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

/**
 *
 * @author Usuario
 */
public enum MessageType {
    SERVER_SIGN_IN_REQUEST,
    SERVER_SIGN_UP_REQUEST,
    SERVER_RESPONSE_DENIED,
    SERVER_RESPONSE_OK,
    SERVER_USER_CAP_REACHED,
    SERVER_USER_ALREADY_EXISTS,
    SERVER_CONNECTION_ERROR,
    SERVER_CREDENTIAL_ERROR
}