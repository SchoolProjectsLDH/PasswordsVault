/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theborginc.passwordsvault.Auth;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;
import javax.crypto.Cipher;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.security.PublicKey;

/**
 *
 * @author keshavgupta
 */
public class Encrypt {
    
    private static void write(byte[] data) {
        File file = new File("./src/main/resources/passwords.json");
         
        FileOutputStream fos = null;
 
        try {
             
            fos = new FileOutputStream(file);
             
            // Writes bytes from the specified byte array to this file output stream 
            fos.write(data);
 
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        }
        catch (IOException ioe) {
            System.out.println("Exception while writing file " + ioe);
        }
        finally {
            // close the streams using close method
            try {
                if (fos != null) {
                    fos.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("Error while closing stream: " + ioe);
            }
 
        }
    }
    public void encrypt(File file){
        try{
            Signature sign = Signature.getInstance("SHA256withRSA");

            KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");

            keyPairGen.initialize(2048);

            KeyPair pair = keyPairGen.generateKeyPair();      

            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            PublicKey publicKey = pair.getPublic();
            System.out.println(publicKey);
            cipher.init(cipher.ENCRYPT_MODE, pair.getPublic());

            byte[] input = Files.readAllBytes(file.toPath());	  
            cipher.update(input);

            byte[] cipherText = cipher.doFinal();
            write(cipherText);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    

}
