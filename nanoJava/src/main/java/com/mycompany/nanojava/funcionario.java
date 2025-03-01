/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nanojava;

/**
 *
 * @author gui
 */
public class funcionario {
    public String nome;
    public  double salario;

    public funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
  public double calculaSalario(){
        double bonus=0.00;
       double salarioFinal =  this.salario + bonus;
        return salarioFinal;
    
    
    }
}
