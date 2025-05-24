package com.mavenproject1;

import javax.swing.JOptionPane;

public class QuantidadeDeAgua {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Digite seu peso (ex: 75.5):");
        
            double peso = Double.parseDouble(input);
        
            double agua = 35;
        
            double quantidade = peso * agua;
        
        JOptionPane.showMessageDialog(null,"A quantidade de agua que você deve tomar é: "+ quantidade);
        
    }
}
