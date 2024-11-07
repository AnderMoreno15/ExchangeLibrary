/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userLogicTier;

import exceptions.ExistingUserException;
import exceptions.InactiveUserException;
import exceptions.ServerException;
import exceptions.UserCapException;
import exceptions.UserCredentialException;
import userLogicTier.model.User;

/**
 * Interface defining methods for user authentication and registration.
 * Implementing classes provide concrete functionality for signing up new users and signing in existing users.
 * 
 * Usage Example:
 * Signable signable = new SomeImplementation();
 * User user = signable.signIn(existingUser);
 * 
 * @see User
 * @see ExistingUserException
 * @see InactiveUserException
 * @see ServerException
 * @see UserCapException
 * @see UserCredentialException
 * 
 * @author inifr
 * @author Ander
 * @author Aitziber
 */
public interface Signable {

    /**
     * Registers a new user.
     *
     * @param user the user to be registered
     * @return the registered user object
     * @throws ExistingUserException if the user already exists
     * @throws ServerException if a server-related error occurs during registration
     */
    public User signUp(User user) throws ExistingUserException, ServerException;

    /**
     * Authenticates an existing user.
     *
     * @param user the user attempting to sign in
     * @return the authenticated user object
     * @throws InactiveUserException if the user account is inactive
     * @throws UserCredentialException if the user's credentials are invalid
     * @throws UserCapException if the user limit has been reached
     * @throws ServerException if a server-related error occurs during authentication
     */
    public User signIn(User user) throws InactiveUserException, UserCredentialException, UserCapException, ServerException;
}


