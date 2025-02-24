/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetochallenge;




public class Peca {
    private int id;
    private String nome;
    private double preco;
    private String imagem;

    public Peca(int id, String nome, double preco, String imagem) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.imagem = imagem;
    }

    // Implementação do método getNome()
    public String getNome() {
        return nome;
    }

    public void exibirDetalhes() {
        System.out.println("Descrição: " + nome + ", Preço: " + preco);
    }

    // Outros métodos da classe Peca (como getId, getPreco, etc.) podem ser necessários
}
