/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joelsworld;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ingalillhelin
 */
public class ComJoelsWorld {

     int s;
    int i;
    /**
     *
     */
    public static void lol(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ComJoelsWorld.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello");
        //lol();
        //System.out.println("");
    }
    
}
