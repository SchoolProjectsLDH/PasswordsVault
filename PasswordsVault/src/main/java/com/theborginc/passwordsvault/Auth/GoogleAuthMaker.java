/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theborginc.passwordsvault.Auth;
import com.j256.twofactorauth.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.security.GeneralSecurityException;

/**
 *
 * @author keshavgupta
 */
public class GoogleAuthMaker {
    private static void write(String[] parrameters) throws IOException{
        BufferedWriter outputWriter;
        outputWriter = new BufferedWriter(new FileWriter("./src/main/resources/config.dat"));
        for (String parrameter : parrameters) {
            outputWriter.write(parrameter + "");
            outputWriter.newLine();
        }
        outputWriter.flush();  
        outputWriter.close();  
    }
    
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
    
    public String newCode() throws IOException{
        String[] lines = Files.readAllLines(new File("./src/main/resources/config.dat").toPath()).toArray(new String[0]);
        String base32Secret = TimeBasedOneTimePasswordUtil.generateBase32Secret();
        lines[2] = base32Secret;
        write(lines);
        return TimeBasedOneTimePasswordUtil.qrImageUrl("PasswordsVault", base32Secret);
    }
    
}
