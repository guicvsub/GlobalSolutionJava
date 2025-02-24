/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetochallenge;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gui
 */


public class Loja {
    private int idLoja;
    private String nome;
    private String endereco;
    private String telefone;
    private List<Peca> pecasDisponiveis; // Lista de peças disponíveis

    public Loja(int idLoja, String nome, String endereco, String telefone) {
        this.idLoja = idLoja;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.pecasDisponiveis = new ArrayList<>(); // Inicializando a lista de peças
    }

    public int getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(int idLoja) {
        this.idLoja = idLoja;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método para adicionar uma peça à loja
    public void adicionarPeca(Peca peca) {
        this.pecasDisponiveis.add(peca);
    }

    // Método para listar todas as peças disponíveis na loja
    public void listarPecasDisponiveis() {
        System.out.println("Listando peças disponíveis na loja: " + this.nome);
        for (Peca peca : pecasDisponiveis) {
            peca.exibirDetalhes(); 
        }
    }

    // Método para simular a venda de uma peça
    public void venderPeca(Peca peca) {
        if (pecasDisponiveis.contains(peca)) {
            pecasDisponiveis.remove(peca);
            System.out.println("Peça " + peca.getNome() + " vendida com sucesso!");
        } else {
            System.out.println("A peça " + peca.getNome() + " não está disponível para venda.");
        }
    }

    // Método para buscar uma peça pelo nome
    public Peca buscarPecaPorNome(String nome) {
        for (Peca peca : pecasDisponiveis) {
            if (peca.getNome().equalsIgnoreCase(nome)) {
                return peca;
            }
        }
        return null; // Caso não encontre a peça
    }
}

