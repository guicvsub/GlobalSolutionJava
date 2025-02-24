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

public class Alerta extends Base{
    private int ID_Alerta;
    private String Tipo_de_Alerta;
    private String Descricao;
    private Date Data;
    private String Status;

    // Construtor da classe
    public Alerta(int ID_Alerta, String Tipo_de_Alerta, String Descricao, Date Data, String Status) {
        this.ID_Alerta = ID_Alerta;
        this.Tipo_de_Alerta = Tipo_de_Alerta;
        this.Descricao = Descricao;
        this.Data = Data;
        this.Status = Status;
    }

    // Getters e Setters
    public int getID_Alerta() {
        return ID_Alerta;
    }

    public void setID_Alerta(int ID_Alerta) {
        this.ID_Alerta = ID_Alerta;
    }

    public String getTipo_de_Alerta() {
        return Tipo_de_Alerta;
    }

    public void setTipo_de_Alerta(String Tipo_de_Alerta) {
        this.Tipo_de_Alerta = Tipo_de_Alerta;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    // Método para exibir as informações do alerta
    public String gerarResumo() {
        return "Alerta ID: " + ID_Alerta + "\nTipo: " + Tipo_de_Alerta + "\nDescrição: " + Descricao
                + "\nData: " + Data + "\nStatus: " + Status;
    }
}
