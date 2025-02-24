/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetochallenge;

/**
 *
 * @author gui
 */
public class VisaoComputacional {
    
    // Método para identificar a peça a partir da imagem
    public String identificarPeca(String imagem) {
        System.out.println("Identificando peça pela imagem: " + imagem);

        if (imagem.contains("engrenagem")) {
            return "Engrenagem";
        } else if (imagem.contains("parafuso")) {
            return "Parafuso";
        } else {
            return "Peça desconhecida";
        }
    }
}
