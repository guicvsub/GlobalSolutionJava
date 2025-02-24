/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aprendendointerfaces;

import com.mycompany.aprendendointerfaces.interfaces.Ipagamentos;

/**
 *
 * @author gui
 */
public class Pix  implements Ipagamentos{

    @Override
    public void processarpagamento(double valor) {
             System.out.println("pagamento no valor de "+ valor+"feito via pix");
    }
    
}
