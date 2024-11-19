/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author gui
 */
public class Consumo {
    private int ID_Consumo;
    private Date Data;
    private float Consumo;

    public Consumo(int ID_Consumo, Date Data, float Consumo) {
        this.ID_Consumo = ID_Consumo;
        this.Data = Data;
        this.Consumo = Consumo;
    }

    public void registrarConsumo(float valor) {
        this.Consumo = valor;
        System.out.println("Consumo registrado: " + valor + " watts.");
    }

    // Getters e Setters
    public int getID_Consumo() {
        return ID_Consumo;
    }

    public void setID_Consumo(int ID_Consumo) {
        this.ID_Consumo = ID_Consumo;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public float getConsumo() {
        return Consumo;
    }

    public void setConsumo(float Consumo) {
        this.Consumo = Consumo;
    }
}
