/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theborginc.passwordsvault.Auth;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

/**
 *
 * @author keshavgupta
 */
public class Configs {
    
    private static void write(String[] parrameters) throws IOException{
        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter("./src/main/resources/config.dat"));
        for (int i = 0; i < parrameters.length; i++) {
            outputWriter.write(parrameters[i]+"");
            outputWriter.newLine();
        }
        outputWriter.flush();  
        outputWriter.close();  
    }
    
    public String getUsername() throws IOException{
        String[] lines = Files.readAllLines(new File("./src/main/resources/config.dat").toPath()).toArray(new String[0]);
        return lines[0];
    }

    public String getPassword() throws IOException{
        String[] lines = Files.readAllLines(new File("./src/main/resources/config.dat").toPath()).toArray(new String[0]);
        return lines[1];
    }
    
    public int getStrikes() throws IOException{
        String[] lines = Files.readAllLines(new File("./src/main/resources/config.dat").toPath()).toArray(new String[0]);
        return Integer.parseInt(lines[5]);
    }
    
    public void addStrike() throws IOException{
        String[] lines = Files.readAllLines(new File("./src/main/resources/config.dat").toPath()).toArray(new String[0]);
        lines[5] = String.valueOf(Integer.parseInt(lines[5])+1);
        write(lines);
    }
    
    public void setUsername(String newUsername) throws IOException{
        String[] lines = Files.readAllLines(new File("./src/main/resources/config.dat").toPath()).toArray(new String[0]);
        lines[0] = newUsername;
        write(lines);
    }
    
    public void setPassword(String newPass) throws IOException{
        String[] lines = Files.readAllLines(new File("./src/main/resources/config.dat").toPath()).toArray(new String[0]);
        lines[1] = newPass;
        write(lines);
    }
}
