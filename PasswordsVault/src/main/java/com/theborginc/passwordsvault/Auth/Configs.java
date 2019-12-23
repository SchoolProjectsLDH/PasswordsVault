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
        BufferedWriter outputWriter;
        outputWriter = new BufferedWriter(new FileWriter("./src/main/resources/config.dat"));
        for (String parrameter : parrameters) {
            outputWriter.write(parrameter + "");
            outputWriter.newLine();
        }
        outputWriter.flush();  
        outputWriter.close();  
    }
    
    private String[] readFile() throws IOException{
        return Files.readAllLines(new File("./src/main/resources/config.dat").toPath()).toArray(new String[0]);
    }
    
    public String getUsername() throws IOException{
        String[] lines = readFile();
        return lines[0];
    }

    public String getPassword() throws IOException{
        String[] lines = readFile();
        return lines[1];
    }
    
    public int getStrikes() throws IOException{
        String[] lines = readFile();
        return Integer.parseInt(lines[3]);
    }
    
    public void addStrike() throws IOException{
        String[] lines = readFile();
        lines[3] = String.valueOf(Integer.parseInt(lines[3])+1);
        write(lines);
    }
    
    public void resetStrike() throws IOException{
        String[] lines = readFile();
        lines[3] = "0";
        write(lines);
    }
    
    public void setUsername(String newUsername) throws IOException{
        String[] lines = readFile();
        lines[0] = newUsername;
        write(lines);
    }
    
    public void setPassword(String newPass) throws IOException{
        String[] lines = readFile();
        lines[1] = newPass;
        write(lines);
    }
    
    public String getSecretKey() throws IOException{
        String[] lines = readFile();
        return lines[4];

    }
}
