/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nanojava;

/**
 *
 * @author gui
 */
public class Relatorio extends Documento{
    
    public Relatorio(String titulo, String texto ) {
        super(titulo, texto);
    }

    @Override
    void mostrarconteudo() {
        System.out.println(this.texto);
    }
    
}
