package br.com.calculator;

import javax.swing.*;

public class Calculadora {
     void receberDados() {
        String numeroDeValores = JOptionPane.showInputDialog(null, "Com quantos numeros você deseja operar?");
        int numeroDeValoresConvertido = Integer.parseInt(numeroDeValores);
        int[] valores = new int[numeroDeValoresConvertido];
    }
}
