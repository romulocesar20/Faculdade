package Calculadora.view;

import Calculadora.model.Calculadora;
import javax.swing.*;
import java.awt.*;

public class Main {
       public static void main(String [] args){
           
  
        Calculadora Propriedades_Calculadora = new Calculadora();
            // Define o tamanho da tela   
            Propriedades_Calculadora.setSize(255,330);
            // Fecha a janela   
            Propriedades_Calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Torna a janela visível   
            Propriedades_Calculadora.setVisible(true);
            // Desabilita o maximizar   
            Propriedades_Calculadora.setResizable(false);
            // Abre a janela no meio da tela   
            Propriedades_Calculadora.setLocationRelativeTo(null);
    }
    
}
