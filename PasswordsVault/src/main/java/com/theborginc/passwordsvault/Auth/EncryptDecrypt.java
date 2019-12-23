/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theborginc.passwordsvault.Auth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/**
 *
 * @author keshavgupta
 */
public class EncryptDecrypt {
    public void encrypt(String key, int mode, String inPath, String outPath) throws Exception{
        File input = new File(inPath);
        File output = new File(outPath);
        FileInputStream fileInputStream = new FileInputStream(input);
        FileOutputStream fileOutputStream = new FileOutputStream(output);
        
        DESKeySpec desKeySpec = new DESKeySpec(key.getBytes());
        
        SecretKeyFactory secKeyFact = SecretKeyFactory.getInstance("DES");
        SecretKey secretKey = secKeyFact.generateSecret(desKeySpec);
        
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        
        switch(mode){
            case Cipher.ENCRYPT_MODE:
                cipher.init(Cipher.ENCRYPT_MODE, secretKey, SecureRandom.getInstance("SHA1PRNG"));
                CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
                write(cipherInputStream, fileOutputStream);
                break;
            case Cipher.DECRYPT_MODE:
                cipher.init(Cipher.DECRYPT_MODE, secretKey, SecureRandom.getInstance("SHA1PRNG"));
                CipherOutputStream cipherOutputStream = new CipherOutputStream(fileOutputStream, cipher);
                write(fileInputStream, cipherOutputStream);
                break;
        }
    }
    
    public void clear() throws IOException{
        FileOutputStream writer = new FileOutputStream("./src/main/resources/passwords.json");
        writer.write(("").getBytes());
        writer.close();
    }
    
    private static void write(InputStream input, OutputStream output) throws IOException{
        byte[] buffer = new byte[64];
        int numBytesRead;
        while((numBytesRead = input.read(buffer)) != -1){
            output.write(buffer, 0, numBytesRead);
        }
        input.close();
        output.close();
    }
    
    public static void main(String args[]) throws Exception{
        EncryptDecrypt e = new EncryptDecrypt();
        Configs conf = new Configs();
        e.encrypt(conf.getSecretKey(), Cipher.ENCRYPT_MODE, "./src/main/resources/passwords.json", "./src/main/resources/passwords.txt");
    }
}
