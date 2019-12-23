package com.theborginc.passwordsvault.Auth;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.crypto.Cipher;
import org.json.simple.JSONArray;
import org.json.simple.JSONAware;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author keshavgupta
 */
public class DatabaseEditor {
    JSONArray passwords;
    
    public void JsonParse(String accountType, String title, String username, String password) throws Exception{
        JSONParser jsonParser = new JSONParser();
        EncryptDecrypt cipherHandler = new EncryptDecrypt();
        Configs config = new Configs();
        cipherHandler.encrypt(config.getSecretKey(), Cipher.DECRYPT_MODE, "./src/main/resources/passwords.txt", "./src/main/resources/passwords.json");
        try (FileReader reader = new FileReader("./src/main/resources/passwords.json")){
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            passwords = (JSONArray) obj;
        } catch (Exception e){
            System.out.println("Invalid json array");
        }
        passwords.add(new Account(accountType,title,username,password));         
        writeToFile(passwords);
        cipherHandler.encrypt(config.getSecretKey(), Cipher.ENCRYPT_MODE, "./src/main/resources/passwords.json", "./src/main/resources/passwords.txt");
        cipherHandler.clear();
    }
    
    
    public static void writeToFile(JSONArray passwords) {
        try (FileWriter file = new FileWriter("./src/main/resources/passwords.json")) {
            file.write(passwords.toString());
            file.flush();
        } catch (IOException e) {
            System.out.println("Failed to write to file. FNF");
        }
    }
    
    public void removeAccount(int location) throws Exception{
        JSONParser jsonParser = new JSONParser();
        EncryptDecrypt cipherHandler = new EncryptDecrypt();
        Configs config = new Configs();
        cipherHandler.encrypt(config.getSecretKey(), Cipher.DECRYPT_MODE, "./src/main/resources/passwords.txt", "./src/main/resources/passwords.json");
        try (FileReader reader = new FileReader("./src/main/resources/passwords.json")){
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            passwords = (JSONArray) obj;
        } catch (Exception e){
            System.out.println("Account removal failed due to invalid json object");
        }
        
        passwords.remove(location);
        writeToFile(passwords);
        cipherHandler.encrypt(config.getSecretKey(), Cipher.ENCRYPT_MODE, "./src/main/resources/passwords.json", "./src/main/resources/passwords.txt");
        cipherHandler.clear();
    }
    
}

class Account implements JSONAware {
    String accountType;
    String title;
    String username;
    String password;
    Account(String type, String titleInfo, String Username, String Password){
        this.accountType = type;
        this.title = titleInfo;
        this.username = Username;
        this.password = Password;
    }
    @Override
    public String toJSONString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"account\"");
        sb.append(":");
        sb.append("\"").append(JSONObject.escape(accountType)).append("\"");
        sb.append(",");
        sb.append("\"title\"");
        sb.append(":");
        sb.append("\"").append(JSONObject.escape(title)).append("\"");
        sb.append(",");
        sb.append("\"username\"");
        sb.append(":");
        sb.append("\"").append(JSONObject.escape(username)).append("\"");
        sb.append(",");
        sb.append("\"password\"");
        sb.append(":");
        sb.append("\"").append(JSONObject.escape(password)).append("\"");
        sb.append("}");
        return sb.toString();
    }   
    
}
