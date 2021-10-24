/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorial;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego Almeida
 */
public class Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número"));
    
        int resultado = fatorial(numero);
   JOptionPane.showMessageDialog(null, "O resultado é " + resultado);
    
    
    }
   
    public static int fatorial(int numero){
        if(numero == 0){
            return 1;
        }
        int fatorial = 1;
        while (numero > 1){
            fatorial = fatorial * numero;
            numero = numero - 1;
        }
        return fatorial;
    }
    
    
    
}
