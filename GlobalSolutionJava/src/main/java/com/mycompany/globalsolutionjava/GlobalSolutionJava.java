package com.mycompany.globalsolutionjava; // Certifique-se de que o pacote está correto

import models.Usuario;

public class GlobalSolutionJava {

    // Método main com a assinatura correta
    public static void main(String[] args) {
        // Criando um objeto Usuario com dados iniciais
        Usuario usuario = new Usuario(1, "Guilherme", "guilherme@example.com", "senha123");

        // Passo 1: Testando o método de autenticação
        testarAutenticacao(usuario);

        // Passo 2: Testando os métodos de acesso e modificação de dados do usuário
        testarAtributos(usuario);

        // Passo 3: Testando o método de registrar cômodo
        usuario.registrarComodo();

        // Passo 4: Testando o método de gerar relatório
        usuario.gerarRelatorio();
    }

    // Método para testar a autenticação do usuário
    private static void testarAutenticacao(Usuario usuario) {
        System.out.println("Tentando autenticar com os dados corretos...");
        usuario.autenticar("guilherme@example.com", "senha123");

        System.out.println("Tentando autenticar com dados incorretos...");
        usuario.autenticar("guilherme@example.com", "senhaErrada");
    }

    // Método para testar os métodos de acesso e modificação dos atributos do usuário
    private static void testarAtributos(Usuario usuario) {
        System.out.println("Nome do usuário: " + usuario.getNome());
        System.out.println("Email do usuário: " + usuario.getEmail());

        // Testando a modificação do email
        usuario.setEmail("novoemail@example.com");
        System.out.println("Novo email do usuário: " + usuario.getEmail());

        // Testando a modificação da senha
        usuario.setSenha("novaSenha123");
    }
}
