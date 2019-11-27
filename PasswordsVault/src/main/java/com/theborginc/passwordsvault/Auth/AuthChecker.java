/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theborginc.passwordsvault.Auth;

import java.io.IOException;

/**
 *
 * @author keshavgupta
 */
public class AuthChecker extends javax.swing.JFrame{
    private final GoogleAuthMaker gAuth = new GoogleAuthMaker();
    private final Configs config = new Configs();
    
    public boolean compareValues(String username, String password, String twoFactor) throws IOException{
        return(username.equals(config.getUsername()) && password.equals(config.getPassword()) && twoFactor.equals(gAuth.getCode()));
    }
    
    public String getTFact() throws IOException{
        return gAuth.getCode();
    }
}
