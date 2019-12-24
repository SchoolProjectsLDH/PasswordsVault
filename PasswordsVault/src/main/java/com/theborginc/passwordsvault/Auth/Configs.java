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
    
    private static void write(String[] parameters) throws IOException{//write to config file 
        BufferedWriter outputWriter;//output file
        outputWriter = new BufferedWriter(new FileWriter("./src/main/resources/config.dat"));
        for (String parameter : parameters) {//for each parameter write to line
            outputWriter.write(parameter + "");//write parameter
            outputWriter.newLine();//next line
        }
        outputWriter.flush();//safely close
        outputWriter.close();  
    }
    
    private String[] readFile() throws IOException{//read file helper method
        return Files.readAllLines(new File("./src/main/resources/config.dat").toPath()).toArray(new String[0]);
    }
    
    public String getUsername() throws IOException{//get the actual username
        String[] lines = readFile();
        return lines[0];//send username
    }

    public String getPassword() throws IOException{//get the actual password
        String[] lines = readFile();
        return lines[1];//send password
    }
    
    public int getStrikes() throws IOException{//get number of strikes
        String[] lines = readFile();
        return Integer.parseInt(lines[3]);//send strikes as int
    }
    
    public void addStrike() throws IOException{//add 1 to strikes
        String[] lines = readFile();
        lines[3] = String.valueOf(Integer.parseInt(lines[3])+1);//set strikes to + 1 itself
        write(lines);//write to file
    }
    
    public void resetStrike() throws IOException{//reset strike counter
        String[] lines = readFile();
        lines[3] = "0";//reset strikes to 0
        write(lines);
    }
    
    public void setUsername(String newUsername) throws IOException{//reset username
        String[] lines = readFile();
        lines[0] = newUsername;//set username as given value
        write(lines);//write updated value
    }
    
    public void setPassword(String newPass) throws IOException{//reset password
        String[] lines = readFile();
        lines[1] = newPass;//set pass as given value
        write(lines);//write updated value
    }
    
    public String getSecretKey() throws IOException{//get key for encryptor
        String[] lines = readFile();
        return lines[4];//return key as string
    }
    
    public void newSecretKey() throws IOException{
        String[] lines = readFile();
        PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()//make a password builder
            .useNumbers(true)//Give parameters from toggle buttons
            .useLowerCase(true)
            .useUpperCase(true)
            .useBasicSymbols(false)
            .useAdvSymbols(false)
            .build();
        lines[4] = passwordGenerator.generate(8);
        write(lines);
    }
}
