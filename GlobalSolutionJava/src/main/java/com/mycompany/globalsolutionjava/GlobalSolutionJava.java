package com.mycompany.globalsolutionjava;

import models.Usuario;
import models.Dispositivo;
import models.Comodo;
import models.Categoria;
import models.Relatorio;
import models.Consumo;
import models.Alerta;

import java.util.Date;
import java.util.Scanner;

public class GlobalSolutionJava {

    public static void main(String[] args) {
        // ---------------- Teste para a classe Dispositivo ----------------
        Dispositivo dispositivo = new Dispositivo(
                "00:1A:2B:3C:4D:5E",
                "Iluminação",
                "Philips",
                "Smart Bulb",
                false, // Inicialmente desligado
                10.5f // Consumo atual em watts
        );

        System.out.println("=== Informações do Dispositivo ===");
        System.out.println(dispositivo);

        System.out.println("\n=== Testando Liga/Desliga ===");
        dispositivo.ligar();
        dispositivo.desligar();
        dispositivo.desligar();

        System.out.println("\n=== Monitorando Consumo ===");
        dispositivo.monitorarConsumo();

        System.out.println("\n=== Atualizando Consumo ===");
        dispositivo.setConsumoAtual(15.0f);
        dispositivo.monitorarConsumo();

        System.out.println("\n=== Testando Métodos Base ===");
        dispositivo.salvar();
        dispositivo.atualizar();
        dispositivo.deletar();

        System.out.println("\n=== Informações Atualizadas ===");
        System.out.println(dispositivo);

        // ---------------- Teste para a classe Usuario ----------------
        Usuario usuario = new Usuario(1, "João Silva", "joao.silva@example.com", "senha123");

        System.out.println("\n=== Informações do Usuário ===");
        System.out.println(usuario);

        System.out.println("\n=== Adicionando Cômodos ao Usuário ===");
        usuario.adicionarComodo("Sala");
        usuario.adicionarComodo("Cozinha");
        usuario.adicionarComodo("Quarto");

        System.out.println("\nCômodos registrados:");
        usuario.listarComodos();

        System.out.println("\n=== Testando Métodos Base (Usuario) ===");
        usuario.salvar();
        usuario.atualizar();
        usuario.deletar();

        // Teste de autenticação com Scanner
        System.out.println("\n=== Testando Autenticação ===");

        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando e capturando o e-mail
        System.out.print("Digite o e-mail para autenticação: ");
        String emailInput = scanner.nextLine();

        // Solicitando e capturando a senha
        System.out.print("Digite a senha para autenticação: ");
        String senhaInput = scanner.nextLine();

        // Chamando o método autenticar com as entradas fornecidas
        boolean autenticado = usuario.autenticar(emailInput, senhaInput);

        // Exibindo o resultado
        if (autenticado) {
            System.out.println("Usuário autenticado com sucesso!");
        } else {
            System.out.println("Falha na autenticação. Verifique o e-mail e a senha.");
        }

        // ---------------- Teste para a classe Comodo ----------------
        System.out.println("\n=== Teste para a Classe Comodo ===");

        // Criando um cômodo
        Comodo sala = new Comodo(1, "Sala", 20.5f);

        // Exibindo informações do cômodo
        System.out.println("=== Informações do Cômodo ===");
        System.out.println("ID: " + sala.getIdComodo());
        System.out.println("Nome: " + sala.getNome());
        System.out.println("Área: " + sala.getArea());

        // Adicionando dispositivos ao cômodo
        System.out.println("\n=== Adicionando Dispositivos ao Cômodo ===");
        Dispositivo tv = new Dispositivo("00:2B:3C:4D:5E:6F", "Entretenimento", "Samsung", "Smart TV", false, 150.0f);
        Dispositivo lampada = new Dispositivo("00:3C:4D:5E:6F:7A", "Iluminação", "Philips", "LED Bulb", true, 12.0f);
        sala.adicionarDispositivo(tv);
        sala.adicionarDispositivo(lampada);

        // Listando dispositivos no cômodo
        System.out.println("\nDispositivos na " + sala.getNome() + ":");
        sala.listarDispositivos();

        // Atualizando área do cômodo
        System.out.println("\n=== Atualizando Área do Cômodo ===");
        sala.setArea(25.0f);
        System.out.println("Área atualizada: " + sala.getArea() + " m²");

        // Testando métodos da classe Base
        System.out.println("\n=== Testando Métodos Base (Comodo) ===");
        sala.salvar();
        sala.atualizar();
        sala.deletar();

        // ---------------- Teste para a classe Categoria ----------------
        System.out.println("\n=== Teste para a Classe Categoria ===");

        // Criando uma categoria
        Categoria iluminacao = new Categoria(1, "Iluminação");

        // Adicionando dispositivos à categoria
        System.out.println("\n=== Adicionando Dispositivos à Categoria ===");
        iluminacao.adicionarDispositivo(dispositivo);
        iluminacao.adicionarDispositivo(lampada);

        // Listando dispositivos na categoria
        System.out.println("\nDispositivos na Categoria " + iluminacao.getNomeCategoria() + ":");
        iluminacao.listarDispositivos();

        // Testando métodos da classe Base
        System.out.println("\n=== Testando Métodos Base (Categoria) ===");
        iluminacao.salvar();
        iluminacao.atualizar();
        iluminacao.deletar();

        // Exibindo informações da categoria
        System.out.println("\n=== Informações da Categoria ===");
        System.out.println(iluminacao);

        // ---------------- Teste para a classe Relatorio e Consumo ----------------
        System.out.println("\n=== Teste para a Classe Relatorio e Consumo ===");

        // Criando uma instância de Consumo
        Consumo consumo1 = new Consumo(1, new Date(), 100.5f);
        Consumo consumo2 = new Consumo(2, new Date(), 200.0f);

        // Registrando consumo
        consumo1.registrarConsumo(120.5f);
        consumo2.registrarConsumo(210.0f);

        // Criando um Relatório
        Relatorio relatorio = new Relatorio(1, new Date(), "Mensal", "Relatório de consumo mensal de energia");

        // Adicionando consumos ao relatório
        relatorio.adicionarConsumo(consumo1);
        relatorio.adicionarConsumo(consumo2);

        // Gerando resumo do relatório
        System.out.println("\n=== Resumo do Relatório ===");
        System.out.println(relatorio.gerarResumo());

        // ---------------- Teste para a classe Alerta ----------------
        System.out.println("\n=== Teste para a Classe Alerta ===");

        // Criando instância de Alerta
        Alerta alerta1 = new Alerta(1, "Excesso de Consumo", "O consumo ultrapassou o limite definido", new Date(), "Ativo");
        Alerta alerta2 = new Alerta(2, "Falha no Dispositivo", "Dispositivo está com defeito", new Date(), "Resolvido");

        // Exibindo resumo dos alertas
        System.out.println("\n=== Resumo dos Alertas ===");
        System.out.println(alerta1.gerarResumo());
        System.out.println(alerta2.gerarResumo());

        // Atualizando o status do alerta1
        alerta1.setStatus("Resolvido");
        System.out.println("\n=== Após Atualização do Alerta 1 ===");
        System.out.println(alerta1.gerarResumo());

        // Fechando o scanner
        scanner.close();
    }
}
