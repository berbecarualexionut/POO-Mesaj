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
public class Main {
    public static void main(String[] args){
        MesajPrivat msj1=new MesajPrivat("Paul","Mircea","Salut");
        MesajPrivat msj2=new MesajPrivat("Petru","Ion","Salut");
        MesajPrivat msj3=new MesajPrivat("Alex","Alin","Salut");
        System.out.println(msj1);
         System.out.println(msj1.getRecipient());
         System.out.println(msj2);
          System.out.println(msj2.getRecipient());
          System.out.println(msj3);
           System.out.println(msj3.getRecipient());
         
    }
    
}
