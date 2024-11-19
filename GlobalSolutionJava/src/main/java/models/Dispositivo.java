/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author gui
 */
import java.util.Date;

public class Dispositivo extends Base {
    private String enderecoMAC;
    private String tipo;
    private String marca;
    private String modelo;
    private boolean status; // true para ligado, false para desligado
    private float consumoAtual; // em watts

    // Construtor
    public Dispositivo(String enderecoMAC, String tipo, String marca, String modelo, boolean status, float consumoAtual) {
        this.enderecoMAC = enderecoMAC;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.status = status;
        this.consumoAtual = consumoAtual;
    }

    // Getters e Setters
    public String getEnderecoMAC() {
        return enderecoMAC;
    }

    public void setEnderecoMAC(String enderecoMAC) {
        this.enderecoMAC = enderecoMAC;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getConsumoAtual() {
        return consumoAtual;
    }

    public void setConsumoAtual(float consumoAtual) {
        this.consumoAtual = consumoAtual;
    }

    // Métodos adicionais
    public void ligar() {
        if (!status) {
            status = true;
            System.out.println("Dispositivo " + modelo + " ligado.");
        } else {
            System.out.println("Dispositivo " + modelo + " já está ligado.");
        }
    }

    public void desligar() {
        if (status) {
            status = false;
            System.out.println("Dispositivo " + modelo + " desligado.");
        } else {
            System.out.println("Dispositivo " + modelo + " já está desligado.");
        }
    }

    public float monitorarConsumo() {
        System.out.println("Consumo atual do dispositivo " + modelo + ": " + consumoAtual + "W.");
        return consumoAtual;
    }

    // Sobrecarga dos métodos da classe Base
    @Override
    public void salvar() {
        System.out.println("Dispositivo " + modelo + " salvo com sucesso.");
    }

    @Override
    public void atualizar() {
        System.out.println("Dispositivo " + modelo + " atualizado com sucesso.");
    }

    @Override
    public void deletar() {
        System.out.println("Dispositivo " + modelo + " deletado com sucesso.");
    }

    // Método toString para exibição dos dados do dispositivo
    @Override
    public String toString() {
        return "Dispositivo{" +
                "enderecoMAC='" + enderecoMAC + '\'' +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", status=" + (status ? "Ligado" : "Desligado") +
                ", consumoAtual=" + consumoAtual +
                '}';
    }
}
