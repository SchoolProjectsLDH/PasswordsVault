package com.theborginc.passwordsvault.Auth;

import java.io.IOException;

/**
 *
 * @author keshavgupta
 */
public class AuthChecker {
    private final GoogleAuthMaker gAuth = new GoogleAuthMaker();//Google auth class
    private final Configs config = new Configs();//config reader
    
    public boolean compareValues(String username, String password, String twoFactor) throws IOException{//compare given values against actual values
        return(username.equals(config.getUsername()) && password.equals(config.getPassword()) && twoFactor.equals(gAuth.getCode()));
    }
    
    public String getTFact() throws IOException{
        return gAuth.getCode();//get the 6digit code from google auth maker
    }
}
