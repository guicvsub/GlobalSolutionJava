package com.mycompany.projetochallenge;

import java.util.Date;
import java.util.List;

public class Encomenda {
    private int idEncomenda;
    private Cliente cliente;  
    private Mecanico mecanico;  
    private List<Peca> listaPecas;  

    public Encomenda(int idEncomenda, Cliente cliente, Mecanico mecanico, List<Peca> listaPecas) {
        this.idEncomenda = idEncomenda;
        this.cliente = cliente;
        this.mecanico = mecanico;
        this.listaPecas = listaPecas;
    }

    public int getIdEncomenda() {
        return idEncomenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public List<Peca> getListaPecas() {
        return listaPecas;
    }

    public void setIdEncomenda(int idEncomenda) {
        this.idEncomenda = idEncomenda;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public void setListaPecas(List<Peca> listaPecas) {
        this.listaPecas = listaPecas;
    }

    // Método para encomendar as peças
    public void encomendarPecas() {
        System.out.println("Peças encomendadas pelo cliente " + cliente.getNome());
        for (Peca peca : listaPecas) {
            peca.exibirDetalhes();
        }
    }

    // Método para agendar a vistoria
    public void agendarVistoria(Date data) {
        System.out.println("Vistoria agendada para o cliente " + cliente.getNome() + " na data: " + data);
    }
}
