/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriac.poo.server.config.ServerConfig;
import java.lang.String;
import java.io.*;
import static java.lang.Integer.parseInt;
import java.util.Properties;
import java.lang.Exception.*;
import seriac.poo.server.exceptions.*;
/**
 *
 * @author yonut_000
 */
public class ServerConfig {
    public int TcpPort;
    public int MaxClients;
    public static String filename;
    
    public ServerConfig(String path){
        filename=path;
    }
    public ServerConfig(){
        filename="server.conf";
    }
    
  int getTcpPort(){
      return TcpPort;
  }  
  
  int getMaxClients(){
      return MaxClients;
  }
    
  public static void main(String[] args) throws FileNotFoundException{
      ServerConfig server=new ServerConfig();
      Properties prop=new Properties();
      InputStream input=null;
        OutputStream output=null;
        BufferedReader br=null;
        FileReader fr=null;
        try{
            output=new FileOutputStream(filename);
            prop.setProperty("TCP_PORT","100");
            prop.setProperty("MAX_CLIENTS","9000");
            prop.store(output,"Acestea sunt datele de configurare");
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
		if (output != null) {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
                }
        }
                
      try{
       input=new FileInputStream(filename);
       prop.load(input);
       String tcp=prop.getProperty("TCP_PORT");
       if(tcp==null){
           throw new MissingKeyException();}
       server.TcpPort=parseInt(tcp);
       String users=prop.getProperty("MAX_CLIENTS");
       if(users==null)
       { throw new MissingKeyException();}
       server.MaxClients=parseInt(users);
      }
      catch(IOException|MissingKeyException e){
          e.printStackTrace();
      }
      finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
  
                }
      }
      System.out.println(server.getTcpPort());
      System.out.println(server.getMaxClients());
                }
                
                
  
}
