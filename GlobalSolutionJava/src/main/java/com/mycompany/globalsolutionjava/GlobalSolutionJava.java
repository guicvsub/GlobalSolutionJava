package com.mycompany.globalsolutionjava; 
import models.Usuario;
import java.util.Scanner; // Importação da classe Scanner
import models.Dispositivo;

public class GlobalSolutionJava {

    // Método main com a assinatura correta
    public static void main(String[] args) {
        // Criando um objeto Usuario com dados iniciais
        Usuario usuario = new Usuario(1, "Guilherme", "guilherme@example.com", "senha123");

        // Passo 1: Testando o método de autenticação com Scanner
        testarAutenticacao(usuario);

        // Passo 2: Testando os métodos de acesso e modificação de dados do usuário
        testarAtributos(usuario);

        // Passo 3: Testando o método de registrar cômodo
        usuario.registrarComodo();

        // Passo 4: Testando o método de gerar relatório
        usuario.gerarRelatorio();
    }

    // Método para testar a autenticação do usuário com dados do Scanner
    private static void testarAutenticacao(Usuario usuario) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o e-mail para autenticação:");
        String email = scanner.nextLine(); // Captura o email

        System.out.println("Digite a senha para autenticação:");
        String senha = scanner.nextLine(); // Captura a senha

        System.out.println("\nTentando autenticar com os dados fornecidos...");
        usuario.autenticar(email, senha); // Chama o método autenticar passando os dados do usuário

        // Fechando o scanner após o uso
        scanner.close();
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
    public static void testeComodo(){
         Dispositivo dispositivo1 = new Dispositivo("");
        Dispositivo dispositivo2 = new Dispositivo("Lâmpada");

        // Criando um cômodo
        Comodo comodo = new Comodo(1, "Sala", 20.0f);

        // Adicionando dispositivos ao cômodo
        comodo.adicionarDispositivo(dispositivo1);
        comodo.adicionarDispositivo(dispositivo2);

        // Listando dispositivos no cômodo
        comodo.listarDispositivos();
    
    
    }
}
