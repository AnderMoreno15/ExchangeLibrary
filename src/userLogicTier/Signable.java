/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userLogicTier;

import java.sql.SQLException;
import userLogicTier.model.User;
/**
 *
 * @author inifr
 * @author ander
 */
public interface Signable {

    public User signUp(User user) throws SQLException;
    public User signIn(User user) throws SQLException;
}
