/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.globalsolutionjava; // Certifique-se de que o pacote está correto

import models.Usuario;

public class GlobalSolutionJava {

    // Método main com a assinatura correta
    public static void main(String[] args) {
        // Criando um objeto Usuario
        Usuario usuario = new Usuario(1, "Guilherme", "guilherme@example.com", "senha123");

        // Testando o construtor e os métodos getter
        System.out.println("Nome do usuário: " + usuario.getNome());
        System.out.println("Email do usuário: " + usuario.getEmail());

        // Testando o método setEmail
        usuario.setEmail("novoemail@example.com");
        System.out.println("Novo email do usuário: " + usuario.getEmail());

        // Testando o método setSenha
        usuario.setSenha("novaSenha123");

        // Testando o método autenticar
        usuario.autenticar("guilherme@example.com", "senha123");

        // Testando o método registrarComodo
        usuario.registrarComodo();

        // Testando o método gerarRelatorio
        usuario.gerarRelatorio();
    }
}
