/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetochallenge;


public class Cliente extends Usuario {

    private String endereco;
    
    public Cliente(int id, String nome, String email, String senha, String endereco) {
        super(id, nome, email, senha); 
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    @Override
    public boolean realizarLogin() {
        
        System.out.println("Cliente " + getNome() + " logado com sucesso.");
        return super.realizarLogin();
    }

    
}
