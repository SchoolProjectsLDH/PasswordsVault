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
    public void encrypt(String key, int mode, String inPath, String outPath) throws Exception{//encrypt or decrypt
        File input = new File(inPath);//takes input
        File output = new File(outPath);//takes output
        
        FileInputStream fileInputStream = new FileInputStream(input);//input stream (where the file comes from)
        FileOutputStream fileOutputStream = new FileOutputStream(output);//output stream (where the file goes)
        
        DESKeySpec desKeySpec = new DESKeySpec(key.getBytes());//get the des bytes from passed key
        
        SecretKeyFactory secKeyFact = SecretKeyFactory.getInstance("DES");//new factory with des algorithm
        SecretKey secretKey = secKeyFact.generateSecret(desKeySpec);//secret key from the deskey bytes
        
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");//declaring cipher parameters (how the program decodes the text)
        
        switch(mode){//depending on mode
            case Cipher.ENCRYPT_MODE://encrypt
                cipher.init(Cipher.ENCRYPT_MODE, secretKey, SecureRandom.getInstance("SHA1PRNG"));//encryptor with the pseudo random sha1 setting
                CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);//encrypt the input file
                write(cipherInputStream, fileOutputStream);//write the encrypted input file to the output file
                break;
            case Cipher.DECRYPT_MODE://decrypt
                cipher.init(Cipher.DECRYPT_MODE, secretKey, SecureRandom.getInstance("SHA1PRNG"));//decryptor with pseudo random sha1 setting
                CipherOutputStream cipherOutputStream = new CipherOutputStream(fileOutputStream, cipher);//decrypt the input file
                write(fileInputStream, cipherOutputStream);//write the decrypted input file to the output file
                break;
            default://in case no mode is given properly
                System.out.println("Invalid selection received");
                break;
        }
    }
    
    public void clear() throws IOException{//reset the json file (holds unencrypted data)
        FileOutputStream writer = new FileOutputStream("./src/main/resources/passwords.json");//set path of writer
        writer.write(("").getBytes());//write a blank string
        writer.close();//safely close
    }
    
    private static void write(InputStream input, OutputStream output) throws IOException{//write input to output
        byte[] buffer = new byte[64];//buffer (how much to write at a time)
        int numBytesRead;//bytes already read
        
        while((numBytesRead = input.read(buffer)) != -1){//as long as there are bytes to read
            output.write(buffer, 0, numBytesRead);//write to the outputstream
        }
        
        input.close();//safely close
        output.close();
    }
}
