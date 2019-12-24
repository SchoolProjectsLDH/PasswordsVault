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
    JSONArray passwords;//passwords array
    
    private final static Configs CONFIG = new Configs();//config constant
    private final static String PASSWORD_TEXT = "./src/main/resources/passwords.txt";//paths to encrypted and decrypted files
    private final static String PASSWORD_JSON = "./src/main/resources/passwords.json";
    
    public void JsonParse(String accountType, String title, String username, String password) throws Exception{//parse the given parameters to array
        JSONParser jsonParser = new JSONParser();
        EncryptDecrypt cipherHandler = new EncryptDecrypt();//controls cipher
        
        cipherHandler.encrypt(CONFIG.getSecretKey(), Cipher.DECRYPT_MODE, PASSWORD_TEXT, PASSWORD_JSON);//decrypt the text file to json file
        
        try (FileReader reader = new FileReader(PASSWORD_JSON)){//read json file
            //Read JSON file
            Object obj = jsonParser.parse(reader);//send to json array
            passwords = (JSONArray) obj;
        } catch (Exception e){
            System.out.println("Invalid json array");
        }
        passwords.add(new Account(accountType,title,username,password));//add parameters to json array      
        writeToFile(passwords);//write new json array to json file
        
        cipherHandler.encrypt(CONFIG.getSecretKey(), Cipher.ENCRYPT_MODE, PASSWORD_JSON, PASSWORD_TEXT);//encrypt json file
        cipherHandler.clear();//erase json file
    }
    
    
    public static void writeToFile(JSONArray passwords) {
        try (FileWriter file = new FileWriter(PASSWORD_JSON)) {//output file writer
            file.write(passwords.toString());//write json array to file
            file.flush();
        } catch (IOException e) {
            System.out.println("Failed to write to file. FNF");
        }
    }
    
    public void removeAccount(int location) throws Exception{//deletes account
        JSONParser jsonParser = new JSONParser();
        EncryptDecrypt cipherHandler = new EncryptDecrypt();
        
        cipherHandler.encrypt(CONFIG.getSecretKey(), Cipher.DECRYPT_MODE, PASSWORD_TEXT, PASSWORD_JSON);//decrypt json array to json file
        
        try (FileReader reader = new FileReader(PASSWORD_JSON)){//read json file
            //Read JSON file
            Object obj = jsonParser.parse(reader);//send json file to array
            passwords = (JSONArray) obj;
        } catch (Exception e){
            System.out.println("Account removal failed due to invalid json object");
        }
        passwords.remove(location);//remove from given location
        writeToFile(passwords);//write updated passwords array
        
        cipherHandler.encrypt(CONFIG.getSecretKey(), Cipher.ENCRYPT_MODE, PASSWORD_JSON, PASSWORD_TEXT);//encrypt json file
        cipherHandler.clear();//erase json file
    }
    
}

class Account implements JSONAware {
    String accountType;//Parameters in each object
    String title;
    String username;
    String password;
    Account(String type, String titleInfo, String Username, String Password){//initialize account with given types
        this.accountType = type;
        this.title = titleInfo;
        this.username = Username;
        this.password = Password;
    }
    @Override
    public String toJSONString() {//build the object json string syntax
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
        return sb.toString();//combine to string
    }   
    
}
