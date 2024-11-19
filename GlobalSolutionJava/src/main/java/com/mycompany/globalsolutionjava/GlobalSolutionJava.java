package com.mycompany.globalsolutionjava;

import models.Usuario;
import models.Dispositivo;
import models.Comodo;
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

        System.out.println("\n=== Testando Autenticação ===");
        boolean autenticado = usuario.autenticar("joao.silva@example.com", "senha123");
        System.out.println(autenticado ? "Usuário autenticado com sucesso!" : "Falha na autenticação.");

        boolean falhaAutenticacao = usuario.autenticar("joao.silva@example.com", "senhaErrada");
        System.out.println(falhaAutenticacao ? "Usuário autenticado com sucesso!" : "Falha na autenticação.");

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
    }
}

