package com.theborginc.passwordsvault.Auth;

import java.io.IOException;

/**
 *
 * @author keshavgupta
 */
public class AuthChecker {
    private final GoogleAuthMaker gAuth = new GoogleAuthMaker();
    private final Configs config = new Configs();
    
    public boolean compareValues(String username, String password, String twoFactor) throws IOException{
        return(username.equals(config.getUsername()) && password.equals(config.getPassword()) && twoFactor.equals(gAuth.getCode()));
    }
    
    public String getTFact() throws IOException{
        return gAuth.getCode();
    }
}
