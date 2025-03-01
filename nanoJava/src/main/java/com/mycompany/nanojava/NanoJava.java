/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nanojava;
import  com.mycompany.nanojava.Gerente;
/**
 *
 * @author gui
 */
public class NanoJava {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
            Gerente gerente= new Gerente("marcelo", 15000.00);
    double Salariocombonus = gerente.calculaSalario();
        System.out.println(Salariocombonus);   
     piao joao = new piao("batista", 1500.00);
     double salarioPiao = joao.calculaSalario();
             System.out.println(salarioPiao);   
    }

   
    
}
