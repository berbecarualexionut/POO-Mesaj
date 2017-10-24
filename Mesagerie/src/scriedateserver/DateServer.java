/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scriedateserver;
import java.io.*;
import java.util.Properties;
import java.lang.Exception.*;
/**
 *
 * @author yonut_000
 */
public class DateServer {
     public static void main(String[] args) {
        // TODO code application logic here
        Properties prop=new Properties();
        OutputStream output=null;
        
        try{
            output=new FileOutputStream("server.conf");
            prop.setProperty("TCP_PORT","100");
            prop.setProperty("MAX_CLIENTS","9000");
            prop.store(output,"Acestea sunt datele de configurare");
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
}
}
