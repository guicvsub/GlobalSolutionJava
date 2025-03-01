/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nanojava;

/**
 *
 * @author gui
 */
abstract class Documento {
   public String titulo;
    public String texto;

    public Documento(String titulo, String texto) {
        this.titulo = titulo;
        this.texto = texto;
    }
    
        abstract void  mostrarconteudo();
}