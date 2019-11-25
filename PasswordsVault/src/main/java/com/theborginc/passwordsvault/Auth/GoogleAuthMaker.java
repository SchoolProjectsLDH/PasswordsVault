/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theborginc.passwordsvault.Auth;
import com.j256.twofactorauth.*;
import java.security.GeneralSecurityException;

/**
 *
 * @author keshavgupta
 */
public class GoogleAuthMaker {
    public String getCode(){
        try{
            String code = TimeBasedOneTimePasswordUtil.generateCurrentNumberString("PDHXYW3SSDJGCAQI");
            return code;
        }catch(GeneralSecurityException e){
            System.out.println("no");
        }
        return "NAN";
    }
    
}
