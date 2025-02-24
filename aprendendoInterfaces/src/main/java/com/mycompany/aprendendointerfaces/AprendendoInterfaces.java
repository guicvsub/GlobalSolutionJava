/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aprendendointerfaces;

import com.mycompany.aprendendointerfaces.interfaces.Ipagamentos;

/**
 *
 * @author gui
 */
public class AprendendoInterfaces {

    public static void main(String[] args) {

          Ipagamentos pagamento = new Boleto();
            pagamento.processarpagamento(250.00);
               Ipagamentos Pixpagamento = new Pix();
            pagamento.processarpagamento(99.00);
            
                 Ipagamentos pagamentocard = new CartaoDeCredito();
            pagamentocard.processarpagamento(150.00);
            
          
    }
   
}
