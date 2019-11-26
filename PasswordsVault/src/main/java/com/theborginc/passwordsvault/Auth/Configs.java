/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theborginc.passwordsvault.Auth;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 *
 * @author keshavgupta
 */
public class Configs {
    public String getUsername() throws IOException{
        String[] lines = Files.readAllLines(new File("./src/main/resources/config.dat").toPath()).toArray(new String[0]);
        return lines[0];
    }
    
    public String getPassword() throws IOException{
        String[] lines = Files.readAllLines(new File("./src/main/resources/config.dat").toPath()).toArray(new String[0]);
        return lines[1];
    }
}
