package com.mycompany.projetochallenge;

import java.util.ArrayList;
import java.util.Date;

public class ProjetoChallenge {
    public static void main(String[] args) {
        // Criando um objeto SistemaRanqueamento
        SistemaRanqueamento sistemaRanqueamento = new SistemaRanqueamento(4.5);

        // Criando uma instância de Mecanico
        Mecanico mecanico = new Mecanico(1, "12345", "Guilherme", "guilherme@email.com", 
                                         10, "Motorista", sistemaRanqueamento);

        // Exibindo os dados do mecânico
        System.out.println(mecanico);

        // Realizando login
        if (mecanico.realizarLogin()) {
            System.out.println("Login realizado com sucesso.");
        } else {
            System.out.println("Falha no login.");
        }

        // Consultando pedidos
        mecanico.consultarPedidos();

        // Respondendo consulta
        mecanico.responderConsulta();

        // Alterando a especialidade do mecânico
        mecanico.setEspecialidade("Eletricista");
        System.out.println("Nova especialidade: " + mecanico.getEspecialidade());

        // Testando a classe Peca
        Peca peca1 = new Peca(1, "Pastilha de freio", 120.50, "pastilha_freio.jpg");
        Peca peca2 = new Peca(2, "Filtro de óleo", 50.00, "filtro_oleo.jpg");

        // Exibindo os detalhes da peça
        peca1.exibirDetalhes();
        peca2.exibirDetalhes();

        // Criando uma lista de peças para a encomenda
        ArrayList<Peca> listaPecas = new ArrayList<>();
        listaPecas.add(peca1);
        listaPecas.add(peca2);

        // Criando um objeto Cliente (herdado de Usuario)
        Cliente cliente = new Cliente(1, "João", "joao@email.com", "123456789", "Rua Exemplo, 123");

        // Exibindo dados do cliente
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());

        // Criando uma instância de Encomenda
        Encomenda encomenda = new Encomenda(1, cliente, mecanico, listaPecas);

        // Exibindo os detalhes da encomenda
        System.out.println("Encomenda ID: " + encomenda.getIdEncomenda());
        System.out.println("Cliente: " + encomenda.getCliente().getNome());
        System.out.println("Mecânico: " + encomenda.getMecanico().getNome());

        // Criando um Pedido
        Pedido pedido = new Pedido(1, new Date(), "Em andamento");

        // Exibindo o status inicial do pedido
        System.out.println("Status do Pedido: " + pedido.getStatus());

        // Atualizando o status do pedido
        pedido.atualizarStatus("Concluído");

        // --------------------------------------------------
        // Agora vamos integrar com a Loja

        // Criando uma loja e adicionando peças
        Loja loja = new Loja(1, "Loja Autopeças", "Rua Exemplo, 123", "1234-5678");
        loja.adicionarPeca(peca1);
        loja.adicionarPeca(peca2);

        // Exibindo as peças disponíveis na loja
        loja.listarPecasDisponiveis();

        // Buscando uma peça por nome
        Peca pecaBuscada = loja.buscarPecaPorNome("Filtro de óleo");
        if (pecaBuscada != null) {
            System.out.println("Peça encontrada: " + pecaBuscada.getNome());
        } else {
            System.out.println("Peça não encontrada.");
        }

        // Vendendo uma peça
        loja.venderPeca(peca1);

        // Exibindo as peças restantes após a venda
        loja.listarPecasDisponiveis();

        // --------------------------------------------------
        // Integração com Visão Computacional
        // Criando a instância de VisaoComputacional
        VisaoComputacional visaoComputacional = new VisaoComputacional();

        // Identificando a peça pela imagem
        String imagemPeca = "imagem_com_engrenagem.jpg"; // Exemplo de imagem
        String resultado = visaoComputacional.identificarPeca(imagemPeca);
        System.out.println("Resultado da identificação: " + resultado);  // Saída: Engrenagem
    }
}
