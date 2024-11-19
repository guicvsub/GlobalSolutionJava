/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author gui
 */


import java.util.ArrayList;
import java.util.List;

public class Categoria extends Base {
    private int idCategoria;
    private String nomeCategoria;
    private List<Dispositivo> dispositivos;

    // Construtor
    public Categoria(int idCategoria, String nomeCategoria) {
        this.idCategoria = idCategoria;
        this.nomeCategoria = nomeCategoria;
        this.dispositivos = new ArrayList<>();
    }

    // Getters e Setters
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    // Métodos específicos
    public void adicionarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
        System.out.println("Dispositivo \"" + dispositivo.getModelo() + "\" adicionado à categoria \"" + nomeCategoria + "\".");
    }

    public void listarDispositivos() {
        if (dispositivos.isEmpty()) {
            System.out.println("Nenhum dispositivo registrado na categoria \"" + nomeCategoria + "\".");
        } else {
            System.out.println("Dispositivos na categoria \"" + nomeCategoria + "\":");
            for (Dispositivo dispositivo : dispositivos) {
                System.out.println("- " + dispositivo);
            }
        }
    }

    // Métodos herdados da classe Base
    @Override
    public void salvar() {
        System.out.println("Categoria \"" + nomeCategoria + "\" salva com sucesso!");
    }

    @Override
    public void atualizar() {
        System.out.println("Categoria \"" + nomeCategoria + "\" atualizada com sucesso!");
    }

    @Override
    public void deletar() {
        System.out.println("Categoria \"" + nomeCategoria + "\" deletada com sucesso!");
    }

    // Método toString para exibir informações da categoria
    @Override
    public String toString() {
        return "Categoria{" +
                "idCategoria=" + idCategoria +
                ", nomeCategoria='" + nomeCategoria + '\'' +
                ", dispositivos=" + dispositivos.size() + " dispositivos" +
                '}';
    }
}
