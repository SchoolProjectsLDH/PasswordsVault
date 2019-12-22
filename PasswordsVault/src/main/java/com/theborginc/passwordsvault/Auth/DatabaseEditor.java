/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theborginc.passwordsvault.Auth;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
    
    public void JsonParse(String accountType, String title, String username, String password){
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("./src/main/resources/passwords.json")){
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            passwords = (JSONArray) obj;
        } catch (Exception e){
            e.printStackTrace();
        }
        
        passwords.add(new Account(accountType,title,username,password)); 
        System.out.println(passwords);
        
        writeToFile(passwords);
    }
    
    
    public static void writeToFile(JSONArray passwords) {//Finalize the highscores by saving them to an actual location
        try (FileWriter file = new FileWriter("./src/main/resources/passwords.json")) {

            file.write(passwords.toString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
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
        sb.append("\"" + JSONObject.escape(accountType) + "\"");
        sb.append(",");
        sb.append("\"title\"");
        sb.append(":");
        sb.append("\"" + JSONObject.escape(title) + "\"");
        sb.append(",");
        sb.append("\"username\"");
        sb.append(":");
        sb.append("\"" + JSONObject.escape(username) + "\"");
        sb.append(",");
        sb.append("\"password\"");
        sb.append(":");
        sb.append("\"" + JSONObject.escape(password) + "\"");
        sb.append("}");
        return sb.toString();
    }   
    
}
