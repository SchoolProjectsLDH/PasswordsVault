package com.theborginc.passwordsvault.Auth;

import com.j256.twofactorauth.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.security.GeneralSecurityException;
import javax.swing.ImageIcon;

/**
 *
 * @author keshavgupta
 */
public class GoogleAuthMaker {
    private static final String CONFIG_FILE = "./src/main/resources/config.dat";//config path
    
    private static void write(String[] parameters) throws IOException{//write array to lines
        BufferedWriter outputWriter;
        outputWriter = new BufferedWriter(new FileWriter(CONFIG_FILE));//write to config file
        for (String parameter : parameters) {//for each parameter 
            outputWriter.write(parameter + "");//write to individual line
            outputWriter.newLine();
        }
        outputWriter.flush();//close writer
        outputWriter.close();  
    }
    
    public String getCode() throws IOException{//get 2fa code from config
        String[] lines = Files.readAllLines(new File(CONFIG_FILE).toPath()).toArray(new String[0]);//read lines to array
        try{
            String code = TimeBasedOneTimePasswordUtil.generateCurrentNumberString(lines[2]);//get the 6digit code from the 32bithash
            return code;
        }catch(GeneralSecurityException e){
            System.out.println("Err");
        }
        return "NAN";//invalid code
    }
    
    public ImageIcon newCode() throws IOException{//Generate new code
        String[] lines = Files.readAllLines(new File(CONFIG_FILE).toPath()).toArray(new String[0]);//read all values in config
        String base32Secret = TimeBasedOneTimePasswordUtil.generateBase32Secret();//new 32bithash from generator
        lines[2] = base32Secret;//set new hash in array
        write(lines);//update file
        
        URL url = new URL(TimeBasedOneTimePasswordUtil.qrImageUrl("PasswordsVault", base32Secret));
        return new ImageIcon(url);//return the qr code
    }
    
}
