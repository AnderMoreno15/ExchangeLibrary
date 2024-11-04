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
import java.sql.SQLException;
import userLogicTier.model.User;
/**
 *
 * @author inifr
 * @author ander
 * @author Aitziber
 */
public interface Signable {

    public User signUp (User user) throws SQLException, ExistingUserException, ServerException;
    public User signIn (User user) throws SQLException, InactiveUserException, UserCredentialException, UserCapException, ServerException;

}
