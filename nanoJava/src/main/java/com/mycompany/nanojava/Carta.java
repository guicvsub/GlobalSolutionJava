/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nanojava;

/**
 *
 * @author gui
 */
public class Carta extends Documento{
    public String nome;

    public Carta(String titulo, String texto, String nome) {
        super(titulo, texto);
    }

    @Override
    void mostrarconteudo() {
        System.out.println(this.texto);
    }
    

    
     
    
   
    
}
