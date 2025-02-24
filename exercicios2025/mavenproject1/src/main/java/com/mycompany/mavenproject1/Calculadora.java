/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author gui
 */
public class Calculadora {
        public static final double interest_rate = 0.05;
        public int anos =0;
        
        
        
        public static double  calculajuros(double valor, int anos){
   return   valor * Math.pow(1+ interest_rate, anos);
        
    }
}

