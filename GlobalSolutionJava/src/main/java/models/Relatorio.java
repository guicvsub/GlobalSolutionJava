/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gui
 */

    public class Relatorio extends Base{
    private int ID_Relatorio;
    private Date Data;
    private String Tipo;
    private String Descricao;
    private ArrayList<Consumo> consumos;

    // Construtor
    public Relatorio(int ID_Relatorio, Date Data, String Tipo, String Descricao) {
        this.ID_Relatorio = ID_Relatorio;
        this.Data = Data;
        this.Tipo = Tipo;
        this.Descricao = Descricao;
        this.consumos = new ArrayList<>();
    }

    // Método para gerar resumo do relatório
    public String gerarResumo() {
        return "Relatório ID: " + ID_Relatorio + "\n" +
               "Data: " + Data.toString() + "\n" +
               "Tipo: " + Tipo + "\n" +
               "Descrição: " + Descricao;
    }

    
    public void adicionarConsumo(Consumo consumo) {
        this.consumos.add(consumo);
    }

    // Getters e Setters
    public int getID_Relatorio() {
        return ID_Relatorio;
    }

    public void setID_Relatorio(int ID_Relatorio) {
        this.ID_Relatorio = ID_Relatorio;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public ArrayList<Consumo> getConsumos() {
        return consumos;
    }
    
}
