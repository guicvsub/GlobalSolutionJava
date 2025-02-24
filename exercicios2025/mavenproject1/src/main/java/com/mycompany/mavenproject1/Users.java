/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author gui
 */
public class Users {
    public final String username;
    public final String password; 
    public static int cout =0;

    

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
        cout++;
    }
   
    
}
