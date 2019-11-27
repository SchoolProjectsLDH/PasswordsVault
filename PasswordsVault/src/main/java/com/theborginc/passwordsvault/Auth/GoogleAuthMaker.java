/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theborginc.passwordsvault.Auth;
import com.j256.twofactorauth.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.security.GeneralSecurityException;

/**
 *
 * @author keshavgupta
 */
public class GoogleAuthMaker {
    public String getCode() throws IOException{
        String[] lines = Files.readAllLines(new File("./src/main/resources/config.dat").toPath()).toArray(new String[0]);
        try{
            String code = TimeBasedOneTimePasswordUtil.generateCurrentNumberString(lines[2]);
            return code;
        }catch(GeneralSecurityException e){
            System.out.println("Err");
        }
        return "NAN";
    }
    
}
