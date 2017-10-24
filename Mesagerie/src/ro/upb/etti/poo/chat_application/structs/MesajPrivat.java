/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.upb.etti.poo.chat_application.structs;

/**
 *
 * @author yonut_000
 */
public class MesajPrivat extends Message {
    private final String mdestinatar;
    
    public MesajPrivat(String destinatar,String user,String mesaj){
        super(user,mesaj);
        mdestinatar=destinatar;
    }
    
    @Override
    public String toString(){
        return "(Priv)"+super.toString();
    }
    
    public String getRecipient(){
        return mdestinatar;
    }
}



