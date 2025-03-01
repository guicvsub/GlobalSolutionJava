/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nanojava;

/**
 *
 * @author gui
 */
public class piao  extends funcionario{
    
    public piao(String nome, double salario) {
        super(nome, salario);
        
    }
    @Override
     public double calculaSalario(){
        double bonus=150.00;
       double salarioFinal =  this.salario + bonus;
        return salarioFinal;
    
    
    }
     
}
